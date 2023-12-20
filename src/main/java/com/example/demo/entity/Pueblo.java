package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="pueblo")
public class Pueblo {

	@Id
	@Column(name="pueblo_id")
	int serial;
	
	@Column(name="nombre", nullable=false)
	String nombre;
	
	@Column(name="uuid", nullable=false)
	String uuid;
	

	
	 @OneToOne(mappedBy = "entrenador", cascade = CascadeType.ALL)
	 @PrimaryKeyJoinColumn
	 private Entrenador entrenador;
}
