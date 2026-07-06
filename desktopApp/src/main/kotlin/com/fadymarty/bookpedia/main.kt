package com.fadymarty.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.fadymarty.bookpedia.app.App
import com.fadymarty.bookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Bookpedia",
        ) {
            App()
        }
    }
}