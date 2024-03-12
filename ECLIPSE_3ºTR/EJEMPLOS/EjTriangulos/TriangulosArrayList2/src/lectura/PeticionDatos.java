<<<<<<< HEAD
package lectura;

import java.util.Scanner;
import triangulos.Triangulo;

public class PeticionDatos {
	/****************************************************/
	/*									              */
	/* altaTriangulo: pide los datos de un triangulo */
	/*									              */
	/****************************************************/
	public static Triangulo altaTriangulo(Scanner sc) {
		double b, h;
		Triangulo t = null;

		System.out.println("Introducir Base ");
		b = Double.parseDouble(sc.nextLine());
		System.out.println("Introducir Altura ");
		h = Integer.parseInt(sc.nextLine());
		
		t = new Triangulo(b, h);

		return t;
	}
}
=======
package lectura;

import java.util.Scanner;
import triangulos.Triangulo;

public class PeticionDatos {
	/****************************************************/
	/*									              */
	/* altaTriangulo: pide los datos de un triangulo */
	/*									              */
	/****************************************************/
	public static Triangulo altaTriangulo(Scanner sc) {
		double b, h;
		Triangulo t = null;

		System.out.println("Introducir Base ");
		b = Double.parseDouble(sc.nextLine());
		System.out.println("Introducir Altura ");
		h = Integer.parseInt(sc.nextLine());
		
		t = new Triangulo(b, h);

		return t;
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
