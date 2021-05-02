package com.example.test.repository

import com.example.test.db.AppDatabase
import com.example.test.model.DataModel
import com.example.test.retrofit.ApiInterface
import com.example.test.retrofit.SafeApiReq

class MainActivityRepository(
    private val myApi: ApiInterface,
    private val db: AppDatabase
) : SafeApiReq() {

    suspend fun getServiceApiCall(): DataModel {
        return apiReq { myApi.getServices() }
    }

}