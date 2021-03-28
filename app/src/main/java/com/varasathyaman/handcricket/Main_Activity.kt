package com.varasathyaman.handcricket

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast

class Main_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main_)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    fun onlinePlay(view: View) {
        Toast.makeText(this,"Online Play is under counstruction", Toast.LENGTH_SHORT).show()
    }
    fun offlinePlay(view: View) {
        val intent : Intent = Intent(this,OfflinePlay::class.java)
        startActivity(intent)
    }
}