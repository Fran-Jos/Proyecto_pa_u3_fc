package com.example.demo;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class DeberFjchanataxiApplication implements CommandLineRunner {
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IRentaService iRentaService;

	public static void main(String[] args) {
		SpringApplication.run(DeberFjchanataxiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// ---CREACIÓN DE VEHICULOS-----
		
		Vehiculo v1 = new Vehiculo();
		v1.setColor("negro");
		v1.setMarca("Toyota");
		v1.setModelo("corolla");
		v1.setPlaca("PUT-0023");
		Vehiculo v2 = new Vehiculo();
		v2.setColor("blanco");
		v2.setMarca("Toyota");
		v2.setModelo("Hilux");
		v2.setPlaca("RVF-0773");
		Vehiculo v3 = new Vehiculo();
		v3.setColor("negro");
		v3.setMarca("chevroleth");
		v3.setModelo("aveo");
		v3.setPlaca("TLK-2344");
		Vehiculo v4 = new Vehiculo();
		v4.setColor("blanco");
		v4.setMarca("chevroleth");
		v4.setModelo("dimax");
		v4.setPlaca("OTE-7663");
		Vehiculo v5 = new Vehiculo();
		v5.setColor("rojo");
		v5.setMarca("volfwagen");
		v5.setModelo("gol");
		v5.setPlaca("CBT-9923");
		Vehiculo v6 = new Vehiculo();
		v6.setColor("azul");
		v6.setMarca("nizzan");
		v6.setModelo("razt");
		v6.setPlaca("PFT-0863");
		
		//---CREACIÓN DE CLIENTES-----
		
		Cliente c1 = new Cliente();
		c1.setApellido("Nuñez");
		c1.setCedula("1244322223");
		c1.setEdad(24);
		c1.setNombre("Marco");
		Cliente c2 = new Cliente();
		c2.setApellido("Chanataxi");
		c2.setCedula("176654349");
		c2.setEdad(21);
		c2.setNombre("Marco");
		Cliente c3 = new Cliente();
		c3.setApellido("Mancheno");
		c3.setCedula("17554300093");
		c3.setEdad(34);
		c3.setNombre("José");
		Cliente c4 = new Cliente();
		c4.setApellido("Gabriela");
		c4.setCedula("17666533321");
		c4.setEdad(31);
		c4.setNombre("Gabriela");
		Cliente c5 = new Cliente();
		c5.setApellido("Gualotuña");
		c5.setCedula("1764407783");
		c5.setEdad(42);
		c5.setNombre("Mercedes");
		Cliente c6 = new Cliente();
		c6.setApellido("Toapanta");
		c6.setCedula("176654332111");
		c6.setEdad(46);
		c6.setNombre("Fernando");
		
	
		
	
		
		
		//INGRESAMOS LOS DATOS A LA BASE DE DATOS
		
		this.iVehiculoService.agregar(v6);
		this.iVehiculoService.agregar(v5);
		this.iVehiculoService.agregar(v4);
		this.iVehiculoService.agregar(v3);
		this.iVehiculoService.agregar(v2);
		this.iVehiculoService.agregar(v1);
		
		this.clienteService.agregar(c6);
		this.clienteService.agregar(c5);
		this.clienteService.agregar(c4);
		this.clienteService.agregar(c3);
		this.clienteService.agregar(c2);
		this.clienteService.agregar(c1);

        //Realizamos las rentas:
		
		
		this.iRentaService.realizar("17666533321" ,"CBT-9923");
		this.iRentaService.realizar("1244322223", "PUT-0023");
	    this.iRentaService.realizar("1244322223", "CBT-9923");
		
	    
	    
         Cliente cliOJO = this.clienteService.buscar("1244322223");

         System.out.println(cliOJO);
	    
	    
         Vehiculo vehiculoOJO = this.iVehiculoService.buscar("CBT-9923");

         System.out.println(vehiculoOJO);
         
         
        
         
         this.iRentaService.eliminar(2);
         
         this.iVehiculoService.eliminar("RVF-0773");
         
         Cliente cli = this.clienteService.buscar("17554300093");
         
         cli.setApellido("Zurita");
         this.clienteService.actualizar(cli);
         


 


		
		
	}

}
