package com.ryanbalseiro.pinteresthomescreen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ryanbalseiro.pinteresthomescreen.ui.composable.BottomNavBar
import com.ryanbalseiro.pinteresthomescreen.ui.composable.HomeScreen
import com.ryanbalseiro.pinteresthomescreen.ui.theme.PinterestHomeScreenTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PinterestHomeScreenTheme {
                Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
                    Scaffold(modifier = Modifier.align(Alignment.TopCenter)) {
                        HomeScreen()
                    }
                    Row(modifier = Modifier.align(Alignment.BottomCenter)) {
                        BottomNavBar()
                    }
                }
            }
        }
    }
}