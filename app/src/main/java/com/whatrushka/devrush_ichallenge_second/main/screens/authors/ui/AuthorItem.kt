package com.whatrushka.devrush_ichallenge_second.main.screens.authors.ui

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.whatrushka.devrush_ichallenge_second.main.data.models.Author

@Composable
fun AuthorItem(author: Author, onClick: (Author) -> Unit) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(15.dp))
        .clickable(onClick= { onClick(author) })
    ) {
        Row {
            Image(
                painter = painterResource(author.image),
                contentDescription = "${author.name} image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(300.dp)
                    .width(180.dp)
                    .clip(RoundedCornerShape(15.dp))
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp, 0.dp)
            ) {
                Spacer(
                    modifier = Modifier
                        .height(8.dp)
                        .fillMaxWidth()
                )
                Text(
                    text = author.name,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                )
                Text(
                    text = author.bio,
                    maxLines = 9,
                    modifier = Modifier.fillMaxHeight()
                )
            }
        }
    }
}