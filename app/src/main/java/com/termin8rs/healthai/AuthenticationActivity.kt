package com.termin8rs.healthai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.termin8rs.healthai.ui.screens.authentication.LoginScreen
import com.termin8rs.healthai.ui.screens.authentication.SignupScreen
import com.termin8rs.healthai.ui.theme.HealthAITheme

class AuthenticationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val showGuestSignup = intent.getBooleanExtra("showGuestSignup", true)
            val navController = rememberNavController()
            HealthAITheme {
                NavHost(
                    navController = navController,
                    startDestination = "login"
                ){
                    composable("login"){
                        LoginScreen(
                            showGuestSignup = showGuestSignup,
                            onSignupClick = {
                                navController.navigate("signup"){
                                    popUpTo(0) { inclusive = true }
                                }
                            }
                        )
                    }
                    composable("signup") {
                        SignupScreen(
                            showGuestSignup = showGuestSignup,
                            onLoginClick = {
                                navController.navigate("login"){
                                    popUpTo(0) { inclusive = true }
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}