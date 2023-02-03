package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;

import com.example.demo.repository.IClienteRepo;


@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.create(cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return 
				this.clienteRepo.read(cedula)
				;
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.update(cliente);
		
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
		this.clienteRepo.delete(cedula);
	}
	
	

}
