package com.sulatskovalex.screensexample.bottom_navigation

import com.github.sulatskovalex.screens.PagerPresenter
import com.github.sulatskovalex.screens.Router
import com.github.sulatskovalex.screens.Screen
import com.sulatskovalex.screensexample.NAV_PAGE_SCREEN_FIRST
import com.sulatskovalex.screensexample.NAV_PAGE_SCREEN_SECOND
import com.sulatskovalex.screensexample.NAV_PAGE_SCREEN_THIRD

class MainBottomNavigationPresenter(router: Router)
  : PagerPresenter<MainBottomNavigationPresenter, MainBottomNavigationScreen, Unit>(router) {

  fun onFirstPageClick() {
    openTab(NAV_PAGE_SCREEN_FIRST)
  }

  fun onSecondPageClick() {
    openTab(NAV_PAGE_SCREEN_SECOND)
  }

  fun onThirdPageClick() {
    openTab(NAV_PAGE_SCREEN_THIRD)
  }

  /**
   * При переключении на следующий скрин, должен сработать OnScreenResumed и
   * выделить позицию в BottomNavigationView
   */
  override fun onScreenResumed(position: Int, screen: Screen<*, *, *>) {
    view.setSelectedItem(position)
  }
}