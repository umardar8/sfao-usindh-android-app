package pk.edu.usindh.sfaoaccess.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import pk.edu.usindh.sfaoaccess.fragments.ScholarshipsFragment
import pk.edu.usindh.sfaoaccess.fragments.DonorsFragment
import pk.edu.usindh.sfaoaccess.fragments.HomeFragment

internal class Adapter(var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                HomeFragment()
            }
            1 -> {
                ScholarshipsFragment()
            }
            2 -> {
                DonorsFragment()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }

}