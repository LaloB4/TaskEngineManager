package com.eduardobarrera.taskenginemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eduardobarrera.taskenginemanager.constant.ViewConstant;
import com.eduardobarrera.taskenginemanager.model.UserModel;

@Controller
public class LoginController {

	@GetMapping("/")
	public String redirectToLogin() {
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String getLoginView(Model model,
							  @RequestParam(name="error", required=false) String error,
							  @RequestParam(name="logout", required=false) String logout) {
		
		model.addAttribute("userModel", new UserModel());
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		return ViewConstant.LOGIN_VIEW;
	}
	
	@PostMapping("/checkcredentials")
	public String userAuthorization(@ModelAttribute(name="userModel") UserModel userModel) {
				
		if(userModel.getUsername().equals("admin") && userModel.getPassword().equals("admin")) {
			return "redirect:/task/home";
		}
		
		return "redirect:/login?error";
	}
	
}
