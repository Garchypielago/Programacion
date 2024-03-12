<<<<<<< HEAD
package hijos_vehiculo;

import Vehiculo.Vehiculo;

public class Coche extends Vehiculo{
	protected int npuertas;

	public Coche(String matricula, int npuertas) {
		super(matricula);
		this.npuertas = npuertas;
	}

	public int getNpuertas() {
		return npuertas;
	}

	@Override
	public String toString() {
		return super.toString() + ", número de puertas: " + npuertas; 
	}
	
	

}
=======
package hijos_vehiculo;

import Vehiculo.Vehiculo;

public class Coche extends Vehiculo{
	protected int npuertas;

	public Coche(String matricula, int npuertas) {
		super(matricula);
		this.npuertas = npuertas;
	}

	public int getNpuertas() {
		return npuertas;
	}

	@Override
	public String toString() {
		return super.toString() + ", número de puertas: " + npuertas; 
	}
	
	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
