package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tipo_pokemon")
public class TipoPokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int serial;
	@Column(name="descripcion", nullable=false)
	String desc;
	@Column(name="uuid", nullable=false)
	String uuid;
	
}
