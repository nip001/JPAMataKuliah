package com.kuliah.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuliah.main.entity.Mahasiswa;
import com.kuliah.main.repository.MahasiswaRepository;

@Service
public class ModelMahasiswa  implements ModelMahasiswaInterface{
	
	@Autowired
	MahasiswaRepository mahasiswaRepo;

	@Override
	public List<Mahasiswa> getAllMahasiswa() {
		// TODO Auto-generated method stub
		return (List<Mahasiswa>) this.mahasiswaRepo.findAll();
	}

	@Override
	public Mahasiswa getMahasiwaByName(String nama) {
		// TODO Auto-generated method stub
		return this.mahasiswaRepo.findByNamaMahasiswa(nama);
	}

	@Override
	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub
		
		return  this.mahasiswaRepo.save(mahasiswa);
	
	}

	@Override
	public Mahasiswa getMahasiswaById(String id) {
		// TODO Auto-generated method stub
		
		return 	((Mahasiswa)this.mahasiswaRepo.findByIdMahasiswa(Long.parseLong(id)));
		
		
	}

	@Override
	public void deleteMahasiswa(String id) {
		// TODO Auto-generated method stub
		this.mahasiswaRepo.deleteById(Long.parseLong(id));
		
	}

}
