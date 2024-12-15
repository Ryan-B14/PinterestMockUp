package com.ryanbalseiro.pinteresthomescreen.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ryanbalseiro.pinteresthomescreen.R
import kotlin.random.Random

@Composable
fun ExampleCard(random: Int) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val halfScreenWidth = screenWidth/2
    Card(modifier = Modifier
        .padding(vertical = 4.dp, horizontal = 2.dp)
        .width(halfScreenWidth)
        ) {
        Column(
            modifier = Modifier
                .background(color = colorResource(R.color.black))

        ) {
            Image(
                painter = painterResource(GetImageID(random)),
                null,
                contentScale = ContentScale.Inside,
                modifier = Modifier.widthIn(max = 200.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                OverflowMenu()
            }
        }
    }
}

fun GetImageID(random: Int): Int {
    when(random){
        1 -> {return R.drawable.winter_wallpaper}
        2 -> {return R.drawable.sample}
        3 -> {return R.drawable.sample2}
        4 -> {return R.drawable.sample3}
        else -> {return R.drawable.winter_wallpaper}
    }
}

@Preview
@Composable
fun ExampleCardPreview() {
    ExampleCard(Random.nextInt(1,5))
}