package com.example.demo.repository;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {

//	Consultar un Estudiante por apellido
//	Consultar un Estudiante por genero
//	Consultar un Estudiante por cédula
//	Consultar un Estudiante por ciudad

	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorCiudadQuery(String ciudad);
	public void insertar(Estudiante estudiante);
	
}
