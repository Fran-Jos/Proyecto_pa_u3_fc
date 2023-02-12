package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class IAutomovilServiceImpl implements IAutomovilService{

	@Autowired
	private IAutomovilRepo automovilRepo;
	
	@Override
	public Automovil buscarPorPlacaTypedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaTypedQuery(placa);
	}

	@Override
	public Automovil buscarPorMarcaTypedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaTypedQuery(marca);
	}

	@Override
	public Automovil buscarPorModeloTypedQuery(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorModeloTypedQuery(modelo);
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNamedQuery(placa);
	}

	@Override
	public Automovil buscarPorMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNamedQuery(marca);
	}

	@Override
	public Automovil buscarPorModeloNamedQuery(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorModeloNamedQuery(modelo);
	}

	@Override
	public Automovil buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNativeQuery(placa);
	}

	@Override
	public Automovil buscarPorMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNativeQuery(marca);
	}

	@Override
	public Automovil buscarPorModeloNativeQuery(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorModeloNativeQuery(modelo);
	}

	@Override
	public Automovil buscarPorPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNamedNativeQuery(placa);
	}

	@Override
	public Automovil buscarPorMarcaNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNamedNativeQuery(marca);
	}

	@Override
	public Automovil buscarPorModeloNamedNativeQuery(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorModeloNamedNativeQuery(modelo);
	}

	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);
	}

}
