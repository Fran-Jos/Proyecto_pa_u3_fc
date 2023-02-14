package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3WdApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	

		

		for (Hotel h : this.hotelService.buscarHotelInnerJoin("VIP")) {
			System.out.println(h.getNombre());
			for(Habitacion ha: h.getHabitaciones()) {
				System.out.println("La habitacion de: " + h.getNombre() + " : " +  ha.getNumero());
			}
		}

		/*
		 * this.hotelService.buscarHotelOuterRightJoin("").forEach(System.out::println);
		 * this.hotelService.buscarHotelOuterLefttJoin("").forEach(System.out::println);
		 * this.hotelService.buscarHotelOuterFulltJoin("").forEach(System.out::println);
		 * this.hotelService.buscarHotelWhereJoin("").forEach(System.out::println);
		 * this.hotelService.buscarHotelFetchJoin("").forEach(System.out::println);
		 */
		
		System.out.println(this.hotelService.buscarHotelInnerJoin("lujo"));
		System.out.println(this.hotelService.buscarHotelOuterLefttJoin("lujo"));

	}

}
