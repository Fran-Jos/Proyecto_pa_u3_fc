package com.example.demo.modelo;




import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


//-- TABLA PRINCIPAL--


@Entity
@Table(name =  "vehiculo")
public class Vehiculo {
	
	@Id
	@Column(name = "vehi_placa")
	private String placa;
	
	@Column(name = "vehi_marca")
	private String marca;
	
	@Column(name = "vehi_color")
	private String color;
	
	@Column(name = "vehi_modelo")
	private String modelo;
	
	@OneToMany(mappedBy = "vehiculo", cascade =  CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Renta>rentas;
	
	


	//get and set



	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}

	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", marca=" + marca + ", color=" + color + ", modelo="
				+ modelo + ", rentas=" + rentas + "]";
	}


	
	
	
	
}
