package com.getechnologies.test.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre",nullable = false)
	private String name;

	@Column(name="aPaterno",nullable = false)
	private String middleName;
	
	@Column(name="aMaterno")
	private String lastName;
	
	@Column(name="identificacion",nullable = false)
	private String identification;
	
	@OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy="persona")
	private List<Factura> factura;
}
