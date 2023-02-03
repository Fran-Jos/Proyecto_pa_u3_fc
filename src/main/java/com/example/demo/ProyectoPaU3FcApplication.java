package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3FcApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3FcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante e1 = new Estudiante();
		e1.setApellido("Chanataxi");
		e1.setCedula("1754402707");
		e1.setCiudad("Quito");
		e1.setFechaNa(LocalDateTime.now());
		e1.setGenero("Masculino");
		e1.setNombre("Francisco");
		e1.setPais("Ecuador");
		e1.setSalario(new BigDecimal(1800));
		
		Estudiante e2 = new Estudiante();
		e2.setApellido("Taco");
		e2.setCedula("17567773882");
		e2.setCiudad("Cali");
		e2.setFechaNa(LocalDateTime.now());
		e2.setGenero("Femenino");
		e2.setNombre("Gabriela");
		e2.setPais("Colombia");
		e2.setSalario(new BigDecimal(1500));
		
		
		Estudiante e3 = new Estudiante();
		e3.setApellido("Parra");
		e3.setCedula("1721112343");
		e3.setCiudad("Toronto");
		e3.setFechaNa(LocalDateTime.now());
		e3.setGenero("Masc");
		e3.setNombre("Jorge");
		e3.setPais("Canada");
		e3.setSalario(new BigDecimal(1900));
		
		Estudiante e4 = new Estudiante();
		e4.setApellido("Guerrero");
		e4.setCedula("13221343232");
		e4.setCiudad("Lima");
		e4.setFechaNa(LocalDateTime.now());
		e4.setGenero("M");
		e4.setNombre("Paolo");
		e4.setPais("Perú");
		e4.setSalario(new BigDecimal(4800));
		
//		this.estudianteService.agregar(e4);
//		this.estudianteService.agregar(e3);
//		this.estudianteService.agregar(e2);
//		this.estudianteService.agregar(e1);
		
		System.out.println("_____________________________________________________");
		System.out.println("-                                                   -");
		System.out.println("----------------busqueda por Apellido----------------");
		
		Estudiante estu1= this.estudianteService.buscarPorApellido("Chanataxi");
		System.out.println(estu1);
		System.out.println("-                                                   -");
		System.out.println("_____________________________________________________\n");
		
		
		System.out.println("_____________________________________________________");
		System.out.println("-                                                   -");
		System.out.println("-----------------busqueda por Nombre-----------------");
        Estudiante estu2= this.estudianteService.buscarPorNombre("Gabriela");
		System.out.println(estu2);
		System.out.println("-                                                   -");
		System.out.println("_____________________________________________________\n");
		
		System.out.println("_____________________________________________________");
		System.out.println("-                                                   -");
		System.out.println("----------------busqueda por Cedula------------------");
		Estudiante estu3= this.estudianteService.buscarPorCedula("1721112343");
		System.out.println(estu3);
		System.out.println("-                                                   -");
		System.out.println("_____________________________________________________\n");
		
		System.out.println("_____________________________________________________");
		System.out.println("-                                                   -");
		System.out.println("----------------busqueda por Ciudad------------------");
		Estudiante estu4 = this.estudianteService.buscarPorCiudad("Toronto");
		System.out.println(estu4);
		System.out.println("-                                                   -");
		System.out.println("_____________________________________________________\n");
		
		System.out.println("_____________________________________________________");
		System.out.println("-                                                   -");
		System.out.println("----------------busqueda por Genero------------------");
		Estudiante estu5 = this.estudianteService.buscarPorGenero("M");
		System.out.println(estu5);
		System.out.println("-                                                   -");
		System.out.println("_____________________________________________________\n");
		
		
		
		
		
	}

}
