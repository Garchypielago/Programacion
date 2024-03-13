package ejemplo;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		
		System.out.println("\n2.2 Instanciar un array\n");
		
		int [] ventas = new int[5]; // se reserva memoria para 5 enteros
		
		Scanner teclado = new Scanner(System.in); 
		System.out.print("Número de elementos del array: "); 
		int numeroElementos = teclado.nextInt(); 
		int [] ventas1 = new int[numeroElementos];

		
		System.out.println(ventas);
		System.out.println(ventas1); 
		
		
		System.out.println("\n2.3 Inicializar arrays unidimensionales \n");
		
		double [] notas = {6.7, 7.5, 5.3, 8.75, 3.6, 6.5}; 
		boolean [] resultados = {true, false, true, false}; 
		String [] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", 
		"Sábado", "Domingo"};
		
		System.out.println(notas);
		System.out.println(resultados);
		System.out.println(dias);
		
		
		System.out.println("\n2.3 2.4 Acceder a los elementos de un array \n");
		
		Scanner teclado1 = new Scanner(System.in); 
		int i, valor; 
		int [] a = new int[10]; 
		System.out.print("Posición: "); 
		i = teclado1.nextInt(); 
		System.out.print("Valor: "); 
		valor = teclado1.nextInt(); 
		if (i>=0 && i < a.length) 
		a[i] = valor;
		
		
		System.out.println("\n2.5 Recorrer un array unidimensional\n");
		
		double[] notas1 = {2.3, 8.5, 3.2, 9.5, 4, 5.5, 7.0}; 
		for (int i1 = 0; i1 < notas1.length; i1++) 
		System.out.print(notas1[i1] + " ");

		Scanner teclado2= new Scanner(System.in); 
		int numAlum, i1; 
		double suma = 0, media; 
		do { 
		System.out.print("Número de alumnos de la clase: "); 
		numAlum = Integer.parseInt(teclado2.nextLine()); 
		} while (numAlum <= 0); 
		double[] notas2 = new double[numAlum]; 
		System.out.print("Empezamos a pedir datos de los alumnos: ");
		for (i1 = 0; i1<notas2.length; i1++) { 
		System.out.print("Alumno " + (i1 + 1) + " Nota final: "); 
		notas2[i1] = teclado2.nextDouble(); 
		} 
		for (i1 = 0; i1 < notas2.length; i1++) 
		suma = suma + notas2[i1]; 
		media = suma / notas2.length; 
		System.out.printf("Nota media del curso: %2f %n", media); 
		System.out.println("Listado de notas superiores a la media: ");
		for (i1 = 0; i1 < notas2.length; i++) 
			if (notas[i1] > media) 
			System.out.println("Alumno numero " + (i1 + 1)+ "Nota final: " + notas2[i1]); 
			teclado2.close();

		
		
		
		System.out.println("\n2.6 Arrays unidimensionales de caracteres en Java\n");
		
		char [] cadena = new char[8];
		char [] vocales = {'a', 'e', 'i', 'o', 'u'};
		
		System.out.println(cadena); // Muestra 8 caracteres nulos (en blanco) 
		System.out.println(vocales); // Muestra aeiou
		
		System.out.println(cadena.length); // Muestra: 8 
		cadena[0] ='m'; 
		cadena[1] ='n';
		cadena[2] ='a';
		
		System.out.print(cadena); 
		System.out.print(cadena); 
		System.out.println(".");
		
		

	}

}
