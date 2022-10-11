package com.example.bucketlist2

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface TaskDAO {
@Insert
suspend fun insert(t:Task)

@Delete
suspend fun delete(t:Task)

@Update
suspend fun update(t:Task)
}