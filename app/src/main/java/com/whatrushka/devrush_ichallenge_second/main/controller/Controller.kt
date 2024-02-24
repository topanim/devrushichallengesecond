package com.whatrushka.devrush_ichallenge_second.main.controller

import android.util.Log
import com.whatrushka.devrush_ichallenge_second.main.data.models.Author
import com.whatrushka.devrush_ichallenge_second.main.data.source

object Controller {
    fun search(q: String): List<Author> {
        if (q.isEmpty()) return source
        return source
            .filter { it.name.contains(q, ignoreCase = true) }
            .sortedBy { it.name.length }
    }
}