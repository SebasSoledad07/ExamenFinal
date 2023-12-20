package com.example.demo.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="pokemon.entrenador")
public class Entrenador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int serial;
	@Column
	String nombre;
	
	String apellido;
	
	Date fechaNacimiento;
	
	int pueblo_id;
	
	String uuId;
	
}
