package com.getechnologies.test.service;

import java.util.List;

import com.getechnologies.test.dto.PersonaDto;
import com.getechnologies.test.model.Persona;

public interface Directorio {

	Persona findPersonByIdentification (String identification);
	
	List<Persona> findPersonas();
	
	void deletePersonaByIdentification(String identification);
	
	void storePersona (PersonaDto personaDto);
}
