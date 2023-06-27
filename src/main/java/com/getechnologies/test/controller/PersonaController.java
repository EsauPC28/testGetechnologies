package com.getechnologies.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getechnologies.test.model.Persona;
import com.getechnologies.test.service.Directorio;

@RestController
public class PersonaController {
	
	@Autowired
	private Directorio directorio;
	
	public PersonaController(Directorio directorio) {
		this.directorio = directorio;
	}
	
	@RequestMapping("api/personas")
	public List<Persona> getAllPersonas() {
		return directorio.findPersonas();
	}

	@GetMapping("api/persona/{identification}")
	public Persona searchPersonaByIdentification(@PathVariable("identification") String identification)
	{
		return directorio.findPersonByIdentification(identification);
	}
	
	@DeleteMapping("/delete/{identification}")
	public void deletePersonaByIdentification(@PathVariable("identification") String identification) {
		directorio.deletePersonaByIdentification(identification);
	}
}
