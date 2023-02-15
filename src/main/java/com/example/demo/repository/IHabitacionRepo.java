package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Habitacion;

public interface IHabitacionRepo {

	public List<Habitacion> buscarHotelOuterRightJoin();

	public List<Habitacion> buscarHotelOuterLefttJoin();

	public List<Habitacion> buscarHotelOuterFulltJoin();

	
}
