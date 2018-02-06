package com.eduardobarrera.taskenginemanager.model;

public class TaskModel {

	private int taskId;
	private String taskName;
	private String taskDescription;
	private String creationDate;
	private String dueDate;
	private String priority;
	private String category;
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

	public TaskModel(int taskId, String taskName, String taskDescription, String creationDate, String dueDate,
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

	public TaskModel() {

	}

	@Override
	public String toString() {
		return "TaskModel [taskId=" + taskId + ", taskName=" + taskName + ", taskDescription=" + taskDescription
				+ ", creationDate=" + creationDate + ", dueDate=" + dueDate + ", priority=" + priority + ", category="
				+ category + ", status=" + status + "]";
	}

}
