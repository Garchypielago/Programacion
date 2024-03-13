package Borrar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplo_Profe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int removeElem = 2;

		List<Integer> myList = new ArrayList<>();	//integer es un int genio
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(2);
		myList.add(5);
		myList.add(2);
		myList.add(6);
		myList.add(2);

		// Salida inicial
		System.out.println("Antes de borrar");
		System.out.println(myList);

		// error1
//		for(int i=0; i<myList.size(); i++) { //No se puede usar el for each por un error al borrar ya que se ralla
//			if(removeElem == myList.get(i))
//				myList.remove(i);
//		}

		// "error" 2
//		int i=1, k=myList.size();
//		
//		for(int j=0; j<k; k--) { //lo hicimos sin esto pero para ver que se pued usar y funciona
//		try {
//			for (Integer it:myList) {
//				if(removeElem==it)
//					myList.remove(it);
//				i++;
//			}
//		} catch (java.util.ConcurrentModificationException e) {
//			System.out.println(i);
//		}
//		}

		// solucion
		boolean primero = true;
		Iterator<Integer> itr = myList.iterator();
		while (itr.hasNext()) { // Puede haber nulos en elementos por eso funciona el hasnext con todos los
								// casos(0 y n)
			if (removeElem == itr.next())
				if (!primero)
					itr.remove();
				else
					primero=false;

		}

//		int aparicion = 0, contador = 1;
//		Iterator<Integer> itr = myList.iterator();
//		for (Integer it : myList) {
//			if (removeElem == it)
//				aparicion++;
//		}
//		while (itr.hasNext()) {
//			if (removeElem == itr.next())
//				if (aparicion > contador) {
//					itr.remove();
//					contador++;
//				}
//		}

		// Salida final
		System.out.println("Despues de borrar");
		System.out.println(myList);
	}

}
