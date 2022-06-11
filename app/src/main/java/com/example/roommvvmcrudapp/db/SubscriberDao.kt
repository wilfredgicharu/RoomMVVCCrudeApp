package com.example.roommvvmcrudapp.db

import androidx.room.*
import java.util.concurrent.Flow

@Dao
interface SubscriberDao {
    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber): Long

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber): Int

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber): Int

    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAll(): Int

    @Query("SELECT *FROM subscriber_data_table")
    fun getAllSubscribers(): List<Subscriber>
}