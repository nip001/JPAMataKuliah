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
@Table(name="pertanyaan")
public class Pertanyaan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String pertanyaan1;
	private String jawaban1;
	private String jawaban2;
	private String jawaban3;
	private String jawaban4;
	private String jawabanBenar;
	private String statusGambar;

}
