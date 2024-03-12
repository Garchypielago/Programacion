package ordenArrayPersonas;

import java.util.Arrays;

public class MainClass {
final static int TAM=5;

	public static void main(String[] args) {
		MainClass p = new MainClass();
		
		Persona[] arrayPersonas = new Persona[TAM];

		arrayPersonas[0] = new Persona("Mario", 22, 187);
		arrayPersonas[1] = new Persona("Pepe", 52, 173);
		arrayPersonas[2] = new Persona("Manuel", 27, 158);
		arrayPersonas[3] = new Persona("David", 25, 164);
		arrayPersonas[4] = new Persona("Alberto", 80, 184);

		System.out.println("\nArray sin ordenar\n");
		p.imprimeArrayPersonas(arrayPersonas);

		Arrays.sort(arrayPersonas); //si es array normal se puede usar esto

		System.out.println("\nArray ordenado ascendente por altura\n");

		p.imprimeArrayPersonas(arrayPersonas);

	}

	public void imprimeArrayPersonas(Persona[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + ". " + array[i]);
		}
	}
}
