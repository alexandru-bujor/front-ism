package org.example.app_ism.ui.screens.main
import org.example.app_ism.ui.screens.auth.AuthScreen
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import org.example.app_ism.ui.screens.home.HomeScreen

class MainScreen : Screen {

    @Composable
    override fun Content() {
        MaterialTheme {
            Navigator(HomeScreen)
        }
    }
}