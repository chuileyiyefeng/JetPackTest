package com.example.rico.jetpacktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.onNavDestinationSelected
import kotlinx.android.synthetic.main.activity_home.*

/**
 * Created by Tmp on 2020/1/14.
 */
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
    }

    private fun initView() {
        bottom_navigation.setOnNavigationItemReselectedListener {
            
        }
    }
}