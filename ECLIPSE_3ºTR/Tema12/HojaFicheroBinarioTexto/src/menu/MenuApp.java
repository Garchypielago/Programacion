package menu;

import java.util.*;

class MenuApp{
	
	public static final int MAX_OPC=3;
	
	static int menu(int tope_op, Scanner sc)
	{
		int opcion_menu;
		
		System.out.println();
	    System.out.println("\t1. Escribir en un fichero binario");
		System.out.println("\t2. Mostrar por pantalla el contenido del fichero binario creado.");
		System.out.println("\t3. Salir.");
		do
		{
			System.out.print("\n\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu  < 1 || opcion_menu > tope_op);
		
	    return opcion_menu;
	}
	
	public static void main(String args[]){
		
	   int opcion=0;
	   
	   Scanner sc = new Scanner(System.in);
	   
	   while (opcion != MAX_OPC)
		{
			opcion = menu(MAX_OPC, sc);
			switch (opcion)
	      	{
	         case 1:
	                 break;
	         case 2:	
	                 break;
	     	}
	     }
	     sc.close();
	   }



		
		

}
