package com.ryanbalseiro.pinteresthomescreen.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlin.random.Random

@Composable
fun HomeFeed(modifier: Modifier) {
    LazyColumn(modifier = modifier
        .fillMaxSize()
        .background(Color.Black)) {

        val itemsList = List(100) { "Item ${it + 1}" }

        items(itemsList.chunked(2)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ExampleCard(Random.nextInt(1,5))
                ExampleCard(Random.nextInt(1,5))
            }
        }
    }
}

@Preview
@Composable
fun HomeFeedPreview() {
    HomeFeed(Modifier)
}