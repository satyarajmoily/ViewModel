package com.satyaraj.viewmodel.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satyaraj.viewmodel.data.SimpleRepository

class SimpleViewModel : ViewModel() {

    /**
     * Avoid creating instance inside any class.
     * Use Dependency injection to create instances
     * Just to keep this ViewModel simple I haven't used any Dependency injection
     *
     * People who aren't aware of lazy keyword used
     * It's a keyword used in Kotlin just to avoid initialization of a variable
     * until it's not been accessed.
     */
    private val repository by lazy { SimpleRepository() }

    private val displayString: MutableLiveData<String> by lazy {
        MutableLiveData<String>().also {
            it.postValue(repository.getSimpleString())
        }
    }

    fun getDisplayString(): LiveData<String> = displayString
}