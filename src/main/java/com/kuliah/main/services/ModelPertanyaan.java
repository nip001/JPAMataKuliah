package com.kuliah.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuliah.main.entity.Pertanyaan;
import com.kuliah.main.repository.PertanyaanRepository;

@Service
public class ModelPertanyaan implements ModelPertanyaanInterface{

	@Autowired
	PertanyaanRepository pertanyaanRepo;
	
	@Override
	public Pertanyaan addPertanyaan(Pertanyaan pertanyaan) {
		// TODO Auto-generated method stub
		return  this.pertanyaanRepo.save(pertanyaan);
	}

}
