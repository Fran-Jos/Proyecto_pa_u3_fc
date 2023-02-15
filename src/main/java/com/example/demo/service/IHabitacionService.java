package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Habitacion;


public interface IHabitacionService {

	public List<Habitacion> buscarHotelOuterRightJoin();

	public List<Habitacion> buscarHotelOuterLefttJoin();

	public List<Habitacion> buscarHotelOuterFulltJoin();


}
