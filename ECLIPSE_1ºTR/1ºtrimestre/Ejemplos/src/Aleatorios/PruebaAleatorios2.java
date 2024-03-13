package aleatorios;

import java.util.Random;

public class PruebaAleatorios2 {
	public static void main(String[] args) {
		final int N = 10;
		Random rnd = new Random();

		System.out.println("\nGeneramos "+ N + " enteros\n");
		for (int i = 0; i < N; i++) {
			System.out.print("\t" + rnd.nextInt());
		}
		System.out.println("");

		System.out.println("\nGeneramos "+ N + " enteros largos\n");
		for (int i = 0; i < N; i++) {
			System.out.print("\t" + rnd.nextLong());
		}
		System.out.println("");

		// Dos secuencias de N n�meros (distinta semilla)
		System.out.println("\nPrimera secuencia\n");
		for (int i = 0; i < N; i++) {
			System.out.print("\t" + rnd.nextDouble());
		}
		System.out.println("");

		System.out.println("\nSegunda secuencia\n");
		for (int i = 0; i < N; i++) {
			System.out.print("\t" + rnd.nextDouble());
		}
		System.out.println("");

//Dos secuencias de N n�meros (misma semilla)
		rnd.setSeed(3816L);
		System.out.println("\nPrimera secuencia\n");
		for (int i = 0; i < N; i++) {
			System.out.print("\t" + rnd.nextDouble());
		}
		System.out.println("");

		rnd.setSeed(3816L);
		System.out.println("\nSegunda secuencia\n");
		for (int i = 0; i < N; i++) {
			System.out.print("\t" + rnd.nextDouble());
		}
		System.out.println("");

		rnd.setSeed(System.currentTimeMillis());
		System.out.println("\nTercera secuencia\n");
		for (int i = 0; i < N; i++) {
			System.out.print("\t" + rnd.nextDouble());
		}
		System.out.println("");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		rnd.setSeed(System.currentTimeMillis()); // ya se ha puesto antes esta semilla
		System.out.println("\nCuarta secuencia\n");
		for (int i = 0; i < N; i++) {
			System.out.print("\t" + rnd.nextDouble());
		}
		System.out.println("");

	}
}