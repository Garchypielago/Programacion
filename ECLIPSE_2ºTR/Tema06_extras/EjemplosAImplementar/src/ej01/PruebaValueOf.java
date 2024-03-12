<<<<<<< HEAD
package ej01;


enum Animal {
	PERRO, GATO
};


public class PruebaValueOf {
	public static void main(String[] args) {
		try {
			Animal animal = Animal.valueOf(args[0]);
			switch (animal) {
			case PERRO:
				System.out.println("El perro ladra.");
				break;
			case GATO:
				System.out.println("El gato maulla.");
				break;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("No es un tipo aceptado.");
		}

	}
}
=======
package ej01;


enum Animal {
	PERRO, GATO
};


public class PruebaValueOf {
	public static void main(String[] args) {
		try {
			Animal animal = Animal.valueOf(args[0]);
			switch (animal) {
			case PERRO:
				System.out.println("El perro ladra.");
				break;
			case GATO:
				System.out.println("El gato maulla.");
				break;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("No es un tipo aceptado.");
		}

	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
