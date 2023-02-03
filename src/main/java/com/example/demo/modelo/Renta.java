package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name =  "renta")
public class Renta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ren_seq")
	@SequenceGenerator(name = "ren_seq",sequenceName = "ren_seq",allocationSize = 1)
	@Column(name = "ren_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "ren_cedula_cli")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "ren_placa_vehi")
	private Vehiculo vehiculo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		
		return "Renta [id=" + id + ", cliente=" + cliente.getNombre() + ", vehiculo=" + vehiculo.getPlaca() + "]";
	}
	
	
	
	
	
	
	
}
