package ejemplo;

import java.util.Scanner;

public class ArrayChar2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce una frase (vamos a separar por palabras) ");
		
		String frase = teclado.nextLine();
		
		System.out.println("La frase es " + frase); 
        
        for (int i=0; i<frase.length(); i++) {
        	 System.out.print(frase.charAt(i));
        	 if (frase.charAt(i) == ' ') // separa palabras por espacios en blanco
        		 System.out.println();
        }
        
        System.out.println("\nCon split ahora");
        
        String [] palabras = frase.split(" ");
        
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
       
        System.out.println();
        
        // Ejemplo de los apuntes:
		char[] s = new char[10];
		s[0] = 'a';
		s[1] = 'b';
		s[2] = 'c';
		int i = 0;
		while (s[i] != '\0') {
			System.out.print(s[i]); // Muestra los caracteres del array hasta que
			i++; // encuentra el primer nulo.
		} // Ojo que si esta lleno del todo da error
		
		s = new char[3];// Si hago esto, como queda el array anterior en memoria?: sin referencia que lo apunte
		s[0] = 'a';
		s[1] = 'b';
		s[2] = 'c';
		i = 0;
		while (s[i] != '\0') {
			System.out.print(s[i]); // Muestra los caracteres del array hasta que
			i++; // encuentra el primer nulo.
		} // preguntara por el contenido de una posicion que no existe para este array
        
        teclado.close();
	}
	
    
}
