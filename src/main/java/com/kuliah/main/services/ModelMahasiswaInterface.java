package com.kuliah.main.services;

import java.util.List;

import com.kuliah.main.entity.Mahasiswa;

public interface ModelMahasiswaInterface {
	
	public List<Mahasiswa> getAllMahasiswa();
	public Mahasiswa getMahasiwaByName(String name);
	
	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa);
	public Mahasiswa getMahasiswaById(String id);
	public void deleteMahasiswa(String id);

}
