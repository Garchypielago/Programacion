package scanner;
import java.util.Scanner;

public class Scanner6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un entero: ");
		
		while(!sc.hasNextInt());
		int demoInt = sc.nextInt();
		System.out.print("leido: " + demoInt);
		
		sc.close();

	}
}
