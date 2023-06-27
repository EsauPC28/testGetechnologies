package com.getechnologies.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getechnologies.test.model.Factura;
import com.getechnologies.test.model.Persona;

public interface FacturaRepository extends JpaRepository<Factura,Long>{
	
	Optional<Factura> findById(Long id);
	
	Factura findByPersona (Persona persona);

}
