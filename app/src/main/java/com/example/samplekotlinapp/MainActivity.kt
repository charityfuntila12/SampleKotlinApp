package com.example.samplekotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.util.EnumSet.range

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("hello", "hello World")

        var language = arrayOf("Ruby", "Koltin", "Python" ,"Java")
        var language2 = arrayOf(1,2,3,4,5)
        for (item in language)
            Log.d("hello", " $item")
//        for (item in language.indices)
//            Log.d("hello", "" + item)
        var i = -5

        while (i <= 0) {
            Log.d("hello","Line $i")
            ++i
        }
    }

    fun hello(v:View):Int{
        var a = 12
        for (i in 1..5) {
            Log.d("hello", ""+i)
        }
        Log.d("hello", "button pressed!")
        return a
    }

}
