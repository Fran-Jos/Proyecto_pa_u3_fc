package com.example.demo.repository;

import com.example.demo.modelo.Automovil;

public interface IAutomovilRepo {

	public Automovil buscarPorPlacaTypedQuery(String placa);
	public Automovil buscarPorMarcaTypedQuery(String marca);
	public Automovil buscarPorModeloTypedQuery(String modelo);
	
	public Automovil buscarPorPlacaNamedQuery(String placa);
	public Automovil buscarPorMarcaNamedQuery(String marca);
	public Automovil buscarPorModeloNamedQuery(String modelo);
	
	public Automovil buscarPorPlacaNativeQuery(String placa);
	public Automovil buscarPorMarcaNativeQuery(String marca);
	public Automovil buscarPorModeloNativeQuery(String modelo);
	
	public Automovil buscarPorPlacaNamedNativeQuery(String placa);
	public Automovil buscarPorMarcaNamedNativeQuery(String marca);
	public Automovil buscarPorModeloNamedNativeQuery(String modelo);
	
	public void insertar(Automovil automovil);
	
	
	
}
