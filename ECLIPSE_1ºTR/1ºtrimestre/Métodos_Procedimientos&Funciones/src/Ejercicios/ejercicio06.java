<<<<<<< HEAD
package Ejercicios;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		String entrada;
		int radio, base, altura;

		Scanner sc = new Scanner(System.in);

		do {
			do {
				System.out.println(
						"--------------------------------------------\nEscribe que operación quieres realizar:\nCírculo\nTriángulo\nCuadrado\nSalir\n--------------------------------------------");
				entrada = sc.nextLine().toLowerCase();
			} while (!entrada.equalsIgnoreCase("triángulo") && !entrada.equalsIgnoreCase("cuadrado")
					&& !entrada.equalsIgnoreCase("círculo") && !entrada.equalsIgnoreCase("Salir"));

			if (entrada.equalsIgnoreCase("triángulo")) {
				System.out.println("Base del triángulo:");
				base = Integer.parseInt(sc.nextLine());
				System.out.println("Altura del triángulo:");
				altura = Integer.parseInt(sc.nextLine());

				System.out.println("El área del triángulo es: " + triángulo(base, altura));

			} else if (entrada.equalsIgnoreCase("cuadrado")) {
				System.out.println("Base del cruadrado:");
				base = Integer.parseInt(sc.nextLine());

				System.out.println("El área del cuadrado es: " + cuadrado(base));

			} else if (entrada.equalsIgnoreCase("círculo")) {
				System.out.println("Radio del círculo:");
				radio = Integer.parseInt(sc.nextLine());

				System.out.println("El área del círculo es: " + círculo(radio));
			}
		} while (!entrada.equalsIgnoreCase("Salir"));

		System.out.println("\nHa salido del programa");

//		do {
//			System.out.println("--------------------------------------------\nEscribe que operación quieres realizar:\nCírculo\nTriángulo\nCuadrado\nSalir\n--------------------------------------------");
//			entrada = sc.nextLine().toLowerCase();
//			} while (!entrada.equalsIgnoreCase("triángulo") && !entrada.equalsIgnoreCase("cuadrado") && !entrada.equalsIgnoreCase("círculo") && !entrada.equalsIgnoreCase("Salir"));
//			
//			if (entrada.equalsIgnoreCase("triángulo")) {
//			System.out.println("Base del triángulo:");
//			base=Integer.parseInt(sc.nextLine());
//			System.out.println("Altura del triángulo:");
//			altura=Integer.parseInt(sc.nextLine());
//			
//			System.out.println("El área del triángulo es: " + triángulo(base,altura)); 
//			
//			} else if (entrada.equalsIgnoreCase("cuadrado")) {
//				System.out.println("Base del cruadrado:");
//				base=Integer.parseInt(sc.nextLine());
//				
//				System.out.println("El área del cuadrado es: " + cuadrado(base)); 
//				
//			}else if (entrada.equalsIgnoreCase("círculo")) {
//				System.out.println("Radio del círculo:");
//				radio=Integer.parseInt(sc.nextLine());
//				
//				System.out.println("El área del círculo es: " + círculo(radio));
//				
//			}else {
//				System.out.println("Ha salido del programa");
//			}

		sc.close();

	}

	public static float círculo(float a) {
		
		return a*a;
	}

	public static float triángulo(float a, float b) {
		return a*b/2;
	}

	public static float cuadrado(float a) {
		return (float)((a*a)*Math.PI);
	}

}
=======
package Ejercicios;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		String entrada;
		int radio, base, altura;

		Scanner sc = new Scanner(System.in);

		do {
			do {
				System.out.println(
						"--------------------------------------------\nEscribe que operación quieres realizar:\nCírculo\nTriángulo\nCuadrado\nSalir\n--------------------------------------------");
				entrada = sc.nextLine().toLowerCase();
			} while (!entrada.equalsIgnoreCase("triángulo") && !entrada.equalsIgnoreCase("cuadrado")
					&& !entrada.equalsIgnoreCase("círculo") && !entrada.equalsIgnoreCase("Salir"));

			if (entrada.equalsIgnoreCase("triángulo")) {
				System.out.println("Base del triángulo:");
				base = Integer.parseInt(sc.nextLine());
				System.out.println("Altura del triángulo:");
				altura = Integer.parseInt(sc.nextLine());

				System.out.println("El área del triángulo es: " + triángulo(base, altura));

			} else if (entrada.equalsIgnoreCase("cuadrado")) {
				System.out.println("Base del cruadrado:");
				base = Integer.parseInt(sc.nextLine());

				System.out.println("El área del cuadrado es: " + cuadrado(base));

			} else if (entrada.equalsIgnoreCase("círculo")) {
				System.out.println("Radio del círculo:");
				radio = Integer.parseInt(sc.nextLine());

				System.out.println("El área del círculo es: " + círculo(radio));
			}
		} while (!entrada.equalsIgnoreCase("Salir"));

		System.out.println("\nHa salido del programa");

//		do {
//			System.out.println("--------------------------------------------\nEscribe que operación quieres realizar:\nCírculo\nTriángulo\nCuadrado\nSalir\n--------------------------------------------");
//			entrada = sc.nextLine().toLowerCase();
//			} while (!entrada.equalsIgnoreCase("triángulo") && !entrada.equalsIgnoreCase("cuadrado") && !entrada.equalsIgnoreCase("círculo") && !entrada.equalsIgnoreCase("Salir"));
//			
//			if (entrada.equalsIgnoreCase("triángulo")) {
//			System.out.println("Base del triángulo:");
//			base=Integer.parseInt(sc.nextLine());
//			System.out.println("Altura del triángulo:");
//			altura=Integer.parseInt(sc.nextLine());
//			
//			System.out.println("El área del triángulo es: " + triángulo(base,altura)); 
//			
//			} else if (entrada.equalsIgnoreCase("cuadrado")) {
//				System.out.println("Base del cruadrado:");
//				base=Integer.parseInt(sc.nextLine());
//				
//				System.out.println("El área del cuadrado es: " + cuadrado(base)); 
//				
//			}else if (entrada.equalsIgnoreCase("círculo")) {
//				System.out.println("Radio del círculo:");
//				radio=Integer.parseInt(sc.nextLine());
//				
//				System.out.println("El área del círculo es: " + círculo(radio));
//				
//			}else {
//				System.out.println("Ha salido del programa");
//			}

		sc.close();

	}

	public static float círculo(float a) {
		
		return a*a;
	}

	public static float triángulo(float a, float b) {
		return a*b/2;
	}

	public static float cuadrado(float a) {
		return (float)((a*a)*Math.PI);
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
