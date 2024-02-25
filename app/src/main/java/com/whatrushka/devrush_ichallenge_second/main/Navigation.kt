package com.whatrushka.devrush_ichallenge_second.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.whatrushka.devrush_ichallenge_second.main.data.models.Author
import com.whatrushka.devrush_ichallenge_second.main.screens.authors.ui.AuthorsScreen
import com.whatrushka.devrush_ichallenge_second.main.screens.works.ui.WorksScreen


sealed class Route(val name: String) {
    data object Authors : Route("author")
    data object Works : Route("works")
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Route.Authors.name) {
        composable(route = Route.Authors.name) {
            AuthorsScreen(navController = navController)
        }
        
        composable(route = Route.Works.name) {
            WorksScreen(navController = navController)
        }
    }

}