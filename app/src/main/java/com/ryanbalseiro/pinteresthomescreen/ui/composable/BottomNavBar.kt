package com.ryanbalseiro.pinteresthomescreen.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.ryanbalseiro.pinteresthomescreen.R
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomNavBar() {
    Card(shape = CutCornerShape(1.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                onClick = {},
                modifier = Modifier.wrapContentWidth(),
                shape = CutCornerShape(1.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.background(Color.Black)
                    ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_home),
                        contentDescription = "Home",
                        tint = Color.Gray
                    )
                    Text(text = "Home", color = Color.Gray)
                }
            }
            Card(
                onClick = {},
                modifier = Modifier.wrapContentWidth()
                    .background(Color.Black),
                shape = CutCornerShape(1.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.background(Color.Black)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_search),
                        contentDescription = "Search",
                        tint = Color.Gray
                    )
                    Text(text = "Search", color = Color.Gray)
                }
            }
            Card(
                onClick = {},
                modifier = Modifier.wrapContentWidth()
                    .background(Color.Black),
                shape = CutCornerShape(1.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.background(Color.Black)
                    ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_add),
                        contentDescription = "Create",
                        tint = Color.Gray
                    )
                    Text(text = "Create", color = Color.Gray)
                }
            }
            Card(
                onClick = {},
                modifier = Modifier.wrapContentWidth(),
                shape = CutCornerShape(1.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.background(Color.Black)
                    ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_notification),
                        contentDescription = "Notifications",
                        tint = Color.Gray
                    )
                    Text(text = "Notifications", color = Color.Gray)
                }
            }
            Card(
                onClick = {},
                modifier = Modifier.wrapContentWidth(),
                shape = CutCornerShape(1.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.background(Color.Black)
                    ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_profile),
                        contentDescription = "Profile",
                        tint = Color.Gray
                    )
                    Text(text = "Profile", color = Color.Gray)
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewBottomNavigationBar() {
    BottomNavBar()
}