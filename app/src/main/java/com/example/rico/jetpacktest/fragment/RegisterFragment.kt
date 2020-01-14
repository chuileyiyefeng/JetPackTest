package com.example.rico.jetpacktest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.rico.jetpacktest.R
import kotlinx.android.synthetic.main.fragment_register.*

/**
 * Created by Tmp on 2020/1/9.
 */
class RegisterFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_register.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }
        ll_back.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }
    }
}