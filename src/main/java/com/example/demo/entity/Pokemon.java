package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pokemon")
public class Pokemon {

	@Id
	@Column(name="pokemon_id")
	private int serial;
	
	@Column(name="nombre", nullable=false)
	private String nombre;
	
	@Column(name="descripcion", nullable=false)
	private String desc;
	
	@Column(name="tipo_pokemon", nullable=false)
	private int tipo;
	
	@Column(name="fecha_descubrimiento", nullable=false)
	private Date fechaDesc;
	
	@Column(name="generacion", nullable=false)
	private int gen;
	
	
	@Column(name="uuid", nullable=false)
	private String uuid;
	
	@OneToOne(mappedBy="pokemon_id")
	@PrimaryKeyJoinColumn
	private Pokemon pokemon;
	
	
	
}