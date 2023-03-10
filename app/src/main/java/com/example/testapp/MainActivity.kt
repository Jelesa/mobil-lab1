package com.example.testapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("App", "MainActivity \"onCreate()\" called")
    }

    override fun onStart() {
        super.onStart()
        Log.w("App", "MainActivity \"onStart()\" called")
    }

    override fun onResume() {
        super.onResume()
        Log.w("App", "MainActivity \"onResume()\" called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("App", "MainActivity \"onRestart()\" called")
    }

    override fun onPause() {
        super.onPause()
        Log.w("App", "MainActivity \"onPause()\" called")
    }

    override fun onStop() {
        super.onStop()
        Log.w("App", "MainActivity \"onStop()\" called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("App", "MainActivity \"onDestroy()\" called")
    }

    fun onClick(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun goToBrowse(view: View) {
        val intent = Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
}