<<<<<<< HEAD
package main;

import java.util.*;
import herencia.*;
import interfaz.*;

public class Pruebas00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<IAlmacen> almacen = new ArrayList<IAlmacen>();
		almacen.add(new Armario());
		almacen.add(new Zapatero());
		almacen.add(new Armario());
		
		Scanner sc = new Scanner(System.in);
		
		
		for(IAlmacen IA : almacen) {
			
			String input, input2,  talla;
			int numinput, numero;
			
			do {
			System.out.println("Quieres guardar ropa o zapatos?");
			input=sc.nextLine();
			}while(!input.equalsIgnoreCase("ropa") && !input.equalsIgnoreCase("zapatos"));
			
			System.out.println();
			System.out.println("Escribe el nombre del item:");
			input2=sc.nextLine();
			System.out.println("Escribe el id del item");
			numinput=Integer.parseInt(sc.nextLine());
			if(input.equalsIgnoreCase("ropa")){
				System.out.println("Escribe la talla:");
				talla=sc.nextLine();
				
				IA.almacenar((Ropa) new Ropa(input2, numinput, talla));
			} else {
				System.out.println("Escribe el numero");
				numero=Integer.parseInt(sc.nextLine());
				
				IA.almacenar((Zapatos) new Zapatos(input2, numinput, numero));
			}
			
		}
		
		
	}

}
=======
package main;

import java.util.*;
import herencia.*;
import interfaz.*;

public class Pruebas00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<IAlmacen> almacen = new ArrayList<IAlmacen>();
		almacen.add(new Armario());
		almacen.add(new Zapatero());
		almacen.add(new Armario());
		
		Scanner sc = new Scanner(System.in);
		
		
		for(IAlmacen IA : almacen) {
			
			String input, input2,  talla;
			int numinput, numero;
			
			do {
			System.out.println("Quieres guardar ropa o zapatos?");
			input=sc.nextLine();
			}while(!input.equalsIgnoreCase("ropa") && !input.equalsIgnoreCase("zapatos"));
			
			System.out.println();
			System.out.println("Escribe el nombre del item:");
			input2=sc.nextLine();
			System.out.println("Escribe el id del item");
			numinput=Integer.parseInt(sc.nextLine());
			if(input.equalsIgnoreCase("ropa")){
				System.out.println("Escribe la talla:");
				talla=sc.nextLine();
				
				IA.almacenar((Ropa) new Ropa(input2, numinput, talla));
			} else {
				System.out.println("Escribe el numero");
				numero=Integer.parseInt(sc.nextLine());
				
				IA.almacenar((Zapatos) new Zapatos(input2, numinput, numero));
			}
			
		}
		
		
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
