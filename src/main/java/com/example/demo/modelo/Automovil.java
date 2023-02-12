package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name =  "automovil")

@NamedQuery(name = "Automovil.buscarPorPlaca" , query = "select a from Automovil a where a.placa = :datoPlaca")
@NamedQuery(name = "Automovil.buscarPorModelo" , query = "select a from Automovil a where a.modelo = :datoModelo")
@NamedQuery(name = "Automovil.buscarPorMarca" , query = "select a from Automovil a where a.marca = :datoMarca")
@NamedNativeQuery(name = "Automovil.buscarPorPlacaNNQ" , query = "select * from automovil a where a.auto_placa = :datoPlaca")
@NamedNativeQuery(name = "Automovil.buscarPorModeloNNQ" , query = "select * from automovil a where a.auto_modelo = :datoModelo")
@NamedNativeQuery(name = "Automovil.buscarPorMarcaNNQ" , query = "select * from automovil a where a.auto_marca = :datoMarca")
public class Automovil {

	@Column(name =  "auto_marca")
	private String marca;
	
	@Column(name =  "auto_modelo")
	private String modelo;
	
	@Column(name =  "auto_color")
	private String color;
	
	@Id
	@Column(name =  "auto_placa")
	private String placa;
	
	@Column(name =  "auto_capacidadPersonas")
	private Integer capacidadPersonas;

	@Column(name =  "auto_anio")
	private Integer anio;
	 
	@Column(name =  "auto_precio")
	private BigDecimal precio;
	
	
	
	//get and set

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getCapacidadPersonas() {
		return capacidadPersonas;
	}

	public void setCapacidadPersonas(Integer capacidadPersonas) {
		this.capacidadPersonas = capacidadPersonas;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", placa=" + placa
				+ ", capacidadPersonas=" + capacidadPersonas + ", anio=" + anio + ", precio=" + precio + "]";
	}
	
	
	
}
