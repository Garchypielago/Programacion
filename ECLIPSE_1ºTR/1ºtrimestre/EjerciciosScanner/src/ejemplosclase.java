	import java.util.Scanner;
public class ejemplosclase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*int n;
		System.out.print("Introduzca un número entero: ");
		n = sc.nextInt();
		
		double x;
		System.out.print("Introduzca número de tipo double: ");
		x = sc.nextDouble();

		String s;
		System.out.print("Introduzca texto: ");
		s = sc.nextLine();
		
		String nombre;
		System.out.print("Introduzca su nombre: ");
		nombre = sc.nextLine(); //leer un String/linea
		System.out.println("Hola " + nombre + "!!!");
		double radio;
		System.out.print("Introduzca el radio de la circunferencia: ");
		radio = sc.nextDouble(); //leer un double
		System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
		
		int y;
		System.out.print("Introduzca un número entero: ");
		y = sc.nextInt(); //leer un entero
		System.out.println("El cuadrado es: " + Math.pow(y,2));
		*/
		
		String nombre;
		double radio;
		int n;
		
		System.out.println("Introducca su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Hola " + nombre + "!!!");
		
		System.out.println("Introduzca el radio de la circunferencia: ");
		radio = sc.nextDouble();
		System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
		
		System.out.println("Introduzca numero entero: ");
		n = sc.nextInt();
		System.out.println("El cuadrado es: " + Math.pow(n, 2));
		
		
		
		sc.close();
	
	}
}
