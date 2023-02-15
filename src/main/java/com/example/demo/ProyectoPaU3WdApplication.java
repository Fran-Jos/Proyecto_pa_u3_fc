package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.repository.IHotelRepo;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3WdApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;
	@Autowired
    private IHabitacionService habitacionService; 

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	

//		List<Hotel>lista2= this.hotelService.buscarHotelFetchJoin("lujo");
//		
//		for (Hotel h : lista2){
//		System.out.println(h.getNombre());
//			for(Habitacion ha: h.getHabitaciones()) {
//				System.out.println("La habitacion de: " + h.getNombre() + " : " +  ha.getNumero());
//			}
//			
//			System.out.println();
//		}
		
		
//	List<Hotel>lista= this.hotelService.buscarHotelOuterLefttJoin();
//		
//		for (Hotel h : lista){
//		System.out.println(h.getNombre());
//		for (Habitacion ha : h.getHabitaciones()) {
//			System.out.println(ha.getNumero());
//		}
//			
//		}
//		
//		
//	List<Habitacion>listaa= this.habitacionService.buscarHotelOuterLefttJoin();
//		
//		for (Habitacion ha : listaa){
//		System.out.println(ha!= null ? ha.getNumero():null);
//		
//		}
//		
		
		// RIGHT
		
		System.out.println("RIGHT");
		
        List<Hotel>lista= this.hotelService.buscarHotelOuterRightJoin();
		
		for (Hotel h : lista){
		System.out.println(h!=  null?  h.getNombre() : null);
//		for (Habitacion ha : h.getHabitaciones()) {
//			System.out.println(ha.getNumero());
//		}
			
		}
		
		
	   List<Habitacion>listaR= this.habitacionService.buscarHotelOuterRightJoin();
		
		for (Habitacion ha : listaR){
		System.out.println(ha.getNumero());
		System.out.println(ha.getHotel());
		}
		
		
		
	}

}
