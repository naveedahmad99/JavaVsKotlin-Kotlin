package com.android.kotlinproject

import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        printLog("Start Loop Time: ")

        button.setOnClickListener({
            printLog("Starting Loop Time: ")
            for (i in 1..100){
                print("$i")
            }
            printLog("Ending Loop Time: ")
        })
    }

    private fun getFormattedTime(format:String):String {
        return SimpleDateFormat(format, Locale.getDefault()).format(Calendar.getInstance().time)
    }

    private fun printLog(tag:String){
        Log.d(tag, "" + Calendar.getInstance().timeInMillis)
    }
}
