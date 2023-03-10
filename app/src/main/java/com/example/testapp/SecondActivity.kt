package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.w("App", "SecondActivity \"onCreate()\" called")
    }

    override fun onStart() {
        super.onStart()
        Log.w("App", "SecondActivity \"onStart()\" called")
    }

    override fun onResume() {
        super.onResume()
        Log.w("App", "SecondActivity \"onResume()\" called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("App", "SecondActivity \"onRestart()\" called")
    }

    override fun onPause() {
        super.onPause()
        Log.w("App", "SecondActivity \"onPause()\" called")
    }

    override fun onStop() {
        super.onStop()
        Log.w("App", "SecondActivity \"onStop()\" called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("App", "SecondActivity \"onDestroy()\" called")
    }
}