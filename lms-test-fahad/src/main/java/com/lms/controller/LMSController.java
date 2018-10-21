package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.lms.service.LmsService;
/**
 * @author fahad
 * This is controller class for mapping of basic operations 
 * such as starting page,list of persons and list of Books 
 */
@Controller
public class LMSController {
	
	@Autowired
	LmsService service;

	@GetMapping("/lms")
	public String showScreen() {
		return "welcome";
	}

	@PostMapping("/showMembers")
	public String showMembers(Model model) {
		model.addAttribute("members",service.getMemberList());
		return "members";
	}
	
	@PostMapping("/showBooks")
	public String showBooks(Model model) {
		model.addAttribute("books",service.getBookList());
		return "books";
	}
	
}
