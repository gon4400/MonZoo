package com.example.monzoo.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.monzoo.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar() {
    TopAppBar(
        title = { Text(text = "Mon Zoo")},
        navigationIcon = { Image(
            painter = painterResource(id = R.drawable.iconapp),
            contentDescription = null,
            modifier = Modifier.padding(5.dp))
        }
    )
}