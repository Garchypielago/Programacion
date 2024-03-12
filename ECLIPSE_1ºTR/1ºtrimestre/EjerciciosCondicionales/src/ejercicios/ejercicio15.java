package ejercicios;
import java.util.Scanner;
public class ejercicio15 {

	public static void main(String[] args) {
		int nalumnos, precio, pago;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos alumnos van al viaje: ");
		nalumnos= Integer.parseInt(sc.nextLine());
		
		if (nalumnos >= 100) {
			precio = 65;
			pago = precio * nalumnos;
		} else if (nalumnos>=50 /*&& nalumnos <=99*/) {
			precio = 70;
			pago = precio * nalumnos;
		} else if (nalumnos>=40 /*&& nalumnos <=49*/) {
			precio = 95;
			pago = precio * nalumnos;
		} else {
			precio = 4000 / nalumnos;
			pago = 4000;
		}
		
		
		System.out.println("Cada alumno paga " + precio + "€" + ", y debe pagar a la compañia " + pago + "€.");
		
		
		sc.close();
	}

}
