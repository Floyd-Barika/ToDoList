package com.example.bucketlist2

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TaskViewModel:ViewModel() {
var tL:MutableList<Task> = mutableListOf()

    fun insert(t:Task, adapter: TaskAdapter){
        viewModelScope.launch {
            adapter.taskList.add(t)
            adapter.notifyItemInserted(adapter.taskList.size - 1)
            tL = adapter.taskList
        }
    }
}