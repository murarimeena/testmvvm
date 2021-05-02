package com.example.test.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test.model.DataModel
import com.example.test.repository.MainActivityRepository

class MainActivityViewModel(private val repository: MainActivityRepository) : ViewModel() {

    private lateinit var serviceLiveData: MutableLiveData<DataModel>

    suspend fun getUser(): LiveData<DataModel>? {
        serviceLiveData.value = repository.getServiceApiCall()
        return serviceLiveData
    }
}