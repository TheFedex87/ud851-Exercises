package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

// TODO (5) Make this class extend ViewModel
public class AddTaskViewModel extends ViewModel {

    // TODO (6) Add a task member variable for the TaskEntry object wrapped in a LiveData
    private LiveData<TaskEntry> taskEntry;

    // TODO (8) Create a constructor where you call loadTaskById of the taskDao to initialize the tasks variable
    // Note: The constructor should receive the database and the taskId

    public AddTaskViewModel(AppDatabase db, int taskId) {
        taskEntry = db.taskDao().loadTaskById(taskId);
    }

    // TODO (7) Create a getter for the task variable
    public LiveData<TaskEntry> getTaskEntry() {
        return taskEntry;
    }
}
