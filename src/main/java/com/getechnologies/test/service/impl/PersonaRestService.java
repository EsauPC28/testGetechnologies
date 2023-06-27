package com.getechnologies.test.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.getechnologies.test.dto.PersonaDto;
import com.getechnologies.test.model.Persona;
import com.getechnologies.test.repository.PersonaRepository;
import com.getechnologies.test.service.Directorio;

@Service
public class PersonaRestService implements Directorio{

	private PersonaRepository personaRepository;
	
	public PersonaRestService(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}
	
	@Override
	public Persona findPersonByIdentification(String identification) {
		return personaRepository.findByIdentification(identification);
	}

	@Override
	public List<Persona> findPersonas() {
		
		return personaRepository.findAll();
	}

	@Override
	public void deletePersonaByIdentification(String identification) {
		
		Persona persona = personaRepository.findByIdentification(identification);
		
		personaRepository.delete(persona);

	}

	@Override
	public void storePersona(PersonaDto personaDto) {
		
		Persona persona = new Persona();
		persona.setName(personaDto.getName());
		persona.setMiddleName(personaDto.getMiddleName());
		persona.setLastName(personaDto.getLastName());
		persona.setIdentification(personaDto.getIdentification());
		
		personaRepository.save(persona);
	}

}
