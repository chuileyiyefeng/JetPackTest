package com.example.rico.jetpacktest

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.rico.jetpacktest.fragment.home.HomeFragment
import com.example.rico.jetpacktest.fragment.home.InfoFragment
import com.example.rico.jetpacktest.fragment.home.MeFragment
import kotlinx.android.synthetic.main.home_bottom.*

/**
 * Created by Tmp on 2020/1/14.
 */
class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private val homeFragment: HomeFragment = HomeFragment()
    private val infoFragment: InfoFragment = InfoFragment()
    private val mineFragment: MeFragment = MeFragment()
    private var fragments = arrayListOf<Fragment>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        showFragment(supportFragmentManager.beginTransaction(), homeFragment)
        ll_home.setOnClickListener(this)
        ll_info.setOnClickListener(this)
        ll_mine.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        when (v.id) {
            R.id.ll_home -> {
                showFragment(transaction, homeFragment)
            }
            R.id.ll_info -> {
                showFragment(transaction, infoFragment)
            }
            R.id.ll_mine -> {
                showFragment(transaction, mineFragment)
            }
        }
    }

    private fun showFragment(transaction: FragmentTransaction, fragment: Fragment) {
        fragments.forEach {
            transaction.hide(it)
        }
        if (!fragments.contains(fragment)) {
            transaction.add(R.id.frame, fragment)
            fragments.add(fragment)
        }
        transaction.show(fragment)
        transaction.commit()
    }
}