	package com.example.demo.service;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {

public void agregar(Vehiculo vehiculo);
public Vehiculo buscar(String placa);
public void modificar(Vehiculo vehiculo);
public void eliminar(String placa);


	
}
