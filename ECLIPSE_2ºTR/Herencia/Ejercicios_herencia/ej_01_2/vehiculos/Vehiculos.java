package vehiculos;

import java.util.*;

import excepciones_ej01_2.*;
import hijos_vehiculo.*;
import Vehiculo.Vehiculo;

public class Vehiculos {

	private ArrayList<Vehiculo> v;

	public Vehiculos() {
		super();
		this.v = new ArrayList<Vehiculo>();
	}

	public void mostrarVehiculos() {
		for (Vehiculo ve : v) {
			System.out.println(ve.toString());
		}
	}

	public void ponerRemolqueTodos(int peso) {
		for (Vehiculo ve : v) {
			if (ve instanceof Camion) {
				((Camion) ve).ponRemolque(peso);
			}
		}
		System.out.println("Remolque añadido a todos los camiones");
	}

	public void agregarVehiculo(Vehiculo add) throws MatriculaRepetida {
		if (encontrarMatricula(add.getMatricula())) {
			throw new MatriculaRepetida("Matricula repetida");
		}
		v.add(add);
		System.out.println("Vehiculo añadido");
	}

	public void borrarPesados() {
		Iterator<Vehiculo> it = v.iterator();

		while (it.hasNext()) {
			Vehiculo v1 = (Vehiculo) it.next();
			if (v1 instanceof Camion && ((Camion) v1).getRemolque().getPeso() > 1000) {
				it.remove();
			}
		}
		System.out.println("Borrados los pesados");
	}

	public void ponRemolque(int peso, String mat) {
		boolean confirmar=false;
		for (Vehiculo ve : v) {
			if (ve instanceof Camion && ve.getMatricula().equalsIgnoreCase(mat)) {
				((Camion) ve).ponRemolque(peso);
				System.out.println("Puesto el remolque a " + mat);
				confirmar = true;
			} 
		}
		if(!confirmar) {
			System.out.println("No se encontro el camion");
		}

	}

	public void acelerarVehiculo(String mat, int vel) throws DemasiadoRapidoExcepcion {

		boolean confirmar=false;
		for (Vehiculo ve : v) {
			if (ve.getMatricula().equalsIgnoreCase(mat)) {
				ve.acelerar(vel);
				System.out.println("Vehiculo acelerado");
				confirmar = true;
			}
		}
		if(!confirmar) {
			System.out.println("No se encontro el vehiculo");
		}
	}

	public boolean encontrarMatricula(String mat) {
		for (Vehiculo ve : v) {
			if (ve.getMatricula().equals(mat)) {
				return true;
			}
		}
		return false;
	}

}
