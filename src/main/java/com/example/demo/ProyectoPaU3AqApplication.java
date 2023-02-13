package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3AqApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3AqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setApellido("Taco");
		estudiante1.setNombre("Gabriela");
		estudiante1.setCedula("172323111");
		estudiante1.setCiudad("Quito");
		estudiante1.setGenero("F");

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Chanataxi");
		estudiante2.setNombre("Francisco");
		estudiante2.setCedula("1754402707");
		estudiante2.setCiudad("Manta");
		estudiante2.setGenero("M");

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setApellido("Perez");
		estudiante3.setNombre("Maria");
		estudiante3.setCedula("1725841530");
		estudiante3.setCiudad("Guayaquil");
		estudiante3.setGenero("F");

		Estudiante estudiante4 = new Estudiante();
		estudiante4.setApellido("Gualan");
		estudiante4.setNombre("Erick");
		estudiante4.setCedula("1725433221");
		estudiante4.setCiudad("Ambato");
		estudiante4.setGenero("M");

		
		 this.estudianteService.insertar(estudiante1);
		 this.estudianteService.insertar(estudiante2);
		 this.estudianteService.insertar(estudiante3);
		 this.estudianteService.insertar(estudiante4);
		 

		
		this.estudianteService.eliminarPorNombre("Francisco");
		this.estudianteService.eliminarPorCiudad("Ambato");
		this.estudianteService.actualizarPorCiudad("Quito", "Jimmy");
		this.estudianteService.actualizarPorNombre("Erick","Gutierrez");
		
	}

}
