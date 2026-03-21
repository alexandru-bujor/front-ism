package org.example.app_ism.ui.screens.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import cafe.adriel.voyager.core.screen.Screen
import app_ism.composeapp.generated.resources.Res
import app_ism.composeapp.generated.resources.compose_multiplatform
import org.example.app_ism.Greeting

class MainScreen : Screen {

    @Composable
    override fun Content() {
        MaterialTheme {

            Text("Hello World")

        }
    }
}