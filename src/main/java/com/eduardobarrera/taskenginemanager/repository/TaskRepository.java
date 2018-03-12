package com.eduardobarrera.taskenginemanager.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardobarrera.taskenginemanager.entity.TaskEntity;

@Repository("taskRepository")
public interface TaskRepository extends JpaRepository<TaskEntity, Serializable>{
	
	public abstract TaskEntity findByTaskId(int taskId);
	
	
}
