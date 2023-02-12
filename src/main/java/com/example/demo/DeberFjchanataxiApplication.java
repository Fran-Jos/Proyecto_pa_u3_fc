package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.service.IAutomovilService;

@SpringBootApplication
public class DeberFjchanataxiApplication implements CommandLineRunner {
	
	@Autowired
	private IAutomovilService automovilService;

	public static void main(String[] args) {
		SpringApplication.run(DeberFjchanataxiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	Automovil a1 = new Automovil();
	a1.setAnio(2015);
	a1.setCapacidadPersonas(5);
	a1.setColor("Rojo");
	a1.setMarca("Toyota");
	a1.setModelo("Hilux");
	a1.setPlaca("PRA-9983");
	a1.setPrecio(new BigDecimal(30000));
	
	Automovil a2 = new Automovil();
	a2.setAnio(2019);
	a2.setCapacidadPersonas(4);
	a2.setColor("Blanco");
	a2.setMarca("Chevroleth");
	a2.setModelo("Prix");
	a2.setPlaca("PTA-1183");
	a2.setPrecio(new BigDecimal(10000));
	
	
	Automovil a3 = new Automovil();
	a3.setAnio(2020);
	a3.setCapacidadPersonas(7);
	a3.setColor("Azul");
	a3.setMarca("Mazda");
	a3.setModelo("BT-50");
	a3.setPlaca("PPA-9722");
	a3.setPrecio(new BigDecimal(20000));
	
//
//	this.automovilService.insertar(a3);
//	this.automovilService.insertar(a2);
//	this.automovilService.insertar(a1);
	
	
	//TypedQuery
	System.out.println(this.automovilService.buscarPorPlacaTypedQuery("PPA-9722"));
	System.out.println(this.automovilService.buscarPorMarcaTypedQuery("Mazda"));
	System.out.println(this.automovilService.buscarPorModeloTypedQuery("BT-50"));
	
	//NamedQuery
	
	System.out.println(this.automovilService.buscarPorPlacaNamedQuery("PTA-1183"));
	System.out.println(this.automovilService.buscarPorModeloNamedQuery("Prix"));
	System.out.println(this.automovilService.buscarPorMarcaNamedQuery("Chevroleth"));
	
	//nativeQuery
	
	System.out.println(this.automovilService.buscarPorPlacaNativeQuery("PPA-9722"));
	System.out.println(this.automovilService.buscarPorModeloNativeQuery("Hilux"));
	System.out.println(this.automovilService.buscarPorMarcaNativeQuery("Toyota"));
	
	//namedNativeQuery
	
	System.out.println(this.automovilService.buscarPorPlacaNamedNativeQuery("PRA-9983"));
	System.out.println(this.automovilService.buscarPorModeloNamedNativeQuery("Prix"));
	System.out.println(this.automovilService.buscarPorMarcaNamedNativeQuery("Toyota"));


		
		
	}

}
