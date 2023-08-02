package com.example.viewmodelapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel :ViewModel() {
    private var counter = 0

    fun getCurrentCounterValue():Int{
        return counter
    }
    fun updatedCounter():Int{
        return ++counter
    }

}