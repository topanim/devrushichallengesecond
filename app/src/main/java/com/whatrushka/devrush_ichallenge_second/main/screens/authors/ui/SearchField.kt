package com.whatrushka.devrush_ichallenge_second.main.screens.authors.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.whatrushka.devrush_ichallenge_second.main.data.models.Author
import com.whatrushka.devrush_ichallenge_second.main.screens.authors.logic.updateResults

@Composable
fun SearchField(search: (String) -> List<Author>, data: MutableList<Author>) {
    var text = remember {
        mutableStateOf("")
    }

    val onChange = { q: String ->
        text.value = q

        updateResults(
            search(q),
            state = data
        )
    }



    OutlinedTextField(
        value = text.value,
        onValueChange = onChange,
        maxLines = 1,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    )
}