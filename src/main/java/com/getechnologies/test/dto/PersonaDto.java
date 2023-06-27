package com.getechnologies.test.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDto {
	
	private Long id;
	
	@NotEmpty(message="El nombre no puede estar vacio")
	private String name;
	
	@NotEmpty(message="El apellido paterno no puede estar vacio")
	private String middleName;
	
	private String lastName;
	
	@NotEmpty(message="La identificacion no puede estar vacio")
	private String identification;
	
}
