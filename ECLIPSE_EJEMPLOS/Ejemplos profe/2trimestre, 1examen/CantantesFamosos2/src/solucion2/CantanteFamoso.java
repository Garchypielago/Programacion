package solucion2;

import java.util.ArrayList;
import java.util.Iterator;

public class CantanteFamoso {
	private String nombre;
	private ArrayList<Disco> discografia;

	public CantanteFamoso(String n)
	{
		nombre = n;
		discografia = new ArrayList<Disco>();
	}

	// Metodo asignar discos al cantante, agregara discos
	public void AsignarDisco(Disco c) {
		if (discografia.add(c)) {
			System.out.println("Disco agregado");
		} else {
			System.out.println("Disco no agregado");
		}
	}

	public String getNombre() {
		return nombre;
	}

	// Al pasar aqui el calculo de disco mas vendido, no necesito esto:
	
//	public ArrayList<Disco> getDiscos() {
//		return discografia;
//	}

public Disco discoMasVendido() {
		Disco disco, discoMax = null;
		Iterator<Disco> it = discografia.iterator();
		int max = Integer.MIN_VALUE;
		
		while (it.hasNext()) {
			disco = it.next();
			if (disco.getDVendidos() > max) {
				max = disco.getDVendidos();
				discoMax = disco;
			}
		}
		
		return discoMax;
	}

	public String toString() {
		return "Nombre: " + nombre + "\n" + this.discografia;
	}

}