package com.example.aplikacja2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.aplikacja2.ui.theme.Aplikacja2Theme
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
         Nawigacja()
        }
    }
}

@Composable
fun Nawigacja(){
    val navController = rememberNavController()

    MaterialTheme {
        NavHost(navController = navController, startDestination = "pierwszy_ekran") {
            composable("pierwszy_ekran") { PierwszyEkran(navController) }
            composable("drugi_ekran") { DrugiEkran(navController) }
            composable("trzeci_ekran") { TrzeciEkran(navController) }
        }
    }
}

