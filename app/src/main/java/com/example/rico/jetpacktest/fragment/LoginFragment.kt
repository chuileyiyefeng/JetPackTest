package com.example.rico.jetpacktest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.navOptions
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
    private val navOption = navOptions {
        anim {
            enter = R.anim.slide_in_right
            exit = R.anim.slide_out_left
            popEnter = R.anim.slide_in_left
            popExit = R.anim.slide_out_right
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_login -> {
                val bundle = Bundle();
                bundle.putString("test", "test")
                Navigation.findNavController(tv_login).navigate(R.id.action_register, bundle, navOption)
            }
            R.id.ll_back -> {
                Navigation.findNavController(ll_back).navigateUp()
            }
        }
    }
}