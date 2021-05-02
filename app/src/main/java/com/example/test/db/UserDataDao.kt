package com.example.test.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.test.db.entities.Userdetails

@Dao
interface UserDataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: Userdetails): Long

    @Query("SELECT u.* FROM userdetails u")
    fun getUser(): LiveData<Userdetails>

}