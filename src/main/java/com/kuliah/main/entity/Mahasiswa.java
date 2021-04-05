package com.kuliah.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="mahasiswa")
public class Mahasiswa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMahasiswa;
	private String nim;
	private String namaMahasiswa;
	private String jenisKelamin;
	private String password;

}
