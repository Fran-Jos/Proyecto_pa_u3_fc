package com.example.demo.modelo.DTO;


public class EstudianteDTO {

	
	private String cedula;
	
	private String nombre;

	private String apellido;
	
	
	// es una buena practiva hacer el constructor por defecto
	public EstudianteDTO() {
		
	}
	
	public EstudianteDTO(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//set and get

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "EstudianteDTO [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
