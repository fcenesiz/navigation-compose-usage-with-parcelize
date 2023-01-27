package com.fcenesiz.navigationcomposeusagewithparcelize.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.fcenesiz.navigationcomposeusagewithparcelize.data.User
import com.ramcosta.composedestinations.annotation.Destination
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId


@Composable
fun ProfileScreenOld(
    navController: NavController,
    name: String,
    userId: String,
    timestamp: Long
) {

    val user = remember {
        User(
            name = name,
            id = userId,
            created = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()
            )
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Profile Screen: $user",
            textAlign = TextAlign.Center
        )
        Button(
            onClick = {
                navController.navigate(Screen.PostScreen.withArgs("true"))
            }
        ) {
            Text(text = "Go to Post Screen")
        }
    }

}