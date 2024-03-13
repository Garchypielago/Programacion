package ejercicios;
import java.util.Scanner;
public class ejercicio20 {

	public static void main(String[] args) {
		double peso, costo=0, precio;
		String szona;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Peso del paquete en kilos");
		peso = Double.parseDouble(sc.nextLine()) * 1000;
		
		if (peso>5000) {
			System.out.println("No puede ser transportado");
		} else {
			System.out.println("Zona a la que se dirige:");
			szona = sc.nextLine().toLowerCase();
			
			switch (szona) {
			case "américa del norte": costo = 24;
			break;
			case "américa central": costo = 20;
			break;
			case "américa del sur": costo = 21;
			break;
			case "europa": costo = 10;
			break;
			case "asia": costo = 18;
			break;
			}
			
			precio = peso * costo;
			
			System.out.println("El precio es de " + precio + "€.");
		}
		sc.close();
	}

}
