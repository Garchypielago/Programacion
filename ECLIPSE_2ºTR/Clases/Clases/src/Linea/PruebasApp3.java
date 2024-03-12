package Linea;

/**************************************************************/
/* Comprueba si una linea es paralela a alguno de los ejes    */
/* a diferencia del caso anterior, ahora el metodo esta en la */
/* propia clase Linea  										  */
/**************************************************************/

public class PruebasApp3 {

// Movemos los metodos esLineaParalelaEjes a la clase Linea3
// que es mas logico, pues es una propiedad de la linea

	public static void main(String[] args) {
		Linea3 l1, l2, l3;
		Punto3 punto1, punto2;

		punto1 = new Punto3(1, 10);
		punto2 = new Punto3(1, 20);
		l1 = new Linea3(punto1, punto2);
		System.out.println(l1);
		System.out.println("Longitud " + l1.longitud());

		// if (esLineaParalelaEjes(punto1, punto2))
		if (l1.esLineaParalelaEjes())
			System.out.println("Es una linea paralela a un eje");
		else
			System.out.println("No es una linea paralela a un eje");

		punto1 = new Punto3(1, 1);
		punto2 = new Punto3(2, 2);
		l2 = new Linea3(punto1, punto2);
		System.out.println(l2);
		System.out.println("Longitud " + l2.longitud());

		// if (esLineaParalelaEjes(punto1, punto2))
		if (l2.esLineaParalelaEjes())
			System.out.println("Es una linea paralela a un eje");
		else
			System.out.println("No es una linea paralela a un eje");

		// Probamos el segundo metodo:
		punto1 = new Punto3(10, -1);
		punto2 = new Punto3(-2, 20);
		l3 = new Linea3(punto1, punto2);
		System.out.println(l3);

		System.out.println("Longitud " + l3.longitud());

		if (l3.esLineaParalelaEjes())
			System.out.println("Es una linea paralela a un eje");
		else
			System.out.println("No es una linea paralela a un eje");
	}

}
