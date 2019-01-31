package com.journaldev.androidmvvmbasics.viewmodels

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.example.rajan.kotlintutorial.BR
import com.journaldev.androidmvvmbasics.model.User

/**
 * Created by RAJAN on 1/31/2019.
 */
class LoginViewModelObserver : BaseObservable() {
    lateinit var user: User
    var successMessage: String = "Login was successful"
    var errorMessage: String = "Email or Password not valid"

    init {
        user = User("", "")
    }

    @Bindable
    var toastMessage: String = ""

    fun getToastMessageShow(): String {
        return toastMessage
    }

    fun setToastMessageShow(valu: String) {
        toastMessage = valu
        notifyPropertyChanged(BR.toastMessage)

    }

    fun afterEmailTextChanged(char: CharSequence) {
        user.mEmail = char.toString()

    }

    fun afterPasswordTextChanged(char: CharSequence) {
        user.mPassword = char.toString()
    }

    fun onLoginClicked() {
        if (user.isInputDataValid()) {
            setToastMessageShow(successMessage)
        } else {
            setToastMessageShow(errorMessage)
        }
    }
}