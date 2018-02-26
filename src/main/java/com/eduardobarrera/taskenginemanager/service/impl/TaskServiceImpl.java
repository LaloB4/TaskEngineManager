package com.eduardobarrera.taskenginemanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eduardobarrera.taskenginemanager.converter.TaskConverter;
import com.eduardobarrera.taskenginemanager.entity.TaskEntity;
import com.eduardobarrera.taskenginemanager.model.TaskModel;
import com.eduardobarrera.taskenginemanager.repository.TaskRepository;
import com.eduardobarrera.taskenginemanager.service.TaskService;

@Service("taskServiceImpl")
public class TaskServiceImpl implements TaskService {

	@Autowired
	@Qualifier("taskRepository")
	private TaskRepository taskRepository;

	@Autowired
	@Qualifier("taskConverter")
	private TaskConverter taskConverter;

	@Override
	public TaskModel insertTask(TaskModel taskModel) {
		TaskModel model = this.taskConverter
				.entityToModel(this.taskRepository.save(this.taskConverter.modelToEntity(taskModel)));
		return model;
	}

	@Override
	public List<TaskModel> getAllTasks() {

		List<TaskModel> taskModelList = new ArrayList<TaskModel>();
		List<TaskEntity> taskEntityList = taskRepository.findAll();

		for (TaskEntity tE : taskEntityList) {
			taskModelList.add(taskConverter.entityToModel(tE));
		}

		return taskModelList;
	}

	@Override
	public TaskModel searchTaskById(int taskId) {
		
		TaskEntity entity = taskRepository.findByTaskId(taskId);
		TaskModel model = entity!=null?taskConverter.entityToModel(entity):null;
		return model;
	}

}
