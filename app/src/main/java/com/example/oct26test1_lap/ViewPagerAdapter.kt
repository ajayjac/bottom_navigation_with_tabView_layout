package com.example.oct26test1_lap

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.oct26test1_lap.tabfragments.FinishedFragment
import com.example.oct26test1_lap.tabfragments.OngoingFragment
import com.example.oct26test1_lap.tabfragments.PendingFragment


private const val NUM_TABS = 3

public class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
        FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return PendingFragment()
            1 -> return OngoingFragment()
            2 -> return FinishedFragment()
            else -> return  PendingFragment()
        }

    }
}