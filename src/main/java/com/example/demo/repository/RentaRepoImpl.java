package com.example.demo.repository;

import org.springframework.stereotype.Repository;


import com.example.demo.modelo.Renta;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class RentaRepoImpl implements IRentaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(Renta renta) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(renta);
		
	}

	@Override
	public Renta read(Integer id) {
		// TODO Auto-generated method stub
		
		return 
				this.entityManager.find(Renta.class, id)
				;
	}

	@Override
	public void update(Renta renta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(renta);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Renta renta = this.read(id);
		
		this.entityManager.remove(renta);
		
	}

	
}
