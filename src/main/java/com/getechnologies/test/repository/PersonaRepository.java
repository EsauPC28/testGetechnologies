package com.getechnologies.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getechnologies.test.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Long>{
	
	Persona findByIdentification(String identification);
	
	//Persona deleteByidentification(String identification);
}
