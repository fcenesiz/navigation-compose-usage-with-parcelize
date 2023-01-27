package com.fcenesiz.navigationcomposeusagewithparcelize.presentation

sealed class Screen(val route: String) {

    object LoginScreen : Screen("login_screen")
    object ProfileScreen : Screen("profile_screen")
    object PostScreen : Screen("post_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
