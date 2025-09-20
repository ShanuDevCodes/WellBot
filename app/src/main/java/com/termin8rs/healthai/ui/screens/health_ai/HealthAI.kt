package com.termin8rs.healthai.ui.screens.health_ai

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachFile
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.model.content.CircleShape
import com.termin8rs.healthai.R

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HealthAssistant(){
    var textField by remember { mutableStateOf("") }
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
                        text = "WELLBOT",
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
                    .padding(horizontal = 16.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(
                        bottom = WindowInsets.navigationBars.asPaddingValues()
                            .calculateBottomPadding() + 74.dp
                        )
                ) {
                    IconButton(
                        onClick = {},
                        modifier = Modifier.size(56.dp),
                        colors = IconButtonColors(
                            containerColor = MaterialTheme.colorScheme.surfaceContainerHigh,
                            contentColor = MaterialTheme.colorScheme.primary,
                            disabledContainerColor = MaterialTheme.colorScheme.surfaceContainerHigh,
                            disabledContentColor = MaterialTheme.colorScheme.secondary
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Default.AttachFile,
                            contentDescription = "Search",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = textField,
                        onValueChange = {
                            textField = it
                        },
                        shape = CircleShape,
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = MaterialTheme.colorScheme.surfaceContainerHigh,
                            unfocusedContainerColor = MaterialTheme.colorScheme.surfaceContainerHigh,
                            disabledContainerColor = MaterialTheme.colorScheme.surfaceContainerHigh,
                            focusedIndicatorColor = MaterialTheme.colorScheme.surfaceContainerHigh,
                            unfocusedIndicatorColor = MaterialTheme.colorScheme.surfaceContainerHigh,
                        ),
                        trailingIcon = {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                IconButton(
                                    onClick = {},
                                    modifier = Modifier
                                        .size(32.dp),
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Mic,
                                        contentDescription = "Voice Search",
                                        tint = MaterialTheme.colorScheme.primary
                                    )
                                }
                                Spacer(Modifier.width(2.dp))
                                IconButton(
                                    onClick = {},
                                    modifier = Modifier
                                        .size(42.dp),
                                    colors = IconButtonColors(
                                        containerColor = MaterialTheme.colorScheme.surfaceContainerLowest,
                                        contentColor = MaterialTheme.colorScheme.primary,
                                        disabledContainerColor = MaterialTheme.colorScheme.surfaceContainerHighest,
                                        disabledContentColor = MaterialTheme.colorScheme.secondary
                                    ),
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = "Search",
                                        tint = MaterialTheme.colorScheme.primary
                                    )
                                }
                                Spacer(Modifier.width(8.dp))
                            }
                        },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
            if (textField.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.bot_icons),
                            contentDescription = "Search",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(75.dp)
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = "Try Asking:",
                            style = MaterialTheme.typography.headlineMedium,
                            color = MaterialTheme.colorScheme.onSurface,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(Modifier.height(4.dp))
                        Row {
                            Card(
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent,
                                ),
                                border = CardDefaults.outlinedCardBorder(),
                                onClick = {
                                    textField = "What are the symptoms of malaria?"
                                },
                                shape = CircleShape
                            ) {
                                Text(
                                    text = "What are the symptoms of malaria?",
                                    style = MaterialTheme.typography.bodyMediumEmphasized,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                        Spacer(Modifier.height(4.dp))
                        Row {
                            Card(
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent,
                                ),
                                border = CardDefaults.outlinedCardBorder(),
                                onClick = {
                                    textField = "When is my next polio vaccination due?"
                                },
                                shape = CircleShape
                            ) {
                                Text(
                                    text = "When is my next polio vaccination due?",
                                    style = MaterialTheme.typography.bodyMediumEmphasized,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                        Spacer(Modifier.height(4.dp))
                        Row {
                            Card(
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent,
                                ),
                                border = CardDefaults.outlinedCardBorder(),
                                onClick = {
                                    textField = "Give me preventive measures for seasonal flu"
                                },
                                shape = CircleShape
                            ) {
                                Text(
                                    text = "Give me preventive measures for seasonal flu",
                                    style = MaterialTheme.typography.bodyMediumEmphasized,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                        Spacer(Modifier.height(4.dp))
                        Row {
                            Card(
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent,
                                ),
                                border = CardDefaults.outlinedCardBorder(),
                                onClick = {
                                    textField = "Show outbreak alerts near me"
                                },
                                shape = CircleShape
                            ) {
                                Text(
                                    text = "Show outbreak alerts near me",
                                    style = MaterialTheme.typography.bodyMediumEmphasized,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}