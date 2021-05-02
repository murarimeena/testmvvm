package com.example.test.view

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.test.R
import com.example.test.databinding.ActivityMainBinding
import com.example.test.db.AppDatabase
import com.example.test.repository.MainActivityRepository
import com.example.test.retrofit.RetrofitClient
import com.example.test.viewmodel.MainActivityViewModel
import com.example.test.viewmodel.MainActivityViewModelFactory
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    lateinit var context: Context
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        context = this

        val api = RetrofitClient.apiInterface
        val db = AppDatabase(context)
        val repository = MainActivityRepository(api, db)
        val factory = MainActivityViewModelFactory(repository)

        viewModel = ViewModelProvider(this, factory).get(MainActivityViewModel::class.java)

        Coroutines.main {
            viewModel.getUser()?.observe(this, Observer { data ->
                run {
                    data?.run {
                        Timber.tag("DEBUG").d(data.message)
                    }

                }
            })
        }
    }
}