import java.util.Scanner;
public class ejemplo2limpiarbuffer {
	public static void main(String[] args) {
	
		String nombre, apell1;
		
		//Get nombre
		 System.out.println("Introduzca nombre del paciente");
		 Scanner name_scanner = new Scanner (System.in);
		 nombre=name_scanner.nextLine();
		 
		 
		//Get apellido 1
		 System.out.println("Introduzca primer apellido del paciente");
		 Scanner apell1_scanner = new Scanner (System.in);
		 apell1=apell1_scanner.nextLine();
		 
		
		
		
		 apell1_scanner.close();
		 name_scanner.close();
	}

}
