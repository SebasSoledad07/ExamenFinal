package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name="pokemon_captura")
public class CapturaPokemon {

	@OneToOne(cascade=CascadeType.ALL, optional=false)
	@MapsId
	@JoinColumn(name="pokemon_id")
	private Pokemon pokemon;
	
}
