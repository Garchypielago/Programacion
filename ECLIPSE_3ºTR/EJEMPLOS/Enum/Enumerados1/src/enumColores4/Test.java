<<<<<<< HEAD
package enumColores4;

//Programa Java para demostrar que los enum pueden tener 
// constructores y metodos concretos.

// Probamos el enumerado creado
public class Test {
	// Metodo
	public static void main(String[] args) {
		Color c1;

		System.out.println("Ahora le asignamos el objeto rojo de la enumeracion y se ejecuta el constructor para");
		System.out.println(" todos las constantes -> objetos");
		c1 = Color.ROJO; // Aqui le asignamos el objeto rojo de la enumeracion

//		Constructor llamado para : ROJO
//		Constructor llamado para : VERDE
//		Constructor llamado para : AZUL

		System.out.println();

		System.out.println(c1);

		System.out.println();

		c1.colorInfo(); // Ejecuta el metodo concreto
	}
}
=======
package enumColores4;

//Programa Java para demostrar que los enum pueden tener 
// constructores y metodos concretos.

// Probamos el enumerado creado
public class Test {
	// Metodo
	public static void main(String[] args) {
		Color c1;

		System.out.println("Ahora le asignamos el objeto rojo de la enumeracion y se ejecuta el constructor para");
		System.out.println(" todos las constantes -> objetos");
		c1 = Color.ROJO; // Aqui le asignamos el objeto rojo de la enumeracion

//		Constructor llamado para : ROJO
//		Constructor llamado para : VERDE
//		Constructor llamado para : AZUL

		System.out.println();

		System.out.println(c1);

		System.out.println();

		c1.colorInfo(); // Ejecuta el metodo concreto
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
