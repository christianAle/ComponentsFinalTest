package com.components.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BIODIVERSIDAD {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  bio_id;
	
	private String nombres ;
	private String popular ;
	private String cientifico;
	private Long peligro;
	private Long poblacion;
	private Long id;
}
