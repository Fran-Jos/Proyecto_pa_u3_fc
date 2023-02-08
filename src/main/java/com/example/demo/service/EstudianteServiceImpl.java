package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return 
				this.estudianteRepo.buscarPorNombreQuery(nombre);
				
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return 
				this.estudianteRepo.buscarPorApellidoQuery(apellido)
				;
	}

	@Override
	public Estudiante buscarPorNombreTypedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryTyped(nombre);
	}



	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		
		return
		this.estudianteRepo.buscarPorNombreNAmedQuery(nombre);
		
	}

	@Override
	public Estudiante buscarPorNombreNamedQuerytyped(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNAmedQueryTyped(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeNamedQueryTyped(nombre);
	}

	@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryList(nombre);
	}

	@Override
	public List<Estudiante> buscarPorNombreNAmedQueryList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarPorNombreNativeNamedQueryTypedList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante buscarPorNombreQueryList_(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryList_(nombre);
	}

}
