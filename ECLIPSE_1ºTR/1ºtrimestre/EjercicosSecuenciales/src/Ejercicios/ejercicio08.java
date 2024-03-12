package Ejercicios;
import java.util.Scanner;
public class ejercicio08 {

	public static void main(String[] args) {
			double sueldoB, c1, c2, c3, sueldoT, cT;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Escribe el sueldo base: ");
			sueldoB = Double.parseDouble(sc.nextLine());
			
			System.out.println("Escribe el importe de primera venta: ");
			c1 = Double.parseDouble(sc.nextLine());
			
			System.out.println("Escribe el importe de segunda venta: ");
			c2 = Double.parseDouble(sc.nextLine());
			
			System.out.println("Escribe el importe de tercera venta: ");
			c3 = Double.parseDouble(sc.nextLine());
			
			cT = 0.1 * (c1+c2+c3);
			
			sueldoT = sueldoB + cT;
			
			System.out.println("Dinero por comisiónes: " + cT);
			System.out.println("Dinero total: " + sueldoT);

			sc.close();
	}

}
