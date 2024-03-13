package Ej_02;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Viajes vacaciones = new Viajes();

		vacaciones.agregar("a", "b", 40);
		vacaciones.agregar("b", "c", 50);
		vacaciones.agregar("c", "d", 10);

		vacaciones.unirViajesA2();

		vacaciones.unirViajes();

		Viajes vacaciones2 = new Viajes();
		Scanner sc =  new Scanner(System.in);
		String origen, destino;
		double distancia;
		
		System.out.println("¿Cuantos viajes quieres escribir?");
		for(int n=Integer.parseInt(sc.nextLine()), i=0; i<n; i++) {
			System.out.println("Introduce origen del viaje:");
			origen=sc.nextLine();
			System.out.println("Introduce destino del viaje:");
			destino=sc.nextLine();
			System.out.println("Introduce distancia del viaje:");
			distancia=Integer.parseInt(sc.nextLine());
			
			vacaciones2.agregar(origen,destino,distancia);
		}
		vacaciones2.unirViajesA2();

		vacaciones2.unirViajes();

	}

}
