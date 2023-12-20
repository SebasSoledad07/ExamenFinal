package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="pueblo")
public class Pueblo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int serial;
	@Column(name="nombre", nullable=false)
	String nombre;
	@Column(name="uuid", nullable=false)
	String uuid;
	
	//@OneToOne(cascade=CascadeType.ALL, optional=false)
	//@JoinColumn(name="pueblo_id")
	//private Entrenador Entrenador;
}
