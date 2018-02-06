package com.eduardobarrera.taskenginemanager.converter;

import org.springframework.stereotype.Component;

import com.eduardobarrera.taskenginemanager.entity.TaskEntity;
import com.eduardobarrera.taskenginemanager.model.TaskModel;

@Component("taskConverter")
public class TaskConverter {
	
	//Model to Entity
	public TaskEntity modelToEntity(TaskModel taskModel) {
		
		TaskEntity entity = new TaskEntity();
		
		entity.setTaskId(taskModel.getTaskId());
		entity.setTaskName(taskModel.getTaskName());
		entity.setTaskDescription(taskModel.getTaskDescription());
		entity.setCreationDate(taskModel.getCreationDate());
		entity.setDueDate(taskModel.getDueDate());
		entity.setPriority(taskModel.getPriority());
		entity.setCategory(taskModel.getCategory());
		entity.setStatus(taskModel.getStatus());
	
		return entity;	
	}
	
	//Entity to Model
	public TaskModel entityToModel(TaskEntity taskEntity) {
		
		TaskModel model = new TaskModel();
		
		model.setTaskId(taskEntity.getTaskId());
		model.setTaskName(taskEntity.getTaskName());
		model.setTaskDescription(taskEntity.getTaskDescription());
		model.setCreationDate(taskEntity.getCreationDate());
		model.setDueDate(taskEntity.getDueDate());
		model.setPriority(taskEntity.getPriority());
		model.setCategory(taskEntity.getCategory());
		model.setStatus(taskEntity.getStatus());
	
		return model;	
	}

}
