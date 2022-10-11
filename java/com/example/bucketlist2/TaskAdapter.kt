package com.example.bucketlist2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class TaskAdapter() : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {
var taskList:MutableList<Task> = mutableListOf()

    inner class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener{
        val checkBox = view.findViewById<CheckBox>(R.id.checkbox)
        val textview = view.findViewById<TextView>(R.id.text_view_task)

        init {
            view.isClickable = true
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.task_recycler_view, parent, false))
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.textview.text = task.taskName
        holder.checkBox.isChecked = task.isDone
    }

    override fun getItemCount(): Int = taskList.size
}