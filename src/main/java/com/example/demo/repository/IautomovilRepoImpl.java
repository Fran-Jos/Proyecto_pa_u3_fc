package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class IautomovilRepoImpl implements IAutomovilRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public Automovil buscarPorPlacaTypedQuery(String placa) {
		// TODO Auto-generated method stub
		
		TypedQuery<Automovil>myTypedQuery = this.entityManager.createQuery("select a from Automovil a where a.placa = :datoPlaca", Automovil.class ) ;
		
		myTypedQuery.setParameter("datoPlaca", placa);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorMarcaTypedQuery(String marca) {
		// TODO Auto-generated method stub
		
        TypedQuery<Automovil>myTypedQuery = this.entityManager.createQuery("select a from Automovil a where a.marca = :datoMarca", Automovil.class ) ;
		
		myTypedQuery.setParameter("datoMarca", marca);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorModeloTypedQuery(String modelo) {
		// TODO Auto-generated method stub
		
        TypedQuery<Automovil>myTypedQuery = this.entityManager.createQuery("select a from Automovil a where a.modelo = :datoModelo", Automovil.class ) ;
		
		myTypedQuery.setParameter("datoModelo", modelo);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		
		Query myNamedQuery = this.entityManager.createNamedQuery("Automovil.buscarPorPlaca");
		myNamedQuery.setParameter("datoPlaca", placa);
		
		return (Automovil) myNamedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		
		Query myNamedQuery = this.entityManager.createNamedQuery("Automovil.buscarPorMarca");
		myNamedQuery.setParameter("datoMarca", marca);
		
		return (Automovil) myNamedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorModeloNamedQuery(String modelo) {
		// TODO Auto-generated method stub
		
		Query myNamedQuery = this.entityManager.createNamedQuery("Automovil.buscarPorModelo");
		myNamedQuery.setParameter("datoModelo", modelo);
		
		return (Automovil) myNamedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		
		Query myquery = this.entityManager.createNativeQuery("SELECT a.* FROM automovil a WHERE a.auto_placa = :datoPlaca", Automovil.class);
		
		myquery.setParameter("datoPlaca" , placa);
		
		
		return (Automovil) myquery.getSingleResult();
	}

	@Override
	public Automovil buscarPorMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
       Query myquery = this.entityManager.createNativeQuery("SELECT a.* FROM automovil a WHERE a.auto_marca = :datoMarca", Automovil.class);
		
		myquery.setParameter("datoMarca" , marca);
		
		
		return (Automovil) myquery.getSingleResult();
	}

	@Override
	public Automovil buscarPorModeloNativeQuery(String modelo) {
		// TODO Auto-generated method stub
	       Query myquery = this.entityManager.createNativeQuery("SELECT a.* FROM automovil a WHERE a.auto_modelo = :datoModelo", Automovil.class);
			
			myquery.setParameter("datoModelo" ,modelo);
			
			
			return (Automovil) myquery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.bucarPorPlacaNNQ", Automovil.class);
		myQuery.setParameter("datoPlaca", placa);
		
		return myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorMarcaNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.bucarPorMarcaNNQ", Automovil.class);
		myQuery.setParameter("datoMarca", marca);
		
		return myQuery.getSingleResult();	
		}

	@Override
	public Automovil buscarPorModeloNamedNativeQuery(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.bucarPorModeloNNQ", Automovil.class);
		myQuery.setParameter("datoModelo", modelo);
		
		return myQuery.getSingleResult();	
		}

	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}

}
