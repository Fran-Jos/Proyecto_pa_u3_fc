	package com.example.demo.service;

import com.example.demo.modelo.Renta;

public interface IRentaService {

public void agregar(Renta renta);
public void realizar(String cedula , String placa);
public Renta buscar(Integer id);
public void actualizar(Renta renta);
public void eliminar(Integer id);


	
}
