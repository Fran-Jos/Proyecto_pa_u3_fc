	package com.example.demo.service;

import com.example.demo.modelo.Cliente;

public interface IClienteService {

public void agregar(Cliente cliente);
public Cliente buscar(String cedula);
public void actualizar(Cliente cliente);
public void eliminar(String cedula);


	
}
