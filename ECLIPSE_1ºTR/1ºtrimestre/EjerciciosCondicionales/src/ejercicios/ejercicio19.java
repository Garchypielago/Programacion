package ejercicios;
import java.util.Scanner;
public class ejercicio19 {

	public static void main(String[] args) {
		int nmes;
		String sdias=" ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Que numero de mes es:");
		nmes = Integer.parseInt(sc.nextLine());
		
		if (nmes<1 || nmes>12) {
			System.out.println("ERROR: número incorrecto.");
		} else {
			switch (nmes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: sdias = "Treinta y un";
			break;
			case 4:
			case 6:
			case 9:
			case 11: sdias = "Treinta";
			break;
			case 2: sdias = "Veintiocho";
			break;
			}
			System.out.println( sdias + " dias.");
		}
		sc.close();
	}

}
