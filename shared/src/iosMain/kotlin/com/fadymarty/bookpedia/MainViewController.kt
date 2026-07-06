package com.fadymarty.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.fadymarty.bookpedia.app.App
import com.fadymarty.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }