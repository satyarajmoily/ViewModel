package com.satyaraj.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.satyaraj.viewmodel.ui.main.SimpleFragment

class SimpleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SimpleFragment.newInstance())
                .commitNow()
        }
    }
}