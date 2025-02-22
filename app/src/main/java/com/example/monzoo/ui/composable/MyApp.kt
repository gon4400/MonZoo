package com.example.monzoo.ui.composable

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    Scaffold(
        topBar = { AppBar() },
        content = { paddingValues -> Body(paddingValues) }
    )
}