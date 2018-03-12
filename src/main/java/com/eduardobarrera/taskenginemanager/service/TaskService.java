package com.eduardobarrera.taskenginemanager.service;

import java.util.List;

import com.eduardobarrera.taskenginemanager.model.TaskModel;

public interface TaskService {
	
	
	public abstract List<TaskModel> getAllTasks();
	public abstract TaskModel insertTask(TaskModel taskModel);
	public abstract TaskModel searchTaskById(int taskId);
	public abstract boolean deleteTaskById(int taskId);

}
