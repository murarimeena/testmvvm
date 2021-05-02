package com.example.test.retrofit

import com.example.test.model.DataModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("services")
    suspend fun getServices(): Response<DataModel>

}