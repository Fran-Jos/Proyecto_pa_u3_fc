package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name =  "cliente")
public class Cliente {

	
	
	
	@Column(name = "cli_nombre")
	private String nombre;
	
	@Id
	@Column(name = "cli_cedula")
	private String cedula;
	
	@Column(name = "cli_edad")
	private Integer edad;
	
	@Column(name = "cli_apellido")
	private String apellido;
	
	
	@OneToMany(mappedBy = "cliente" , cascade = CascadeType.ALL , fetch = FetchType.LAZY )
	private List<Renta> rentas;
	

	//set and get
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Renta> getRentas() {
		return rentas;
	}
	

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", apellido="
				+ apellido + ", rentas=" + rentas + "]";
	}
	
	


	
	
}
