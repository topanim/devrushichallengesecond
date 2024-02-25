package com.whatrushka.devrush_ichallenge_second.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.whatrushka.devrush_ichallenge_second.main.data.source
import com.whatrushka.devrush_ichallenge_second.main.screens.authors.ui.AuthorsScreen
import com.whatrushka.devrush_ichallenge_second.ui.theme.DevrushichallengesecondTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevrushichallengesecondTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigation()
                }
            }
        }
    }
}