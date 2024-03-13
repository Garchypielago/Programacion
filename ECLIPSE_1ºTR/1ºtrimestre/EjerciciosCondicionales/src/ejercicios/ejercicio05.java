package ejercicios;
import java.util.Scanner;
public class ejercicio05 {

	public static void main(String[] args) {
		String usuario, contraseña;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu usuario");
		usuario = sc.nextLine();
		
		System.out.println("Escribe tu contraseña");
		contraseña = sc.nextLine();
		
		if (usuario.equals("pepe") && contraseña.equals("asdasd")) { //str1.compareTo(str2)==0
			System.out.println("Has entrado al sistema");
		}
		else {
			System.out.println("Usuario o contraseña incorrectos");
		}
		
		sc.close();
	}
}
