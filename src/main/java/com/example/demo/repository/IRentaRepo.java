package com.example.demo.repository;

import com.example.demo.modelo.Renta;

public interface IRentaRepo {

public void create(Renta renta);
public Renta  read(Integer id);
public void update(Renta renta);
public void delete(Integer id);


	
}
