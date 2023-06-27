package com.getechnologies.test.service;

import com.getechnologies.test.dto.FacturaDto;
import com.getechnologies.test.model.Factura;
import com.getechnologies.test.model.Persona;

public interface Ventas {

	Factura findFacturasByPersona(Persona persona);
	
	void storeFactura (FacturaDto facturaDto);
}
