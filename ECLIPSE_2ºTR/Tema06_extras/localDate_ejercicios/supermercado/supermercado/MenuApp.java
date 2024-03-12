<<<<<<< HEAD
package supermercado;

import java.util.*;

import utilidades.CreacionObjetos;

class MenuApp{
	
	public static void main(String args[]){
		
		Supermercado mercadona = new Supermercado();
		creacionAlmacen(mercadona);
		
		

	}
	


	public static void creacionAlmacen(Supermercado sp) {

		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		while (opcion != 4) {
			opcion = Supermercado.menu(sc);
			switch (opcion) {
			case 1:
				Supermercado.agregarProducto(CreacionObjetos.crearAlimento(sp));
				break;
			case 2:
				Supermercado.agregarProducto(CreacionObjetos.crearTextil(sp));
				break;
			case 3:
				Supermercado.agregarProducto(CreacionObjetos.crearDrogue(sp));
				break;
			case 4:
				System.out.println("Fin de creacion de almacen.");
				System.out.println();
				break;
			}
		}
		sc.close();
	}

		
		

}
=======
package supermercado;

import java.util.*;

import utilidades.CreacionObjetos;

class MenuApp{
	
	public static void main(String args[]){
		
		Supermercado mercadona = new Supermercado();
		creacionAlmacen(mercadona);
		
		

	}
	


	public static void creacionAlmacen(Supermercado sp) {

		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		while (opcion != 4) {
			opcion = Supermercado.menu(sc);
			switch (opcion) {
			case 1:
				Supermercado.agregarProducto(CreacionObjetos.crearAlimento(sp));
				break;
			case 2:
				Supermercado.agregarProducto(CreacionObjetos.crearTextil(sp));
				break;
			case 3:
				Supermercado.agregarProducto(CreacionObjetos.crearDrogue(sp));
				break;
			case 4:
				System.out.println("Fin de creacion de almacen.");
				System.out.println();
				break;
			}
		}
		sc.close();
	}

		
		

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
