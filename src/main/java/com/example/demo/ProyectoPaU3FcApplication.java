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
		
//        Estudiante e2= this.estudianteService.buscarPorNombre("Anddy");
//		
//		System.out.println(e2);
		
        Estudiante e2= this.estudianteService.buscarPorNombreTypedQuery("Anddy");
		
		System.out.println("ESTE :" + e2);
		
		System.out.println("--------------------------------------");
		
        Estudiante e3= this.estudianteService.buscarPorNombreNamedQuery("Anddy");
		
		System.out.println("ESTE :" + e3);
		
	    System.out.println("--------------------------------------");
		
        Estudiante e4= this.estudianteService.buscarPorNombreNamedQuerytyped("Anddy");
		
		System.out.println("ESTE :" + e4);
		System.out.println("--------------------------------------");
		
        Estudiante e5= this.estudianteService.buscarPorNombreNativeQuery("Anddy");
		
		System.out.println("ESTE :" + e5);
		
//        Estudiante e6= this.estudianteService.buscarPorNombreNativeNamedQueryTyped("Anddy");
//		
//		System.out.println("ESTE :" + e6);
		
		
	}

}
