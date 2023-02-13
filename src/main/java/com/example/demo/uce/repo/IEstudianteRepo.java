package com.example.demo.uce.repo;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {

	
	public Estudiante buscarNombreQuery(String nombre);
	public Estudiante buscarApellidoQuery(String apellido);
	public Estudiante buscarGeneroQuery(String genero);
	public Estudiante buscarCedulaQuery(String cedula);
	
	public Estudiante buscarCiudadQuery(String ciudad);
	
	public Estudiante buscarPorNombreQueryTyped(String nombre);
	
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	
}
