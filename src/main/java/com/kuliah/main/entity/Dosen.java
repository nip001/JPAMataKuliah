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
@Table(name="dosen")
public class Dosen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDosen;
	private String username;
	private String password;
	private String namaDosen;
	

}
