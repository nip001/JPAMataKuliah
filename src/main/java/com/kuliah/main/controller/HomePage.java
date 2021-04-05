package com.kuliah.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kuliah.main.repository.MahasiswaRepository;

@Controller
public class HomePage {
	
	@Autowired
	MahasiswaRepository mahasiswaRepo;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		
		
		
		model.addAttribute("aqil","Hello ini gw dewa");
		model.addAttribute("hanif","Hanif makan mie");

		return "index";
		
	}
	
	@GetMapping("/hanif")
	public String hanif(@RequestParam String pesan, Model model) {
		
		model.addAttribute("pesan", pesan);
		return "hanif";
	}

}
