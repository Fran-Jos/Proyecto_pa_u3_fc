package com.example.demo;

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
		
//		Estudiante e1= this.estudianteService.buscarPorApellido("Quisilema");
//		
//		System.out.println(e1);
		
        Estudiante e2= this.estudianteService.buscarPorNombre("Anddy");
		
		System.out.println(e2);
		
		
		
		
		
	}

}
