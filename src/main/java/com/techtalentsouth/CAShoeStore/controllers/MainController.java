package com.techtalentsouth.CAShoeStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller 
public class MainController {

	@Autowired
	private CAShoeStoreRepository CAShoeStoreRepository; 
		

	@GetMapping("/") 
	public String index( ) {
		return "main/index.html"; 
	}
	
	@GetMapping("/about") 
	public String about( ) {
		return "main/about.html"; 
	}
	@GetMapping("/contact") 
	public String contact(Customer pizza) {
		return "main/contact.html"; 
	}
	
	//@RequestMapping(value="/contact", method=RequestMethod.POST)
	@PostMapping("/contact")
	public String addCustomer(Customer request, Model model) {
		CAShoeStoreRepository.save(request); 
		model.addAttribute("name", request.getName());
		model.addAttribute("city", request.getCity());
		model.addAttribute("state", request.getState());
		model.addAttribute("message", request.getMessage());
		return "main/submitForm"; 
	}
	
	
	
	
}
