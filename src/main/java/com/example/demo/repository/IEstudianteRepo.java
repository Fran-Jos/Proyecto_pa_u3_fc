package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.DTO.EstudianteDTO;

public interface IEstudianteRepo {


	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public Estudiante buscarPorNombreQueryTyped(String nombre);
	public Estudiante buscarPorNombreNAmedQuery(String nombre);
	public Estudiante buscarPorNombreNAmedQueryTyped(String nombre);
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNombreNativeNamedQueryTyped(String nombre);

	
	public List<Estudiante> buscarPorNombreQueryList(String nombre);
	public List<Estudiante> buscarPorNombreNAmedQueryList(String nombre);
	
	public List<Estudiante> buscarPorNombreNativeNamedQueryTypedList(String nombre);

	public Estudiante buscarPorNombreQueryList_(String nombre);

	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre);
}
