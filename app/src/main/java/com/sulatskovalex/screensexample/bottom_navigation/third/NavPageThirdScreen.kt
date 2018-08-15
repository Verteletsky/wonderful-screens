package com.sulatskovalex.screensexample.bottom_navigation.third

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.sulatskovalex.screens.Screen
import com.sulatskovalex.screensexample.R

class NavPageThirdScreen(presenter: NavPageThirdPresenter, override val screenTag: String)
  : Screen<NavPageThirdScreen, NavPageThirdPresenter, Unit>(presenter) {
  override fun createView(inflater: LayoutInflater, parent: ViewGroup): View {
    return inflater.inflate(R.layout.screen_nav_page_third, parent, false)
  }
}