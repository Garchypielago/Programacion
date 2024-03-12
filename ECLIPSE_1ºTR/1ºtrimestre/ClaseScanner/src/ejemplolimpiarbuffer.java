import java.util.Scanner;
public class ejemplolimpiarbuffer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		String nombre;
		double radio;
		int n;
		
		System.out.print("Introduzca el radio de la circunferencia: ");
		radio = Double.parseDouble(sc.nextLine());
		System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
		
		System.out.print("Introduzca un número entero: ");
		n = Integer.parseInt(sc.nextLine());
		System.out.println("El cuadrado es: " + Math.pow(n,2));
		
		System.out.print("Introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Hola " + nombre + "!!!");
		
		
		sc.close();

	}

}
