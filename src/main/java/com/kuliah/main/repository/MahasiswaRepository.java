package com.kuliah.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.kuliah.main.entity.Mahasiswa;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, Long> {
	
	public Mahasiswa findByNamaMahasiswa(String nama);

}
