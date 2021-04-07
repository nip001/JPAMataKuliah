package com.kuliah.main.services;

import java.util.List;

import com.kuliah.main.entity.Pertanyaan;

public interface ModelPertanyaanInterface {

	public Pertanyaan addPertanyaan(Pertanyaan pertanyaan);
	public List<Pertanyaan> getAllPertanyaan();
}
