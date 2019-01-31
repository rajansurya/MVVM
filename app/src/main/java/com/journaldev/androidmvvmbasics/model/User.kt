package com.journaldev.androidmvvmbasics.model

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

/**
 * Created by RAJAN on 1/31/2019.
 */
data class User(var mEmail:String, var mPassword:String){
fun isInputDataValid():Boolean{
    return !TextUtils.isEmpty(mEmail) && Patterns.EMAIL_ADDRESS.matcher(mEmail).matches() && mPassword.length>5
}
}