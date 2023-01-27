package com.fcenesiz.navigationcomposeusagewithparcelize

import androidx.compose.runtime.Composable
import com.fcenesiz.navigationcomposeusagewithparcelize.presentation.NavGraphs
import com.ramcosta.composedestinations.DestinationsNavHost

@Composable
fun Navigation() {
    DestinationsNavHost(navGraph = NavGraphs.root)
}