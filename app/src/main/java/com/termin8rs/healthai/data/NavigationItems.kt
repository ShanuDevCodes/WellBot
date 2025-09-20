package com.termin8rs.healthai.data

import androidx.compose.ui.graphics.vector.ImageVector
import com.termin8rs.healthai.R

data class NavigationItem(
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val destination:Destination
)

val homeUiDestinations = listOf(
    NavigationItem(
        title = "Health AI",
        selectedIcon = R.drawable.bot_icon_filled,
        unselectedIcon = R.drawable.bot_icons,
        destination = Destination.HEALTHAI
    ),
    NavigationItem(
        title = "Prevention Hub",
        selectedIcon = R.drawable.shield_filled,
        unselectedIcon = R.drawable.shield,
        destination = Destination.PREVENTIONHUB
    ),
    NavigationItem(
        title = "Symptom Checker",
        selectedIcon = R.drawable.health_line,
        unselectedIcon = R.drawable.health_line,
        destination = Destination.SYMPTOMCHECKER
    ),
    NavigationItem(
        title = "Vaccination Center",
        selectedIcon = R.drawable.heart_filled,
        unselectedIcon = R.drawable.heart,
        destination = Destination.VACCINATIONCENTER
    ),
    NavigationItem(
        title = "Profile",
        selectedIcon = R.drawable.account_filled,
        unselectedIcon = R.drawable.account,
        destination = Destination.PROFILE
    )
)
