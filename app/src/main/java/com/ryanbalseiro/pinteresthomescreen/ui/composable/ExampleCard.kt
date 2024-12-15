package com.ryanbalseiro.pinteresthomescreen.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ryanbalseiro.pinteresthomescreen.R

@Composable
fun ExampleCard() {
    Card {
        Column(modifier = Modifier.background(color = colorResource(R.color.black))) {
            Image(painter = painterResource(R.drawable.winter_wallpaper), null)
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End) {
                OverflowMenu()
            }

        }
    }
}

@Preview
@Composable
fun ExampleCardPreview(){
    ExampleCard()
}