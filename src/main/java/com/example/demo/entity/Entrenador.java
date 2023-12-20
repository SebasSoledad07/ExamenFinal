package com.example.demo.entity;
import java.util.Date;

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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Data
@Entity
@Table(name="entrenador")
public class Entrenador {

	@Id
	@Column(name="entrenador_id", nullable=false)
	private int serial;
	
	@Column(name="nombre", nullable=false)
	private String nombre;
	
	
	@Column(name="apellido", nullable=false)
	private String apellido;
	
	@Column(name="fecha_nacimiento", nullable=false)
	private Date fechaNacimiento;
	
	@Column(name="uuid", nullable=false)
	private String uuId;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
    @MapsId
    @JoinColumn(name = "Pueblo_id")
    private Pueblo pueblo;
	
	
}
