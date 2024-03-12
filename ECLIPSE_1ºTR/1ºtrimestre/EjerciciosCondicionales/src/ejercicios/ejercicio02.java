package ejercicios;
import java.util.Scanner;
public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double n1;
		
		System.out.println("Escribe tu número");
		n1 = Double.parseDouble(sc.nextLine());
		 
		if (n1>0) {
			System.out.println("Tu número es positivo");
		}
			else if (n1<0) {
				System.out.println("Tu número es negativo");
			}
			else {
				System.out.println("Tu número es 0");
			}
				
		sc.close();
		
	}

}
