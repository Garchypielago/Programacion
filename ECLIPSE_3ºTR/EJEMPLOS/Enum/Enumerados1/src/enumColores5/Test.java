<<<<<<< HEAD
package enumColores5;

//Programa Java para demostrar que los enum pueden tener 
//Constructores y m�todos concretos.

enum Color {

	// Enums
	ROJO("Rojo", 3), AZUL("Azul", 5);

	// Atributos
	private String nombreColor;
	private int numColor;

	private int contador = 0;

	// Constructor
	Color(String nom, int col) {

		this.nombreColor = nom;
		this.numColor = col;
		this.contador++;

		System.out.println(this.nombreColor + " - " + this.numColor + " - " + this.contador);
		// Rojo - 3 - 1
		// Azul - 5 - 1
	}
}

public class Test {

	public static void main(String[] args) {

		// System.out.println("Instanciando: " + Color.ROJO);

		// Se instancian todas las instancias la primera vez que se
		// usa uno de los enumerados.
		Color c1;
		c1 = Color.AZUL;
        System.out.println("Instanciando: " + c1);
        
        Color c2;
        c2 = Color.ROJO;
        System.out.println("Instanciando: " + c2);
        
        Color c3;
        c3 = Color.ROJO;
        System.out.println("Instanciando: " + c3);
	}
}
=======
package enumColores5;

//Programa Java para demostrar que los enum pueden tener 
//Constructores y m�todos concretos.

enum Color {

	// Enums
	ROJO("Rojo", 3), AZUL("Azul", 5);

	// Atributos
	private String nombreColor;
	private int numColor;

	private int contador = 0;

	// Constructor
	Color(String nom, int col) {

		this.nombreColor = nom;
		this.numColor = col;
		this.contador++;

		System.out.println(this.nombreColor + " - " + this.numColor + " - " + this.contador);
		// Rojo - 3 - 1
		// Azul - 5 - 1
	}
}

public class Test {

	public static void main(String[] args) {

		// System.out.println("Instanciando: " + Color.ROJO);

		// Se instancian todas las instancias la primera vez que se
		// usa uno de los enumerados.
		Color c1;
		c1 = Color.AZUL;
        System.out.println("Instanciando: " + c1);
        
        Color c2;
        c2 = Color.ROJO;
        System.out.println("Instanciando: " + c2);
        
        Color c3;
        c3 = Color.ROJO;
        System.out.println("Instanciando: " + c3);
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
