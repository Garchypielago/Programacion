package Ej_02;

import java.util.*;

import lector.Lector;

public class Banco {
	
	private ArrayList<Cuenta> Cuentas;

	public Banco() {
		super();
		Cuentas = new ArrayList<Cuenta>();
	}

	public ArrayList<Cuenta> getCuentas() {
		return Cuentas;
	}
	
	public Cuenta crearCuenta(Scanner sc) {
		int numCuenta=Lector.leeInt(sc, "Introduce el numero de cuenta");
		double saldo=Lector.leeDouble(sc, "Introduce de saldo inicial");
		
		return new Cuenta(numCuenta, saldo);
	}
	
	public void guardarCuenta(Cuenta cuenta) {
		Cuentas.add(cuenta);
	}
	
	public void sacarDeCuenta(Scanner sc) {
		int numcuenta=Lector.leeInt(sc, "De que cuenta quieres sacar dinero");
//		Cuentas.get(i)
		double sacar=Lector.leeDouble(sc, "Cuanto quieres sacar");
	}
	
	

}
