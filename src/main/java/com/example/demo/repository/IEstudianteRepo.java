package com.example.demo.repository;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {


	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public Estudiante buscarPorNombreQueryTyped(String nombre);
	public Estudiante buscarPorNombreNAmedQuery(String nombre);
	public Estudiante buscarPorNombreNAmedQueryTyped(String nombre);
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNombreNativeNamedQueryTyped(String nombre);

}
