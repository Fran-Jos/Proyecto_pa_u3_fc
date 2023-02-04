package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {

	public Estudiante buscarPorNombre(String nombre);
	public Estudiante buscarPorApellido(String apellido);
	public Estudiante buscarPorNombreTypedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQuerytyped(String nombre);
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNombreNativeNamedQueryTyped(String nombre);
}
