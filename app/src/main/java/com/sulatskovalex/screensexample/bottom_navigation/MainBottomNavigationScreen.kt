package com.sulatskovalex.screensexample.bottom_navigation

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.sulatskovalex.screens.PagerScreen
import com.sulatskovalex.screensexample.NAV_PAGE_SCREEN_FIRST
import com.sulatskovalex.screensexample.NAV_PAGE_SCREEN_SECOND
import com.sulatskovalex.screensexample.NAV_PAGE_SCREEN_THIRD
import com.sulatskovalex.screensexample.R
import kotlinx.android.synthetic.main.screen_nav_main.view.*

class MainBottomNavigationScreen(presenter: MainBottomNavigationPresenter,
                                 override val screenTag: String)
  : PagerScreen<MainBottomNavigationScreen, MainBottomNavigationPresenter, Unit>(presenter) {

  override val screenTags: Array<String> =
      arrayOf(NAV_PAGE_SCREEN_FIRST, NAV_PAGE_SCREEN_SECOND, NAV_PAGE_SCREEN_THIRD)
  override val firstScreenTag: String = NAV_PAGE_SCREEN_FIRST
  override val canScrollHorizontally: Boolean = true

  override fun createViewWithRecycler(inflater: LayoutInflater, parent: ViewGroup): View {
    val view = inflater.inflate(R.layout.screen_nav_main, parent, false)

    view.bottomNavigationView.setOnNavigationItemSelectedListener {
      when (it.itemId) {
        R.id.navigation_first  -> {
          presenter.onFirstPageClick()
          return@setOnNavigationItemSelectedListener true
        }
        R.id.navigation_second -> {
          presenter.onSecondPageClick()
          return@setOnNavigationItemSelectedListener true
        }
        R.id.navigation_third  -> {
          presenter.onThirdPageClick()
          return@setOnNavigationItemSelectedListener true
        }
      }
      false
    }
    return view
  }

  override fun recycler(createdView: View): RecyclerView {
    return createdView.pager_list
  }

  fun setSelectedItem(position: Int) {
    view.bottomNavigationView.selectedItemId = when (position) {
      1    -> R.id.navigation_second
      2    -> R.id.navigation_third
      else -> R.id.navigation_first
    }
  }
}
