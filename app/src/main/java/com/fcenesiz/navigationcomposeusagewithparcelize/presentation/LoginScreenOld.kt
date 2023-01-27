package com.fcenesiz.navigationcomposeusagewithparcelize.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun LoginScreenOld(
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
    ) {
        Text(text = "Login Screen")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate(
                    Screen.ProfileScreen.withArgs(
                        "fatih",
                        "userid",
                        "123456789"
                    )
                )
            }
        ) {
            Text(text = "Go to Profile Screen")
        }
    }
}