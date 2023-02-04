package com.example.demo.repository;


import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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
		return null;
	}

	@Override
	public Estudiante buscarPorNombreQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
		
	myTypedQuery.setParameter("datoNombre", nombre);
	
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNAmedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre");
		myQuery.setParameter("datoNombre", nombre);
	
		return (Estudiante)myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNAmedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante>myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre",Estudiante.class);
		
		myQuery.setParameter("datoNombre", nombre);
	
		return myQuery.getSingleResult();
		
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		
		Query myQuery = this.entityManager.createNativeQuery("select * from estudiante  where estu_nombre=:datoNombre" , Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante)myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		
		myQuery.setParameter("datoNombre", nombre);
		
		return myQuery.getSingleResult();
	}

}
