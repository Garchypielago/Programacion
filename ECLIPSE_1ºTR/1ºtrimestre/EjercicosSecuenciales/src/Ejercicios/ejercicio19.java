<<<<<<< HEAD
package Ejercicios;
import java.util.Scanner;
public class ejercicio19 {

	public static void main(String[] args) {
		int correcta, incorrecta, /*/blanco,*/ preguntas, maximo, puntos;
		float media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas preguntas tiene tu examen: ");
		preguntas = Integer.parseInt(sc.nextLine());
		
		System.out.println("Cuantas preguntas has acertado: ");
		correcta = Integer.parseInt(sc.nextLine());
		
		System.out.println("Cuantas preguntas has fallado: ");
		incorrecta = Integer.parseInt(sc.nextLine());
		
		/*System.out.println("Cuantas preguntas has dejado en blanco: ");
		blanco = Integer.parseInt(sc.nextLine());
		*/
		
		maximo = preguntas * 5;
		puntos = correcta * 5 - incorrecta;
		media = (float)puntos / (float)maximo * (float)10;
		
		System.out.println("Has sacado " + puntos + " de " + maximo + ", y tienes una media de " + media );
		
		sc.close();

	}

}
=======
package Ejercicios;
import java.util.Scanner;
public class ejercicio19 {

	public static void main(String[] args) {
		int correcta, incorrecta, /*/blanco,*/ preguntas, maximo, puntos;
		float media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas preguntas tiene tu examen: ");
		preguntas = Integer.parseInt(sc.nextLine());
		
		System.out.println("Cuantas preguntas has acertado: ");
		correcta = Integer.parseInt(sc.nextLine());
		
		System.out.println("Cuantas preguntas has fallado: ");
		incorrecta = Integer.parseInt(sc.nextLine());
		
		/*System.out.println("Cuantas preguntas has dejado en blanco: ");
		blanco = Integer.parseInt(sc.nextLine());
		*/
		
		maximo = preguntas * 5;
		puntos = correcta * 5 - incorrecta;
		media = (float)puntos / (float)maximo * (float)10;
		
		System.out.println("Has sacado " + puntos + " de " + maximo + ", y tienes una media de " + media );
		
		sc.close();

	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
