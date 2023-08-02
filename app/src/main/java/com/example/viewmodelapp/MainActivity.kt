package com.example.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mybinding:ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mybinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        mybinding.txtTitle.text = viewModel.getCurrentCounterValue().toString()
        mybinding.apply {
            btnIncrease.setOnClickListener {
                 viewModel.getCurrentCounterValue()
                txtTitle.text = viewModel.updatedCounter().toString()
            }
        }

    }
}