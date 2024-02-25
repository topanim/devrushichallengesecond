package com.whatrushka.devrush_ichallenge_second.main.screens.authors.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.whatrushka.devrush_ichallenge_second.main.Route
import com.whatrushka.devrush_ichallenge_second.main.controller.Controller
import com.whatrushka.devrush_ichallenge_second.main.controller.Controller.model
import com.whatrushka.devrush_ichallenge_second.main.controller.Controller.search
import com.whatrushka.devrush_ichallenge_second.main.data.models.Author


@Composable
fun AuthorsScreen(navController: NavController) {
    var data = remember {
        model.toMutableStateList()
    }

    val onSelect = {author: Author ->
        Controller.select(author)
        navController.navigate(Route.Works.name)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        SearchField(::search, data)
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(data.size, { i -> data[i].image }) {
                AuthorItem(author = data[it], onClick = onSelect)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}