package aleatorios;

import java.util.Random;

public class Aleatorios1 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int x;

		for (int i = 0; i < 10; i++) {
			x = (int) (rnd.nextDouble() * 10.0); // genera valores del 0 al 9
			System.out.println(x);
		}

	}

}
