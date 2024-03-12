<<<<<<< HEAD
package ejercicios;
import java.util.Scanner;
public class ejercicio17 {

	public static void main(String[] args) {
		int numero;
		String cara = " ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Que numero ha salido");
		numero = Integer.parseInt(sc.nextLine());
		
		if (numero<1 || numero>6) {
			System.out.println("ERROR: número incorrecto.");
		} else {
			switch (numero) {
			case 1 : cara = "seis";
			break;
			case 2 : cara = "cinco";
			break;
			case 3 : cara = "cuatro";
			break;
			case 4 : cara = "tres";
			break;
			case 5 : cara = "dos";
			break;
			case 6 : cara = "uno";
			break;
			}
			System.out.println("La cara contraria es " + cara );
		}

		sc.close();
	}

}
=======
package ejercicios;
import java.util.Scanner;
public class ejercicio17 {

	public static void main(String[] args) {
		int numero;
		String cara = " ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Que numero ha salido");
		numero = Integer.parseInt(sc.nextLine());
		
		if (numero<1 || numero>6) {
			System.out.println("ERROR: número incorrecto.");
		} else {
			switch (numero) {
			case 1 : cara = "seis";
			break;
			case 2 : cara = "cinco";
			break;
			case 3 : cara = "cuatro";
			break;
			case 4 : cara = "tres";
			break;
			case 5 : cara = "dos";
			break;
			case 6 : cara = "uno";
			break;
			}
			System.out.println("La cara contraria es " + cara );
		}

		sc.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
