package com.whatrushka.devrush_ichallenge_second.main.controller

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Recomposer
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.whatrushka.devrush_ichallenge_second.main.data.models.Author
import com.whatrushka.devrush_ichallenge_second.main.data.source

object Controller {
    val model = source

    var selected: Author? = null
    val state: MutableState<Boolean> = mutableStateOf(false)

    fun select(author: Author) {
        state.value = true
        selected = author
    }

    fun unselect() {
        state.value = true
        selected = null
    }

    fun search(q: String): List<Author> {
        if (q.isEmpty()) return model
        return model
            .filter {
                it.name.contains(q, ignoreCase = true) ||
                it.works.any { work -> work.title.contains(q) }
            }.sortedBy { it.name.length }
    }
}