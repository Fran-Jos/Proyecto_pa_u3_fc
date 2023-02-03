package com.example.demo.repository;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepo {

public void create(Vehiculo vehiculo);
public Vehiculo read(String placa);
public void update(Vehiculo vehiculo);
public void delete(String placa);


	
}
