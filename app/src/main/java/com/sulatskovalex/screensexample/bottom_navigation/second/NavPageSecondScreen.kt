package com.sulatskovalex.screensexample.bottom_navigation.second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.sulatskovalex.screens.Screen
import com.sulatskovalex.screensexample.R

class NavPageSecondScreen(presenter: NavPageSecondPresenter, override val screenTag: String)
    : Screen<NavPageSecondScreen, NavPageSecondPresenter, Unit>(presenter) {
    override fun createView(inflater: LayoutInflater, parent: ViewGroup): View {
        return inflater.inflate(R.layout.screen_nav_page_second, parent, false)
    }
}