package com.getechnologies.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.getechnologies.test.dto.PersonaDto;
import com.getechnologies.test.model.Persona;
import com.getechnologies.test.service.Directorio;

import jakarta.validation.Valid;

@Controller
public class AuthController {

	private Directorio directorio;
	
	public AuthController (Directorio directorio) {
		this.directorio = directorio;
	}
	
	@GetMapping("/registroPersona")
	public String showRegistrationForm(Model model) {
		
		PersonaDto persona = new PersonaDto();
		model.addAttribute("persona",persona);
		return "registroPersona";
	}
	
	@PostMapping("/registroPersona/save")
	public String registroPersona(@Valid @ModelAttribute("persona") PersonaDto personaDto,
			BindingResult result,
			Model model)
	{
		Persona existePersona = directorio.findPersonByIdentification(personaDto.getIdentification());
		if (existePersona != null && existePersona.getIdentification() != null && !existePersona.getIdentification().isEmpty()) {
			result.rejectValue("identification", null,
					"Ya existe una persona con esa identificacion");
		}
		if (result.hasErrors()) {
			model.addAttribute("persona",personaDto);
			return "/registroPersona";
		}
		directorio.storePersona(personaDto);
		return "redirect:/registroPersona?success";
	}
}
