package com.example.tabsviewpager2.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tabsviewpager2.fragments.Fragment1
import com.example.tabsviewpager2.fragments.Fragment2
import com.example.tabsviewpager2.fragments.Fragment3

class ViewPageAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){

    companion object{
        private const val TAB_COUNT = 3
    }

    override fun getItemCount(): Int {
        return TAB_COUNT
    }

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0 -> Fragment1()
            1 -> Fragment2()
            3 -> Fragment3()
            else -> Fragment1()
        }
    }

}