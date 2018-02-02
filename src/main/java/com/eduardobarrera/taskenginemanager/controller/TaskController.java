package com.eduardobarrera.taskenginemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eduardobarrera.taskenginemanager.constant.ViewConstant;

@Controller
@RequestMapping("/task")
public class TaskController {
	
	@GetMapping("/home")
	public String getHomeView() {
		return ViewConstant.HOME_VIEW;
	}
	
	@GetMapping("/new")
	public String getNewTaskView(Model model) {
		
		String operationType = "Create task";
		String buttonToShow = "newTask";
		
		model.addAttribute("operationType", operationType);
		model.addAttribute("buttonToShow", buttonToShow);
		return ViewConstant.TASK_OPERATION_VIEW;
	}
	
	@GetMapping("/search")
	public String getSearchTaskView(Model model) {
		
		String operationType = "Search task";
		String buttonToShow = "searchTask";	
		
		model.addAttribute("operationType", operationType);
		model.addAttribute("buttonToShow", buttonToShow);
		return ViewConstant.TASK_OPERATION_VIEW;
	}
	
	@GetMapping("/list")
	public String getTaskList(Model model, 
							 @RequestParam(name="status") String taskStatus) {
		
		model.addAttribute("status", taskStatus);
		return ViewConstant.TASK_LIST_VIEW;
	}
	
	@GetMapping("/about")
	public String getAboutView() {
		return ViewConstant.ABOUT_VIEW;
	}

}
