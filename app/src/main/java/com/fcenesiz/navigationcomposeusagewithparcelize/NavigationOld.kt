package com.fcenesiz.navigationcomposeusagewithparcelize

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.fcenesiz.navigationcomposeusagewithparcelize.presentation.*

@Composable
fun NavigationOld() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route
    ) {
        composable(
            route = Screen.LoginScreen.route
        ) {
            LoginScreenOld(navController = navController)
        }
        composable(
            route = Screen.ProfileScreen.route + "/{name}/{userId}/{timestamp}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                },
                navArgument("userId") {
                    type = NavType.StringType
                },
                navArgument("timestamp") {
                    type = NavType.LongType
                },
            )
        ) { entry ->
            val name = entry.arguments?.getString("name")!!
            val userId = entry.arguments?.getString("userId")!!
            val timestamp = entry.arguments?.getLong("timestamp")!!

            ProfileScreenOld(
                navController = navController,
                name = name,
                userId = userId,
                timestamp = timestamp
            )
        }
        composable(
            route = Screen.PostScreen.route + "/{showOnlyPostByUser}",
            arguments = listOf(
                navArgument("showOnlyPostByUser") {
                    type = NavType.BoolType
                    defaultValue = false
                }
            )
        ) { entry ->
            val showOnlyPostByUser = entry.arguments?.getBoolean("showOnlyPostByUser")
                    ?: false
            PostScreen(showOnlyPostByUser = showOnlyPostByUser)
        }
    }
}