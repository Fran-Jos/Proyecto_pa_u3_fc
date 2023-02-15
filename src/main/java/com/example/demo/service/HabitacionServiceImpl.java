package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Habitacion;
import com.example.demo.repository.IHabitacionRepo;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private IHabitacionRepo habitacionRepo;
	@Override
	public List<Habitacion> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelOuterRightJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOuterLefttJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHotelOuterLefttJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOuterFulltJoin() {
		// TODO Auto-generated method stub
		return null;
	}

}
