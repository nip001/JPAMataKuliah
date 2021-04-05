package com.kuliah.main.services;

import java.util.List;

import com.kuliah.main.entity.Mahasiswa;

public interface ModelMahasiswaInterface {
	
	public List<Mahasiswa> getAllMahasiswa();
	public Mahasiswa getMahasiwaByName(String name);
	

}
