package viajesArrayList;
import java.util.*;
public class Principal{
	final static int NUMVIAJES=3;

	/** En este ejercicio pongo el segundo supuesto. Hago una clase aparte 
	/** para el ArrayList
	/** en este caso voy a empezar a nombrar los viajes desde 1, en vez desde 0 
	**/

	public static void main(String args[]){		
		Scanner sc=new Scanner(System.in);
		int i=1;

		Trayectos recorrido = new Trayectos();
		
		while (i<=NUMVIAJES){
			System.out.println("\nViaje " + i);
			System.out.println("Introduce origen del viaje");
			String origen = sc.nextLine();
			System.out.println("Introduce destino del viaje");
			String destino = sc.nextLine();
			System.out.println("Introduce kilometros");
			double km = Double.parseDouble(sc.nextLine());
						
			recorrido.addTrayecto(new Viaje(origen, destino, km));	
			i++;
		}
		
		System.out.println("1.- Trayectos parciales dos a dos");
		recorrido.recorridosParciales();
		
		System.out.println("2.- Trayecto total");
		Viaje total = recorrido.recorridoTotal();
		
		if (total != null)
			System.out.println("\nTrayecto total " + total);
		else
			System.out.println("\nEl recorrido no permite la union de todos los trayectos/viajes.");
			
		sc.close();
	}
}