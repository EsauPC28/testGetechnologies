package com.getechnologies.test.dto;

import java.util.Date;

import com.getechnologies.test.model.Persona;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FacturaDto {

	private Long id;
	
	@NotNull
	private Date fecha;
	
	@NotNull
	private Float monto;
	
	@NotNull
	private Persona persona;
}
