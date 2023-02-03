package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IClienteRepo;
import com.example.demo.repository.IRentaRepo;
import com.example.demo.repository.IVehiculoRepo;

@Service
public class RentaServiceImpl implements IRentaService{

	@Autowired
	private  IRentaRepo iRentaRepo;
	
	@Autowired
	private  IClienteRepo clienteRepo;
	
	@Autowired
	private  IVehiculoRepo iVehiculoRepo;
	
	
	@Override
	public void agregar(Renta renta) {
		// TODO Auto-generated method stub
		this.iRentaRepo.create(renta);
	}

	@Override
	public void realizar(String cedula, String placa) {
		// TODO Auto-generated method stub
		

		
		Vehiculo v = this.iVehiculoRepo.read(placa);
		Cliente c = this.clienteRepo.read(cedula);
		
		 
		
		if (v != null && c != null) {
			
			List<Renta> nuevaC =  c.getRentas();
		    List<Renta> nuevaV =  v.getRentas();
			 
			Renta renta = new Renta();
			
			renta.setCliente(c);
			renta.setVehiculo(v);
			
			
			this.iRentaRepo.create(renta);
			
			
			
			nuevaC.add(renta);
			c.setRentas(nuevaC);
			
			this.clienteRepo.update(c);
			
			nuevaV.add(renta);
			v.setRentas(nuevaV);
			this.iVehiculoRepo.update(v);
			
			
			
			
			
			
		}
		else System.out.println("No se realizo la renta");
		
		
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return 
				this.iRentaRepo.read(id);
	}

	@Override
	public void actualizar(Renta renta) {
		// TODO Auto-generated method stub
		
		this.iRentaRepo.update(renta);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
		this.iRentaRepo.delete(id);
	}

}
