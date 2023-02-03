package com.example.demo.repository;

import com.example.demo.modelo.Cliente;


public interface IClienteRepo {

public void create(Cliente cliente);
public Cliente read(String cedula);
public void update(Cliente cliente);
public void delete(String cedula);


	
}
