package com.example.ruraldictionary.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ruraldictionary.FavouriteFragment
import com.example.ruraldictionary.HomeFragment

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(
    fragmentManager,
    FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            else ->
                return FavouriteFragment()

        }

    }

    override fun getCount(): Int {
        return 2
    }

    
}