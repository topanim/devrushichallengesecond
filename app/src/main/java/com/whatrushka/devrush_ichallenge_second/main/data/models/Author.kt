package com.whatrushka.devrush_ichallenge_second.main.data.models

data class Author(
    val name: String,
    val image: Int,
    val bio: String,
    val works: List<Work>
)
