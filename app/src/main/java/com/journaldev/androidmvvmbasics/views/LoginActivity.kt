package com.journaldev.androidmvvmbasics.views

import android.app.Activity
import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.rajan.kotlintutorial.R
import com.example.rajan.kotlintutorial.databinding.LoginViewBinding
import com.journaldev.androidmvvmbasics.viewmodels.LoginViewModelObserver

/**
 * Created by RAJAN on 1/31/2019.
 */
class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var loginview: LoginViewBinding = DataBindingUtil.setContentView(this, R.layout.login_view)
        loginview.viewModel = LoginViewModelObserver()
        loginview.executePendingBindings()
    }

    companion object {
        @BindingAdapter("bind:toastMessage")
        @JvmStatic
        fun runMe(view: View, message: String) {
            if (message != null)
                Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();

        }
    }

}