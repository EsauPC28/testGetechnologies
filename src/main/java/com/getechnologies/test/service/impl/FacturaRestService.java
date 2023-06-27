package com.getechnologies.test.service.impl;

import com.getechnologies.test.dto.FacturaDto;
import com.getechnologies.test.model.Factura;
import com.getechnologies.test.model.Persona;
import com.getechnologies.test.repository.FacturaRepository;
import com.getechnologies.test.service.Ventas;

public class FacturaRestService implements Ventas{

	private FacturaRepository facturaRepository;
	
	public FacturaRestService (FacturaRepository facturaRepository) {
		this.facturaRepository = facturaRepository;
	}
	
	@Override
	public Factura findFacturasByPersona(Persona persona) {
		
		return facturaRepository.findByPersona(persona);
	}

	@Override
	public void storeFactura(FacturaDto facturaDto) {

		Factura factura = new Factura();
		
		factura.setFecha(facturaDto.getFecha());
		factura.setMonto(facturaDto.getMonto());
		factura.setPersona(facturaDto.getPersona());
		
	}
	
	

}
