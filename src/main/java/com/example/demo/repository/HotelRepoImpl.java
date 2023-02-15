package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Iterator;
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
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		// Select * from hotel h join habitacion ha on h.hote_id_ha.habi_id_hotel
		TypedQuery<Hotel> typedQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h INNER JOIN h.habitaciones ha WHERE ha.tipoHabitacion = :datoTipo", Hotel.class);
		typedQuery.setParameter("datoTipo", tipoHabitacion);
		List<Hotel> listaHoteles = typedQuery.getResultList();
		
		List<Hotel> tmp;
		
		for(Hotel h: listaHoteles) {
			
			List<Habitacion> listaTemporal = new ArrayList<>();
			for (Habitacion ha : h.getHabitaciones()) {
				if (ha.getTipoHabitacion().equals(tipoHabitacion)) {
					listaTemporal.add(ha);
				}
			}
			
			h.setHabitaciones(listaTemporal);
		}
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> typedQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h OUTER RIGHT JOIN h.habitaciones ha WHERE ha.tipoHabitacion = :datoTipo",
				Hotel.class);

		return null;
	}

	@Override
	public List<Hotel> buscarHotelOuterLefttJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> typedQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h LEFT JOIN h.habitaciones ha WHERE ha.tipoHabitacion = :datoTipo", Hotel.class);
		typedQuery.setParameter("datoTipo", tipoHabitacion);
//		List<Hotel> listaHoteles = typedQuery.getResultList();
//		
//		for(Hotel h: listaHoteles) {
//			h.getHabitaciones().size();
//		}
//		return listaHoteles;
		
		return typedQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOuterFulltJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> typedQuery = this.entityManager.createQuery("JPQL", Hotel.class);

		return null;
	}

	@Override
	public List<Hotel> buscarHotelWhereJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> typedQuery = this.entityManager.createQuery("JPQL", Hotel.class);

		return null;
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> typedQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h  JOIN FETCH h.habitaciones ha WHERE ha.tipoHabitacion = :datoTipo", Hotel.class);
		typedQuery.setParameter("datoTipo", tipoHabitacion);
		List<Hotel> listaHoteles = typedQuery.getResultList();
		
		return listaHoteles;
	}
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> typedQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h   RIGHT JOIN h.habitaciones ha ", Hotel.class);
	
        List<Hotel> lista  = typedQuery.getResultList();
		
		
		return lista;
		
	}

	@Override
	public List<Hotel> buscarHotelOuterLefttJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> typedQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h  LEFT JOIN h.habitaciones ha", Hotel.class);
		List<Hotel> lista  = typedQuery.getResultList();
		
//		for (Hotel hotel : lista) {
//			hotel.getHabitaciones().size();
//			
//		}
//		
		return lista;
	}

	@Override
	public List<Hotel> buscarHotelOuterFulltJoin() {
		// TODO Auto-generated method stub
		return null;
	}
}
