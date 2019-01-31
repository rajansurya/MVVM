package com.example.rajan.kotlintutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

open class MainActivity  {

 var x:Boolean=false
    get() = ArrayList<String>().size == 0


    inline fun inlineFunctionExample(myfunction: () -> Unit) {

    }
}
open class A {
    open fun f() { print("A") }
    fun a() { print("a") }
}

interface B {
    fun f() { print("B") } // interface members are 'open' by default
    fun b() { print("b") }
}

class C() :A(),  B {
    // The compiler requires f() to be overridden:
    override fun f() {
         // call to A.f()
        super<B>.f() // call to B.f()
    }
}

interface AA {
    fun foo() { print("A") }
    fun bar()
}

interface BB {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class CC : AA {
    override fun bar() { print("bar") }
}

class D : AA, BB {
    override fun foo() {
        super<AA>.foo()
        super<BB>.foo()
    }

    override fun bar() {
        //super<BB>.bar()
    }
}
