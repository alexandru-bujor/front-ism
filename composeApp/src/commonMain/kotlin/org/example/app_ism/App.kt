package org.example.app_ism
import org.example.app_ism.ui.screens.main.MainScreen
import cafe.adriel.voyager.navigator.Navigator
import androidx.compose.runtime.*

@Composable
fun App() {
    Navigator(MainScreen())
}

