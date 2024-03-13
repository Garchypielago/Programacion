package main;

import java.util.*;

import interfaz.*;

public class Pruebas {
	class MenuApp{
		
		public static final int MAX_OPC=3;
		
		static int menu(int tope_op, Scanner sc)
		{
			int opcion_menu;
			
			System.out.println();
		    System.out.println("\t1. Añadir ropa al armario");
			System.out.println("\t2. Añadir zapatos al zapatero");
		    System.out.println("\t3. Recuperar ropa del armario");
			System.out.println("\t4. Recuperar zapatos del zapatero");
			System.out.println("\t5. Salir.");
			do
			{
				System.out.print("\n\n\tElija opcion:");
				opcion_menu = Integer.parseInt(sc.nextLine());
			} while (opcion_menu  < 1 || opcion_menu > tope_op);
			
		    return opcion_menu;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<IAlmacen> almacen = new ArrayList<IAlmacen>();
		almacen.add(new Armario());
		almacen.add(new Zapatero());
		almacen.add(new Armario());
		
		 int opcion=0;
		   
		   Scanner sc = new Scanner(System.in);
		   
		   while (opcion != MAX_OPC)
			{
				opcion = menu(MAX_OPC, sc);
				switch (opcion)
		      	{
		         case 1:
		                 System.out.println("Primera opcion");
		                 break;
		         case 2:
		     			 System.out.println("Segunda opcion");		
		                 break;
		     	}
		     }
		     sc.close();
		   }
		
		

	}

}
