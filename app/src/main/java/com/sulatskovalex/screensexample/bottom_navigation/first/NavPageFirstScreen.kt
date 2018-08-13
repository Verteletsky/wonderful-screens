package com.sulatskovalex.screensexample.bottom_navigation.first

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.sulatskovalex.screens.Screen
import com.sulatskovalex.screensexample.R

class NavPageFirstScreen(presenter: NavPageFirstPresenter, override val screenTag: String) : Screen<NavPageFirstScreen, NavPageFirstPresenter, Unit>(presenter) {
    override fun createView(inflater: LayoutInflater, parent: ViewGroup): View {
        return inflater.inflate(R.layout.screen_nav_page_first, parent, false)
    }
}