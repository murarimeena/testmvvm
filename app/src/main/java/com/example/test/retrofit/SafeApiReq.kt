package com.example.test.retrofit

import com.example.test.util.APIException
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Response

abstract class SafeApiReq {

    suspend fun <T : Any> apiReq(call: suspend () -> Response<T>): T {

        val response = call.invoke()
        if (response.isSuccessful) {
            return response.body()!!
        } else {
            val error = response.errorBody()?.toString()
            val msg = StringBuilder()
            error?.let {
                try {
                    msg.append(JSONObject(it).getString("message"))
                } catch (e: JSONException) {
                }
                msg.append("\n")
            }
            msg.append("Error code: ${response.code()}")
            throw APIException(msg.toString())
        }

    }
}