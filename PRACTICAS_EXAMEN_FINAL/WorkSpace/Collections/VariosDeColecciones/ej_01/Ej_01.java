package ej_01;

import java.util.Collections;
import java.util.LinkedList;

public class Ej_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < 25; i++)
			list.add((int) (Math.random() * 101));

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}

		System.out.println();

		System.out.println("La suma de sus numeros es: " + suma(list));

		System.out.println("La media de sus numeros es: " + suma(list));

		System.out.println();
		
		ordenada(list);

	}

	public static int suma(LinkedList<Integer> list) {
		int suma = 0;

		for (int i = 0; i < list.size(); i++)
			suma += list.get(i);

		return suma;
	}

	public static float media(LinkedList<Integer> list) {
		float media = 0;

		media = suma(list) / list.size();

		return media;
	}

	public static void ordenada(LinkedList<Integer> list) {
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}

	}

}
