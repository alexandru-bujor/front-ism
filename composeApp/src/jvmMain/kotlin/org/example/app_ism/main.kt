package org.example.app_ism

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "app_ism",
    ) {
        App()
    }
}