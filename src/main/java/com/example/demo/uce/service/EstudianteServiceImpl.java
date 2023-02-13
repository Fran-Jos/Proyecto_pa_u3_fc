package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.repo.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public Estudiante buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarNombreQuery(nombre);
	}

	@Override
	public Estudiante buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarApellidoQuery(apellido);
	}

	@Override
	public Estudiante buscarGenero(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarGeneroQuery(genero);
	}

	@Override
	public Estudiante buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarCedulaQuery(cedula);
	}

	@Override
	public Estudiante buscarCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarCiudadQuery(ciudad);
	}

	@Override
	public Estudiante buscarPorNombreQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryTyped(apellido);
	}

	@Override
	public Estudiante buscarPorNombreNamedQuer(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNamedQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNamedQuerTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNamedQueryTyped(nombre);
	}


}
