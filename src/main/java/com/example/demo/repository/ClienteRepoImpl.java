package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cliente;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(Cliente cliente) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(cliente);
		
	}

	@Override
	public Cliente read(String cedula) {
		// TODO Auto-generated method stub
		
		Cliente cliente = this.entityManager.find(Cliente.class, cedula);
		cliente.getRentas().size();
		return cliente;
		
	
		
	
	}

	@Override
	public void update(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public void delete(String cedula) {
		// TODO Auto-generated method stub
		Cliente cliente =  this.read(cedula); 
		
		this.entityManager.remove(cliente);
		
	}

}
