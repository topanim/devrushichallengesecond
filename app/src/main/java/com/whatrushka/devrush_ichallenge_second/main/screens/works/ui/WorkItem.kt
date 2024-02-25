package com.whatrushka.devrush_ichallenge_second.main.screens.works.ui

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.whatrushka.devrush_ichallenge_second.main.data.models.Work

@Composable
fun WorkItem(work: Work, onClick: (Work) -> Unit) {
    Column(
        modifier = Modifier
            .width(230.dp)
            .padding(8.dp)
            .clickable { onClick(work) }
    ) {
        Image(painter = painterResource(id = work.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(250.dp)
                .clip(RoundedCornerShape(15.dp))
            )
        Text(text = work.title,
            style = TextStyle(
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp
            )
        )
        Text(text = work.desc)
    }
}