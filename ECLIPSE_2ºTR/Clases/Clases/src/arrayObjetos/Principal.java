package arrayObjetos;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		final int N = 5;
		Scanner teclado = new Scanner(System.in);
		double x, y, r;
		Circulo[] arCirculos = new Circulo[N];

		System.out.println("Introducir la coordenada x");
		x = Double.parseDouble(teclado.nextLine());
		System.out.println("Introducir la coordenada y");
		y = Double.parseDouble(teclado.nextLine());
		System.out.println("Introducir el radio");
		r = Double.parseDouble(teclado.nextLine());

		Circulo c1 = new Circulo(x, y, r);
		arCirculos[0] = c1;
		System.out.println(c1);

		Circulo c2 = new Circulo();
		arCirculos[1] = c2;
		System.out.println(c2);

		System.out.println("Introducir el radio");
		r = Double.parseDouble(teclado.nextLine());

		Circulo c3 = new Circulo(r);
		arCirculos[2] = c3;
		System.out.println(c3);

		System.out.println();
		for (int i = 0; i < N; i++)
			System.out.println(arCirculos[i]);

		for (int i = 0; i < arCirculos.length; i++)
			System.out.println(arCirculos[i]);

		for (int i = 0; i < arCirculos.length && arCirculos[i] != null; i++)
			System.out.println(arCirculos[i]);
		
		for (Circulo c: arCirculos)
			System.out.println(c);
		
		teclado.close();
	}
}
