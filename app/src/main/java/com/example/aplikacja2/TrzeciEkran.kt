package com.example.aplikacja2
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun TrzeciEkran(navController: NavHostController) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(150.dp)
        ) {
            Text("Wykład na 7:30 to Barbarzyństwo")

            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = { navController.navigate("pierwszy_ekran") }) {
                    Text("Pierwszy Ekran")
                }
                Button(onClick = { navController.navigate("drugi_ekran") }) {
                    Text("Drugi Ekran")
                }
            }
        }
    }
}