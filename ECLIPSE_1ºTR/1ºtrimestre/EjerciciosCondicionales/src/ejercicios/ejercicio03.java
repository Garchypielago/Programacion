package ejercicios;
import java.util.Scanner;
public class ejercicio03 {

	public static void main(String[] args) {
		int n1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu número");
		n1 = Integer.parseInt(sc.nextLine());
		
		if (n1%2 == 0) {
			System.out.println("Tu número es par");
		}
			else{
			System.out.println("Tu número es impar");
		}
			
		sc.close();

	}

}
