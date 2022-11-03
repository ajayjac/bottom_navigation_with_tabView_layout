package com.example.oct26test1_lap.ui.home

import android.graphics.pdf.PdfDocument
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.oct26test1_lap.R
import com.example.oct26test1_lap.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private val tabHeadingArray = arrayOf(
        "Pending",
        "Ongoing",
        "Finished"
    )


    lateinit var viewpager: ViewPager2
    lateinit var tabLayout: TabLayout


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        viewpager = view.findViewById(R.id.viewPager2)
        tabLayout = view.findViewById(R.id.tabLayout)


        val adapter =ViewPagerAdapter(childFragmentManager,lifecycle)
        viewpager.adapter = adapter

        TabLayoutMediator(tabLayout, viewpager) { tab, position ->
            tab.text = tabHeadingArray[position]
        }.attach()


    }





    override fun onDestroyView() {
        super.onDestroyView()
       // _binding = null
    }
}