package com.junfan.androidtext.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.junfan.androidtext.Fragments.InfoFragment
import com.junfan.androidtext.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, InfoFragment()).commit()
    }
}