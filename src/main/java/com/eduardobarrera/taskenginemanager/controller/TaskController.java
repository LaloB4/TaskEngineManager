package com.eduardobarrera.taskenginemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eduardobarrera.taskenginemanager.constant.ViewConstant;
import com.eduardobarrera.taskenginemanager.model.TaskModel;
import com.eduardobarrera.taskenginemanager.service.TaskService;

@Controller
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	@Qualifier("taskServiceImpl")
	private TaskService taskService;
	
	@GetMapping("/home")
	public String getHomeView(Model model,
							 @RequestParam(name="creationStatus", required=false) String creationStatus) {
		
		model.addAttribute("crationStatus", creationStatus);
		return ViewConstant.HOME_VIEW;
	}
	
	@GetMapping("/operation")
	public String getNewTaskView(Model model,
								@RequestParam(name="type") String typeOfOperation,
								@RequestParam(name="id", required=false)String taskId) {
		
		String operationType = "";
		String buttonToShow = "";
		
		switch(typeOfOperation) {
			case "new":
				operationType = "Create task";
				buttonToShow = "newTask";
				break;
				
			case "search":
				operationType = "Search task";
				buttonToShow = "searchTask";
				break;
				
			case "details":
				operationType = "Task details";
				buttonToShow = "taskDetails";
				
		}
		
		TaskModel taskModel = taskId!=null?taskService.searchTaskById(Integer.parseInt(taskId)):new TaskModel();
		
		model.addAttribute("task", taskModel);
		model.addAttribute("operationType", operationType);
		model.addAttribute("buttonToShow", buttonToShow);
		return ViewConstant.TASK_OPERATION_VIEW;
		
	}
	
	@GetMapping("/list")
	public String getTaskList(Model model, 
							 @RequestParam(name="status") String taskStatus) {
		
		model.addAttribute("status", taskStatus);
		model.addAttribute("taskList", taskService.getAllTasks());
		return ViewConstant.TASK_LIST_VIEW;
	}
	
	@GetMapping("/about")
	public String getAboutView() {
		return ViewConstant.ABOUT_VIEW;
	}
	
	@PostMapping("/insert")
	public String insertNewTask(@ModelAttribute(name="task") TaskModel taskModel) {
		
		String redirectTo = "redirect:/task/home";
		TaskModel createdTask = taskService.insertTask(taskModel);
		if(createdTask != null) {
			redirectTo += "?creationStatus=success";
		}else {
			redirectTo = "?creationStatus=error";
		}
		
		return redirectTo;
	}
}
