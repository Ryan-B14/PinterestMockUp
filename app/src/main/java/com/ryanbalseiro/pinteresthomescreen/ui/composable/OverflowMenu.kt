package com.ryanbalseiro.pinteresthomescreen.ui.composable

import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.ryanbalseiro.pinteresthomescreen.R

@Composable
fun OverflowMenu(){
    var expanded by remember { mutableStateOf(false) }

    IconButton(onClick = {expanded = true}) {
        Icon(tint = Color.White,
            painter = painterResource(id = R.drawable.baseline_more_horiz_24),
            contentDescription = "Share Menu")
    }

    DropdownMenu(expanded = expanded, onDismissRequest = {expanded = false}) {
        DropdownMenuItem(onClick = { /*handle logic*/ },
            text = { Text("Menu Item 1") })
        DropdownMenuItem(onClick = { /*handle logic*/ },
            text = { Text("Menu Item 2") })
        DropdownMenuItem(onClick = { /*handle logic*/ },
            text = { Text("Menu Item 3") })
    }

}