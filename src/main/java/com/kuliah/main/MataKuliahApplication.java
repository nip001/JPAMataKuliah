package com.kuliah.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kuliah.main.entity.Dosen;
import com.kuliah.main.entity.Mahasiswa;
import com.kuliah.main.entity.MataKuliah;
import com.kuliah.main.entity.Nilai;
import com.kuliah.main.entity.Pertanyaan;
import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.entity.Soal;
import com.kuliah.main.repository.PlotMataKuliahRepository;

@SpringBootApplication
public class MataKuliahApplication implements CommandLineRunner{

	
	@Autowired
	private PlotMataKuliahRepository plotMK;
	public static void main(String[] args) {
		SpringApplication.run(MataKuliahApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		PlotMataKuliah plotMK = new PlotMataKuliah();
		
		
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNamaMahasiswa("Dewabrata");
		mahasiswa.setJenisKelamin("Pria");
		mahasiswa.setNim("12345");
		mahasiswa.setPassword("rahasia");
		
		plotMK.setMahasiswa(mahasiswa);
		
		Dosen dosen = new Dosen();
		dosen.setNamaDosen("Chelsea Islan");
		dosen.setUsername("chelsea");
		dosen.setPassword("oppo");
		plotMK.setDosen(dosen);
		
		MataKuliah matakuliah = new MataKuliah();
		matakuliah.setNamaMataKuliah("Psikologi Terapan");
		plotMK.setMatakuliah(matakuliah);
		
		List<Soal> lstSoal = new ArrayList<Soal>();
		
		Soal soal1 = new Soal();
		soal1.setNamaSoal("Soal Percintaan");
		soal1.setStatus(1);
		
		Nilai nilai = new Nilai();
		nilai.setNilai("100");
		soal1.setNilai(nilai);
		
		Pertanyaan pertanyaan1 = new Pertanyaan();
		pertanyaan1.setPertanyaan("Siapa cinta pertama Aqil");
		pertanyaan1.setJawaban1("Sidiq");
		pertanyaan1.setJawaban2("Hanif");
		pertanyaan1.setJawaban3("Jouzu");
		pertanyaan1.setJawaban4("Tidak ada yang benar");
		pertanyaan1.setJawabanBenar("4");
		pertanyaan1.setStatusGambar("");
		
		List<Pertanyaan> lstPertanyaan = new ArrayList<Pertanyaan>();
		lstPertanyaan.add(pertanyaan1);
		soal1.setLstPertanyaan(lstPertanyaan);
		
		
		
		lstSoal.add(soal1);
		
		plotMK.setLstSoal(lstSoal);
		this.plotMK.save(plotMK);
	}

}
