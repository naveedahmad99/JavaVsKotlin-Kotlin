package com.android.kotlinproject

import android.support.v7.app.AppCompatActivity

/**
 * Created by naveedahmad on 01/12/2017.
 */
open class BaseActivity: AppCompatActivity() {
    var someString: String? = null

    fun getLayout():Int{
        return 1
    }
}