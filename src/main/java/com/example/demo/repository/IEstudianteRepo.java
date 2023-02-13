package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

public interface IEstudianteRepo {
	// Devuelven un solo estudinate

	public void insertar(Estudiante estudiante);

	public Estudiante buscarPorNombre(String nombre);

	public Estudiante buscarPorNombreTypeQuery(String nombre);

	public Estudiante buscarPorApellidoNamedQueryTyped(String apellido);

	public Estudiante buscarPorApellidoNamedQuery(String apellido);

	public Estudiante buscarPorNombreNativeQuery(String nombre);

	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);

	public Estudiante buscarPorApellido(String apellido);

	public Estudiante buscarPorGenero(String genero);

	public Estudiante buscarPorCedula(String cedula);

	public Estudiante buscarPorCiudad(String ciudad);

	// Obtener el primero

	public Estudiante buscarPorNombreFirst(String genero);

	// Devuelven una lista de estudiantes

	public List<Estudiante> buscarPorNombreQueryList(String genero);

	public List<Estudiante> buscarPorApellidoNamedQueryTypedList(String apellido);

	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);

	// DTO
	public EstudianteDTO buscarPorNombreTypeQueryDTO(String nombre);

	// Criteria Api Query
	public Estudiante buscarPorNombreCriteria(String nombre);

	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String bandera);


	public int eliminarPorApellido(String apellido);
	public int actualizarPorApellido(String apellido,String nombre);
	public int eliminarPorNombre(String nombre);
	public int actualizarPorNombre(String nombre ,String apellido);
	public int eliminarPorCiudad(String ciudad);
	public int actualizarPorCiudad(String ciudad,String nombre);


}
