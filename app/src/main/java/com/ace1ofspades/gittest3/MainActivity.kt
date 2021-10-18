package com.ace1ofspades.gittest3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ace1ofspades.testlib.Alert

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Alert.showMessage(this)
    }
}