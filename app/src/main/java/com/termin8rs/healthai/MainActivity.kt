package com.termin8rs.healthai

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.termin8rs.healthai.data.DataStoreManager
import com.termin8rs.healthai.ui.screens.MainUI
import com.termin8rs.healthai.ui.screens.onboarding.OnBoardingScreen
import com.termin8rs.healthai.ui.theme.HealthAITheme
import com.termin8rs.healthai.viewmodel.MainUIViewmodel
import kotlinx.coroutines.flow.first

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val mainUIViewmodel: MainUIViewmodel = viewModel()
            val navController = rememberNavController()
            val dataStore = DataStoreManager(applicationContext)
            var splashScreenCondition by remember() {  mutableStateOf(false) }
            LaunchedEffect(Unit) {
                val onBoardingComplete = dataStore.isOnboardingComplete.first()
                val isFirstLaunch = dataStore.isLoginComplete.first()
                if (!onBoardingComplete){
                    startActivity(Intent(this@MainActivity, OnboardingActivity::class.java)
                        .putExtra("showGuestSignup",true)
                        .apply {
                            addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        }
                    )
                    finish()
                    splashScreenCondition = false
                }else if(!isFirstLaunch) {
                    startActivity(Intent(this@MainActivity, AuthenticationActivity::class.java)
                        .apply {
                            addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        }
                    )
                    finish()
                    splashScreenCondition = false
                }else{
                    splashScreenCondition = false
                }
            }
            splashScreen.setKeepOnScreenCondition{splashScreenCondition}
            HealthAITheme {
                MainUI(
                    rootNavController = navController,
                    viewModel = mainUIViewmodel
                )
            }
        }
    }
}