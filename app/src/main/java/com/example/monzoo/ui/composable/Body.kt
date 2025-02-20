package com.example.monzoo.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.monzoo.data.DataModel

@Composable
fun Body(paddingValues: PaddingValues) {
    LazyVerticalGrid(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(8.dp),
        columns = GridCells.Fixed(2),
        content = {
            items(DataModel().allAnimals()) { animal ->
                AnimalView(animal = animal)
            }
        }
    )

}