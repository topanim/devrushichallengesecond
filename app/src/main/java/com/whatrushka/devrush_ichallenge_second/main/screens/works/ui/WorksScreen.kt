package com.whatrushka.devrush_ichallenge_second.main.screens.works.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.whatrushka.devrush_ichallenge_second.main.controller.Controller
import com.whatrushka.devrush_ichallenge_second.main.data.models.Author
import com.whatrushka.devrush_ichallenge_second.main.data.models.Work
import java.util.Stack


@Composable
fun WorksScreen(navController: NavController) {
    val author = Controller.selected!!
    var selectedPicture = remember {
        mutableStateOf<Int?>(null)
    }
    val scrollState = rememberScrollState()
    val openImage = { work: Work ->
        selectedPicture.value = work.image
    }

    selectedPicture.value?.let {
        Image(painter = painterResource(id = it),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .padding(0.dp, 30.dp)
                .zIndex(2f)
                .clickable { selectedPicture.value = null }
            )
    }

    Column(
        modifier = Modifier.scrollable(scrollState, orientation = Orientation.Vertical)
    ) {
        AuthorInfoBlock(author = author)
        Text(text = "Pictures",
            style = TextStyle(
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp
            ),
            modifier = Modifier.padding(8.dp)
        )
        LazyRow {
            items(author.works.size, { author.works[it].image }) {
                WorkItem(author.works[it], openImage)
            }
        }

    }
}

@Composable
fun AuthorInfoBlock(author: Author) {
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = author.image),
                contentDescription = "${author.name} image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
                    .clip(RoundedCornerShape(15.dp))
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = author.name,
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 24.sp
                )
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = author.bio)
    }
}