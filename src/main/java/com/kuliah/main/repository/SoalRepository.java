package com.kuliah.main.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kuliah.main.entity.Soal;

public interface SoalRepository extends CrudRepository<Soal, Long>{
	
	public Soal findByNamaSoal(String nama);

}
