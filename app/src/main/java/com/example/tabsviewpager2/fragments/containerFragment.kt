package com.example.tabsviewpager2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.tabsviewpager2.R
import com.example.tabsviewpager2.adapters.ViewPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class containerFragment : Fragment() {

    lateinit var view_container : View
    lateinit var viewPager : ViewPager2
    lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view_container = inflater.inflate(R.layout.fragment_container, container, false)
        tabLayout = view_container.findViewById(R.id.tabLayout)
        viewPager = view_container.findViewById(R.id.viewPager2)
        return view_container
    }

    override fun onStart() {
        super.onStart()
        viewPager.setAdapter(ViewPageAdapter(requireActivity()))

        TabLayoutMediator(tabLayout, viewPager, TabLayoutMediator.TabConfigurationStrategy { tab, position ->
            when (position) {
                0 -> { tab.text = "Tab #1"
                       tab.setIcon(R.drawable.ic_launcher_background) }
                1 -> { tab.text = "Tab #2" }
                2 -> tab.text = "Tab #3"
                else -> tab.text = "undefined"
            }
        }).attach()
    }

}