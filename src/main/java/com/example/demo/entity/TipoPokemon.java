package com.example.demo.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tipo_pokemon")
public class TipoPokemon {

	@Id
	@Column(name="tipo_pokemon", nullable=false)
	int serial;
	@Column(name="descripcion", nullable=false)
	String desc;
	@Column(name="uuid", nullable=false)
	String uuid;

	@ManyToOne(fetch = FetchType.EAGER)
    private Pokemon pokemon;
}
	

