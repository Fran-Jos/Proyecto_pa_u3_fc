package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		
		// select * from estudiante  where estu_nombre='Gabriela'
		
		// select e from Estudiante e where e.nombre = :datoNombre
		Query jpqlQuery = this.entityManager.createQuery(" select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		
		
		return (Estudiante)jpqlQuery.getSingleResult();
		
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		
		//select * from estudiante where estu_apellido = 'taco'
		
		// select e from Estudiante e where e.apellido = :datoApellido
		
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
		
		jpqlQuery.setParameter("datoApellido", apellido);
		
		
		return (Estudiante)jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		
		// select e from Estudiante e where e.genero = :datoGenero
		
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		
		jpqlQuery.setParameter("datoGenero", genero);
		
		return (Estudiante)jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		
		// select estu from Estudiante estu where estu.cedula = :datoCedula
		
		Query jpqlQuery = this.entityManager.createQuery("select estu from Estudiante estu where estu.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		
		
		return (Estudiante)jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		
		// select estu from Estudiante estu where estu.ciudad = :datoCiudad
		
				Query jpqlQuery = this.entityManager.createQuery("select estu from Estudiante estu where estu.ciudad = :datoCiudad");
				jpqlQuery.setParameter("datoCiudad", ciudad);
				
				
				return (Estudiante)jpqlQuery.getSingleResult();
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(estudiante);
		
	}

}