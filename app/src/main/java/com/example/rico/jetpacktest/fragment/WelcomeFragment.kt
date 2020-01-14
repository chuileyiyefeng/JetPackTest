package com.example.rico.jetpacktest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.navOptions
import com.example.rico.jetpacktest.R
import kotlinx.android.synthetic.main.fragment_welcome.*

/**
 * Created by Tmp on 2020/1/9.
 */
class WelcomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_login.setOnClickListener {
            val navOption = navOptions {
                anim {
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
            }
            val bundle=Bundle();
            bundle.putString("test","test")
            Navigation.findNavController(it).navigate(R.id.action_login,bundle,navOption)
        }
        tv_register.setOnClickListener {
            val navOption = navOptions {
                anim {
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
            }
            val bundle=Bundle();
            bundle.putString("test","test")
            Navigation.findNavController(it).navigate(R.id.action_register,bundle,navOption)
        }
    }
}