package reales;

public class ArrayListRealesMain {
	public static void main(String[] args) {
		final int TAM = 5;
		// Instanciamos una clase que tiene como atributo un array de un numero
		// de posiciones TAM, y calculamos con los metodos de la interfaz, el valor
		// mas grande, mas pequeño y la suma de todos los elementos

		ArrayReales x = new ArrayReales(TAM);

		System.out.println(x);
		System.out.println("Minimo : " + x.minimo());
		System.out.println("Maximo : " + x.maximo());
		System.out.println("Sumatorio: " + x.sumatorio());

		// Instanciamos una clase que tiene como atributo un Arraylist, rellenando un
		// numero
		// de posiciones TAM, y calculamos con los metodos de la interfaz, el valor
		// mas grande, mas pequeño y la suma de todos los elementos

		ArrayListReales y = new ArrayListReales(TAM);

		System.out.println(y);
		System.out.println("Minimo : " + y.minimo());
		System.out.println("Maximo : " + y.maximo());
		System.out.println("Sumatorio: " + y.sumatorio());

		// En ambos casos, los datos se generan aleatoriamente
	}
}
