package com.example.tablayoutclasswork
//
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout) as TabLayout
        val tab1 = findViewById<TabItem>(R.id.Tab1)
        val tab2 = findViewById<TabItem>(R.id.Tab2)
        val tab3 = findViewById<TabItem>(R.id.Tab3)
        val viewPager = findViewById<ViewPager>(R.id.viewPager) as ViewPager

        var adapter = TabAdapter(supportFragmentManager)
        adapter!!.addFragment(Tab1(), "1st Tab")
        adapter!!.addFragment(Tab2(), "2nd Tab")
        adapter!!.addFragment(Tab3(), "3rd Tab")
        viewPager!!.adapter = adapter
        tabLayout!!.setupWithViewPager(viewPager)
    }
}