package com.example.rico.jetpacktest.fragment.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.navOptions
import com.example.rico.jetpacktest.HomeActivity
import com.example.rico.jetpacktest.R
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * Created by Tmp on 2020/1/8.
 */
class LoginFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_login.setOnClickListener(this)
        ll_back.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_login -> {
                activity?.startActivity(Intent(activity, HomeActivity::class.java))
            }
            R.id.ll_back -> {
                Navigation.findNavController(ll_back).navigateUp()
            }
        }
    }
}