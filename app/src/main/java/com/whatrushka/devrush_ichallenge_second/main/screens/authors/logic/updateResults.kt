package com.whatrushka.devrush_ichallenge_second.main.screens.authors.logic

import android.util.Log
import com.whatrushka.devrush_ichallenge_second.main.data.models.Author

fun updateResults(res: List<Author>, state: MutableList<Author>) {
    state.clear()
    state.addAll(res)
}