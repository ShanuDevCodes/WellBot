package com.termin8rs.healthai.ui.screens.prevention_hub

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.FloatingActionButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.termin8rs.healthai.R

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PreventionHub(){
    Surface {
        Scaffold(
            contentWindowInsets = WindowInsets(0),
            topBar = {
                Row(
                    modifier = Modifier
                        .padding(
                            top = WindowInsets.statusBars.asPaddingValues().calculateTopPadding(),
                            start = 12.dp,
                            end = 12.dp
                        )
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Prevention Hub",
                        color = MaterialTheme.colorScheme.tertiary,
                        style = MaterialTheme.typography.displayMediumEmphasized
                    )
                }
            },
            containerColor = MaterialTheme.colorScheme.surfaceDim
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ){
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    item{
                        Spacer(modifier = Modifier.height(WindowInsets.statusBars.asPaddingValues().calculateTopPadding() + 62.dp))
                    }
                    item {
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.surfaceContainer
                            )
                        ) {
                            Box(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Column {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Icon(
                                            painter = painterResource(R.drawable.sun),
                                            contentDescription = "Sun",
                                            tint = MaterialTheme.colorScheme.primary
                                        )
                                        Spacer(Modifier.width(8.dp))
                                        Text(
                                            text = "Personal Hygiene",
                                            style = MaterialTheme.typography.titleLargeEmphasized,
                                            color = MaterialTheme.colorScheme.primary
                                        )
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Wash hands frequently with soap for 20+ seconds",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Use alcohol-based hand sanitizer when soap unavailable",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Cover mouth and nose when coughing or sneezing",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Avoid touching face with unwashed hands",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Keep fingernails short and clean",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    ExtendedFloatingActionButton(
                                        text = {
                                            Text(
                                                text = "Ask AI",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        },
                                        icon = {
                                            Icon(
                                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                                contentDescription = "Go"
                                            )
                                        },
                                        onClick = {  },
                                        expanded = true,
                                        modifier = Modifier.align(Alignment.End),
                                        elevation = FloatingActionButtonDefaults.elevation(
                                            defaultElevation = 0.dp,
                                        ),
                                        containerColor = MaterialTheme.colorScheme.secondaryContainer
                                    )
                                }
                            }
                        }
                    }
                    item {
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.surfaceContainer
                            )
                        ) {
                            Box(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Column {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Icon(
                                            painter = painterResource(R.drawable.utensils),
                                            contentDescription = "Utensil",
                                            tint = MaterialTheme.colorScheme.primary
                                        )
                                        Spacer(Modifier.width(8.dp))
                                        Text(
                                            text = "Nutrition & Diet",
                                            style = MaterialTheme.typography.titleLargeEmphasized,
                                            color = MaterialTheme.colorScheme.primary
                                        )
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Eat a balanced diet rich in fruits and vegetables",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Drink at least 8 glasses of clean water daily",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Limit processed foods and excessive sugar",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Include protein sources in every meal",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Maintain regular meal timings",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    ExtendedFloatingActionButton(
                                        text = {
                                            Text(
                                                text = "Ask AI",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        },
                                        icon = {
                                            Icon(
                                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                                contentDescription = "Go"
                                            )
                                        },
                                        onClick = {  },
                                        expanded = true,
                                        modifier = Modifier.align(Alignment.End),
                                        elevation = FloatingActionButtonDefaults.elevation(
                                            defaultElevation = 0.dp,
                                        ),
                                        containerColor = MaterialTheme.colorScheme.secondaryContainer
                                    )
                                }
                            }
                        }
                    }
                    item {
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.surfaceContainer
                            )
                        ) {
                            Box(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Column {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Icon(
                                            painter = painterResource(R.drawable.health_line),
                                            contentDescription = "Health Line",
                                            tint = MaterialTheme.colorScheme.primary,
                                            modifier = Modifier.size(24.dp)
                                        )
                                        Spacer(Modifier.width(8.dp))
                                        Text(
                                            text = "Physical Activity",
                                            style = MaterialTheme.typography.titleLargeEmphasized,
                                            color = MaterialTheme.colorScheme.primary
                                        )
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Exercise for at least 30 minutes daily",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Take regular walks and use stairs",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Practice yoga or stretching exercises",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Maintain good posture while working",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Limit sedentary screen time",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    ExtendedFloatingActionButton(
                                        text = {
                                            Text(
                                                text = "Ask AI",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        },
                                        icon = {
                                            Icon(
                                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                                contentDescription = "Go"
                                            )
                                        },
                                        onClick = {  },
                                        expanded = true,
                                        modifier = Modifier.align(Alignment.End),
                                        elevation = FloatingActionButtonDefaults.elevation(
                                            defaultElevation = 0.dp,
                                        ),
                                        containerColor = MaterialTheme.colorScheme.secondaryContainer
                                    )
                                }
                            }
                        }
                    }
                    item {
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.surfaceContainer
                            )
                        ) {
                            Box(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Column {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Icon(
                                            painter = painterResource(R.drawable.wind),
                                            contentDescription = "Sun",
                                            tint = MaterialTheme.colorScheme.primary
                                        )
                                        Spacer(Modifier.width(8.dp))
                                        Text(
                                            text = "Environmental Health",
                                            style = MaterialTheme.typography.titleLargeEmphasized,
                                            color = MaterialTheme.colorScheme.primary
                                        )
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Ensure proper ventilation in living spaces",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Keep surroundings clean and dry",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Dispose of garbage properly",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Eliminate standing water to prevent mosquito breeding",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                                        )
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .padding(16.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.circle_check_big),
                                                contentDescription = "Check",
                                                tint = Color(0xFF3AAB3A)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = "Use air purifiers in polluted areas",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        }
                                    }
                                    Spacer(Modifier.height(8.dp))
                                    ExtendedFloatingActionButton(
                                        text = {
                                            Text(
                                                text = "Ask AI",
                                                style = MaterialTheme.typography.bodyMediumEmphasized,
                                                color = MaterialTheme.colorScheme.onSecondaryContainer
                                            )
                                        },
                                        icon = {
                                            Icon(
                                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                                contentDescription = "Go"
                                            )
                                        },
                                        onClick = {  },
                                        expanded = true,
                                        modifier = Modifier.align(Alignment.End),
                                        elevation = FloatingActionButtonDefaults.elevation(
                                            defaultElevation = 0.dp,
                                        ),
                                        containerColor = MaterialTheme.colorScheme.secondaryContainer
                                    )
                                }
                            }
                        }
                    }
                    item{
                        Spacer(Modifier.height(WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding() + 74.dp))
                    }
                }
            }
        }
    }
}