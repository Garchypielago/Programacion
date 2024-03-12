<<<<<<< HEAD
package ejemplos;
import java.util.Scanner;
public class ejemplo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Escribe tu numero");
		numero = Integer.parseInt(sc.nextLine());
		if (numero%2 != 0) { 
			System.out.println("El numero es impar "); 
			//cont++; 
			}

		
		int a, b;
		System.out.println("Escribe tu numero a");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("Escribe tu numero b");
		b = Integer.parseInt(sc.nextLine());
		if (a>b) 
			System.out.println ("El número mayor es " + a); 
			else 
			System.out.println("El número mayor es " + b+ " o son iguales");
		
		
		int mes;
		System.out.println("Escribe tu numero de mes");
		mes = Integer.parseInt(sc.nextLine());
		if (mes == 12 || mes == 1 || mes == 2) 
			System.out.println ( "Invierno"); 
			else if (mes == 3 || mes == 4 || mes == 5) 
			System.out.println( "Primavera"); 
			else if (mes == 6 || mes == 7 || mes == 8) 
			System.out.println ("Verano"); 
			else 
			System.out.println ("Otoño");

		sc.close();
	}

}
=======
package ejemplos;
import java.util.Scanner;
public class ejemplo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Escribe tu numero");
		numero = Integer.parseInt(sc.nextLine());
		if (numero%2 != 0) { 
			System.out.println("El numero es impar "); 
			//cont++; 
			}

		
		int a, b;
		System.out.println("Escribe tu numero a");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("Escribe tu numero b");
		b = Integer.parseInt(sc.nextLine());
		if (a>b) 
			System.out.println ("El número mayor es " + a); 
			else 
			System.out.println("El número mayor es " + b+ " o son iguales");
		
		
		int mes;
		System.out.println("Escribe tu numero de mes");
		mes = Integer.parseInt(sc.nextLine());
		if (mes == 12 || mes == 1 || mes == 2) 
			System.out.println ( "Invierno"); 
			else if (mes == 3 || mes == 4 || mes == 5) 
			System.out.println( "Primavera"); 
			else if (mes == 6 || mes == 7 || mes == 8) 
			System.out.println ("Verano"); 
			else 
			System.out.println ("Otoño");

		sc.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
