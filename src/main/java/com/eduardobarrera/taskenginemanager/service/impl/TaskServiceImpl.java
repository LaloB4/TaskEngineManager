package com.eduardobarrera.taskenginemanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eduardobarrera.taskenginemanager.model.TaskModel;
import com.eduardobarrera.taskenginemanager.repository.TaskRepository;
import com.eduardobarrera.taskenginemanager.service.TaskService;

@Service("taskServiceImpl")
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	@Qualifier("taskRepository")
	private TaskRepository taskRepository;

	@Override
	public TaskModel insertTask(TaskModel taskModel) {
		//this.taskRepository.save();
		return null;
	}
	
	

}
