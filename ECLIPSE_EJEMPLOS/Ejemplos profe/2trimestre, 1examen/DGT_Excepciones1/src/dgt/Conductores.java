package dgt;

import java.util.Scanner;

import excepciones.CodigoIncorrectoException;
import excepciones.PorcentajeIncorrectoException;
import utilidades.CreacionObjetos;

public class Conductores {
	Conductor[] arrayConductores;
	int maxConductores;

	public Conductores(int tam) {
		arrayConductores = new Conductor[tam];
		maxConductores = tam;
	}

	public void aniadirConductor(Conductor unConductor) {
		arrayConductores[Conductor.getNumCond() - 1] = unConductor;
	}

	public boolean aniadirMuestra(int pos, Scanner sc) {
		boolean hayExcepcion = true;

		if (arrayConductores[pos - 1] != null) { // Hay conductor en esa posición
			if (arrayConductores[pos - 1].cabenMuestras()) {// Hay espacio para una muestra mas
				while (hayExcepcion) {
					try {
						Muestra m = CreacionObjetos.crearMuestra(sc);
						hayExcepcion = false;
						// Termina aqui si se ha producido excepcion por no cumplirse las condiciones
						if (m != null) {
							arrayConductores[pos - 1].ingresarMuestra(m);
							return true;
						}
					} catch (CodigoIncorrectoException | PorcentajeIncorrectoException e) {
						System.out.println(e.getMessage());						
					}
				}
			} else {
				System.out.println("No se admiten mas muestras para ese conductor");
				return false; // No caben mas muestras
			}
		} else {
			System.out.println("No hay conductor en esa posicion");
			return false; // No caben mas muestras
		}

		return true;
	}

	

	public void mostrarConductores() {
		for (int i = 0; i < Conductor.getNumCond(); i++) {
			System.out.println(arrayConductores[i]);
			System.out.println();
		}
	}

	public boolean mostrarConductor(int pos) {
		if (arrayConductores[pos - 1] != null) {
			System.out.println(arrayConductores[pos - 1]);
			System.out.println();
			return true;
		} else
			return false;
	}

	public boolean mostrarMuestras(int pos) {
		if (arrayConductores[pos - 1] != null) {
			System.out.println(arrayConductores[pos - 1].escribirArrayMuestras());
			System.out.println();
			return true;
		} else
			return false;
	}

}
