package com.example.monzoo.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.monzoo.model.Animal


@Composable
fun AnimalView(animal: Animal) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 7.dp),
        shape = RoundedCornerShape(percent = 10)
    ) {
        Column() {
            Image(
                painter = painterResource(id = animal.image),
                contentDescription = animal.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height((LocalConfiguration.current.screenWidthDp / 2).dp)
            )
            Text(
                text = animal.name,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, bottom = 5.dp)
            )
        }
        
    }
}