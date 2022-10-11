package com.example.bucketlist2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class Task
    (@PrimaryKey(autoGenerate = true)
     val taskId: Long = 0L,

     @ColumnInfo(name="Name")
     var taskName:String = "",

     @ColumnInfo(name = "IsDone")
     var isDone:Boolean = false)