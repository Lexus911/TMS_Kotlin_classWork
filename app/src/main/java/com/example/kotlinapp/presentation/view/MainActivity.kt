package com.example.kotlinapp.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinapp.R
import com.example.kotlinapp.presentation.view.dataBinding.LoginFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.activity_container, LoginFragment())
        fragmentTransaction.commit()
    }
}