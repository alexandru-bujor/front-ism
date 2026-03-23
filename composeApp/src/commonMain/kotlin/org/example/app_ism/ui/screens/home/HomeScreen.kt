package org.example.app_ism.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.example.app_ism.ui.screens.auth.AuthScreen
import org.example.app_ism.ui.screens.auth.RegisterScreen

object HomeScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(
                    text = "Welcome to ISM",
                    style = MaterialTheme.typography.headlineMedium
                )

                Button(
                    onClick = { navigator.replace(AuthScreen) },
                    modifier = Modifier.fillMaxWidth(0.6f)
                ) {
                    Text("Login")
                }

                Button(
                    onClick = { navigator.replace(RegisterScreen) },
                    modifier = Modifier.fillMaxWidth(0.6f)
                ) {
                    Text("Register")
                }
            }
        }
    }
}