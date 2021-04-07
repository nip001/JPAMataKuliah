package com.kuliah.main.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kuliah.main.entity.Pertanyaan;
import com.kuliah.main.services.ModelPertanyaan;

@Controller
public class PertanyaanController {

	@Autowired
	ModelPertanyaan modelPertanyaan;

    private final String UPLOAD_DIR = "./src/main/resources/static/uploads/";
	
	@GetMapping("/pertanyaan/add")
	public String viewIndexPertanyaan(Model model) {
		model.addAttribute("pertanyaan",new Pertanyaan());
		return "add_pertanyaan";
	}
	
	@PostMapping("/pertanyaan/add")
	public String addPertanyaan(@RequestParam(value = "file")MultipartFile file,@ModelAttribute Pertanyaan pertanyaan, Model model) {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		System.out.println(file.getOriginalFilename());
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            Path path = Paths.get(UPLOAD_DIR + fileName);
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        pertanyaan.setStatusGambar(UPLOAD_DIR + fileName);
        this.modelPertanyaan.addPertanyaan(pertanyaan);
		model.addAttribute("pertanyaan",new Pertanyaan());
		return "add_pertanyaan";
	}
}
