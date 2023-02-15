package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class HabitacionRepoImpl implements IHabitacionRepo{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public List<Habitacion> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> typedQuery = this.entityManager.createQuery(
				"SELECT ha FROM Hotel h   RIGHT JOIN h.habitaciones ha ", Habitacion.class);
	
        List<Habitacion> lista  = typedQuery.getResultList();
		
//		for (Hotel hotel : lista) {
//			hotel.getHabitaciones().size();
//			
//		}
		
		return lista;
	}

	@Override
	public List<Habitacion> buscarHotelOuterLefttJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> typedQuery = this.entityManager.createQuery(
				"SELECT ha FROM Hotel h  LEFT JOIN h.habitaciones ha", Habitacion.class);
		List<Habitacion> lista  = typedQuery.getResultList();
		
//		for (Habitacion h : lista) {
//			hotel.getHabitaciones().size();
//			
//		}
		
		return lista;
	}

	@Override
	public List<Habitacion> buscarHotelOuterFulltJoin() {
		// TODO Auto-generated method stub
		return null;
	}



}
