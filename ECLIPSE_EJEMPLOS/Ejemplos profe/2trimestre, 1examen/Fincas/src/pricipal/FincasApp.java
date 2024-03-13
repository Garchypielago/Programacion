package pricipal;
import java.util.*;

import datos.Finca;
import fincas.Fincas;
import lectura.Lector;
	
public class FincasApp {
	
	public static final int MAX_OPC=4;
		
	// menu
	static int menu(int tope_op, Scanner sc) {
			int opcion_menu;
			
			System.out.println();
		    System.out.println("\t1. Introducir datos de las fincas.");
			System.out.println("\t2. Mostrar una finca dado su nombre.");
			System.out.println("\t3. Mostrar todas las fincas.");
			System.out.println("\t4. Salir.");
			do
			{
				System.out.print("\n\n\tElija opcion:");
				opcion_menu=Integer.parseInt(sc.nextLine());
			} while (opcion_menu  < 1 || opcion_menu > tope_op);
			
		    return opcion_menu;
	}
			
	//programa principal
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		boolean primera = true;
		int opcion = 0;
		Fincas misFincas = null;
		Finca unaFinca = null;
		String nombreFinca;
		
		while (opcion != MAX_OPC)
		{
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
	         case 1:
	                // Introducimos los datos para cada finca
	              	// la primera vez creamos el objeto misFincas
	        	 	if (primera) {
	        	 		misFincas = new Fincas();
	        	 		primera = false;
	        	 	}
	                unaFinca = Lector.rellenarFinca(sc);
	                if (unaFinca != null) // es bueno comprobarlo cada vez
	                	 misFincas.introducirFinca(unaFinca);
	                else
	                	System.out.println("No se ha podido crear la finca");
	                
	                break;
	         case 2:
	     			 // Mostrar finca dado su nombre
	     			if (misFincas != null) {
	     			 	System.out.print("Introduzca el nombre de la finca a mostrar: ");
	                    nombreFinca= sc.nextLine();
	                	misFincas.mostrarFincaNombre(nombreFinca);
	     			 }
	     			 else
	     			 	 System.out.println("Debe introducir primero los datos de alguna finca.");
	     			 		
	                 break;
	         case 3:
	     			 // Mostrar todas las fincas
	        	 	if (misFincas != null)	
	     			 	System.out.println(misFincas);	
	     			else
	     			 	System.out.println("Debe introducir primero los datos de alguna finca.");
	     			 	
	                break;	                 
	     	}
			
	     }
	     sc.close();		
	}
}
