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
public class REGION {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  region_id;
	
	private String region;
	private String provincia;
	private Long id;
}
