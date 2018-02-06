package com.eduardobarrera.taskenginemanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class TaskEntity {

	@Id
	@GeneratedValue
	@Column(name = "task_id", nullable = false, unique = true)
	private int taskId;

	@Column(name = "task_name", nullable = false)
	private String taskName;

	@Column(name = "task_description")
	private String taskDescription;

	@Column(name = "creation_date", nullable = false)
	private String creationDate;

	@Column(name = "due_date", nullable = false)
	private String dueDate;

	@Column(name = "priority", nullable = false)
	private String priority;

	@Column(name = "category", nullable = false)
	private String category;

	@Column(name = "status", nullable = false)
	private String status;

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TaskEntity(int taskId, String taskName, String taskDescription, String creationDate, String dueDate,
			String priority, String category, String status) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.creationDate = creationDate;
		this.dueDate = dueDate;
		this.priority = priority;
		this.category = category;
		this.status = status;
	}

	public TaskEntity() {
	}

}
