package solucion2;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCantantes {
	// Atributos
	private ArrayList<CantanteFamoso> listaC;

	// Metodos
	public ListaCantantes() {
		listaC = new ArrayList<CantanteFamoso>();
	}

	public int devTamLista() {
		return listaC.size();
	}

	public void guardarCantante(CantanteFamoso c) {
		if (listaC.add(c)) {
			System.out.println("El cantante ha sido guardado");
		} else {
			System.out.println("El cantante no ha sido guardado");
		}
	}

	public void eliminarCantante(String nomCant) {
		// CREAMOS EL ITERADOR
		CantanteFamoso eliminado = null;

		Iterator<CantanteFamoso> it = listaC.iterator();
		int comprobar = 0;
		while (it.hasNext()) {
			CantanteFamoso c = it.next();

			// comparamos el mismo objeto en este caso Cantante, y asi sabr� cu�l eliminar
			if (c.getNombre().equalsIgnoreCase(nomCant)) {
				eliminado = c;
				it.remove();
				comprobar++;
			}
		}
		if (comprobar > 0)
			System.out.println("Se ha eliminado el cantante: \n " + eliminado);
		else
			System.out.println("No se ha encontrado el cantante: \n " + nomCant);
	}

// No hace falta hacer todo lo de abajo
	public void listarCantantesDiscos() {

		Iterator<CantanteFamoso> it = listaC.iterator();
		while (it.hasNext()) {
			System.out.println("Cantante: " + it.next() + "\n");
		}
	}

//	public void listarCantantesDiscos() {
//		CantanteFamoso cantante;
//		Disco disco;
//
//		Iterator<CantanteFamoso> it = listaC.iterator();
//		while (it.hasNext()) {
//			cantante = it.next();
//			System.out.println("Cantante: " + cantante.getNombre());
//			ArrayList<Disco> listaD = cantante.getDiscos();
//			Iterator<Disco> it2 = listaD.iterator();
//
//			while (it2.hasNext()) {
//				disco = it2.next();
//				System.out.println(disco);
//			}
//		}
//	}

	public void listarDiscoMasVendido() {
		CantanteFamoso cantante;
		Disco disco;

		Iterator<CantanteFamoso> it = listaC.iterator();
		while (it.hasNext()) {
			cantante = it.next();
			System.out.println("Cantante: " + cantante.getNombre());
			/*
			 *  Lo hacemos de forma que en la clase Cantante tengamos el
			 *  metodo que calcula el disco mas vendido
			 *  así desde este fuente no tenemos que acceder al ArrayList de discos
			 */
			 
//			ArrayList<Disco> listaD = cantante.getDiscos();
//			Iterator<Disco> it2 = listaD.iterator();
//
//			int max = -1;
//			while (it2.hasNext()) {
//				disco = it2.next();
//				if (disco.getDVendidos() > max) {
//					max = disco.getDVendidos();
//					discoMax = disco;
//				}
//			}
			disco = cantante.discoMasVendido();
			System.out.println(" Disco mas vendido: " + disco);
		}
	}

}