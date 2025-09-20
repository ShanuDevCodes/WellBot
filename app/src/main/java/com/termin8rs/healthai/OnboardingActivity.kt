package com.termin8rs.healthai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.termin8rs.healthai.ui.screens.onboarding.OnBoardingScreen
import com.termin8rs.healthai.ui.theme.HealthAITheme

class OnboardingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HealthAITheme {
                OnBoardingScreen()
            }
        }
    }
}