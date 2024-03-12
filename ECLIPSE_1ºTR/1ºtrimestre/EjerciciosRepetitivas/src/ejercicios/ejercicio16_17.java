<<<<<<< HEAD
package ejercicios;

import java.util.Scanner;

public class ejercicio16_17 {

	public static void main(String[] args) {
		int empleados, hora, dias, ntipos, i;
		double sueldohora, sueldosemanal, pagoT=0;
		String tipos=" ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos dias trabjan tus empleados: ");
		dias = Integer.parseInt(sc.nextLine());
		
		do {
		System.out.println("Tienes mas de un tipo de empleado(si/no)(referente a las horas trabajadas por dia): ");
		tipos = sc.nextLine().toLowerCase();
		} while ( !tipos.equals("si") && !tipos.equals("no") ); 
		
		if (tipos.equals("si")) {
				System.out.println("Cuantos tipos de empleados: ");
				ntipos = Math.abs(Integer.parseInt(sc.nextLine()));
				
				for (i=1; i<ntipos+1; i++) {
					System.out.println("Cuantos empleados del " + i + " tipo tienes");
					empleados = Integer.parseInt(sc.nextLine());
					
					System.out.println("Cuantas horas trabaja el " + i + " tipo de empleado");
					hora = Integer.parseInt(sc.nextLine());
					
					System.out.println("Cuanto cobra el " + i + " tipo de empleado por hora");
					sueldohora = Double.parseDouble(sc.nextLine());
					
					sueldosemanal = sueldohora * hora * dias;
					
					pagoT = pagoT + empleados * sueldosemanal;
					
					System.out.println("El sueldo semanal de el " + i + " tipo de empleado es: " + sueldosemanal);
				}
				
		} else if (tipos.equals("no")) {
			
			System.out.println("Cuantos empleados tienes");
			empleados = Integer.parseInt(sc.nextLine());
			
			System.out.println("Cuantas horas trabaja el empleado");
			hora = Integer.parseInt(sc.nextLine());
			
			System.out.println("Cuanto cobra el empleado por hora");
			sueldohora = Double.parseDouble(sc.nextLine());
			
			sueldosemanal = sueldohora * hora * dias;
			
			pagoT = empleados * sueldosemanal;
			
			System.out.println("El sueldo semanal de el empleado es: " + sueldosemanal);
		}
		
		System.out.println("El costo semanal por todos los empleados es: " + pagoT);
		
		sc.close();
	}

}
=======
package ejercicios;

import java.util.Scanner;

public class ejercicio16_17 {

	public static void main(String[] args) {
		int empleados, hora, dias, ntipos, i;
		double sueldohora, sueldosemanal, pagoT=0;
		String tipos=" ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos dias trabjan tus empleados: ");
		dias = Integer.parseInt(sc.nextLine());
		
		do {
		System.out.println("Tienes mas de un tipo de empleado(si/no)(referente a las horas trabajadas por dia): ");
		tipos = sc.nextLine().toLowerCase();
		} while ( !tipos.equals("si") && !tipos.equals("no") ); 
		
		if (tipos.equals("si")) {
				System.out.println("Cuantos tipos de empleados: ");
				ntipos = Math.abs(Integer.parseInt(sc.nextLine()));
				
				for (i=1; i<ntipos+1; i++) {
					System.out.println("Cuantos empleados del " + i + " tipo tienes");
					empleados = Integer.parseInt(sc.nextLine());
					
					System.out.println("Cuantas horas trabaja el " + i + " tipo de empleado");
					hora = Integer.parseInt(sc.nextLine());
					
					System.out.println("Cuanto cobra el " + i + " tipo de empleado por hora");
					sueldohora = Double.parseDouble(sc.nextLine());
					
					sueldosemanal = sueldohora * hora * dias;
					
					pagoT = pagoT + empleados * sueldosemanal;
					
					System.out.println("El sueldo semanal de el " + i + " tipo de empleado es: " + sueldosemanal);
				}
				
		} else if (tipos.equals("no")) {
			
			System.out.println("Cuantos empleados tienes");
			empleados = Integer.parseInt(sc.nextLine());
			
			System.out.println("Cuantas horas trabaja el empleado");
			hora = Integer.parseInt(sc.nextLine());
			
			System.out.println("Cuanto cobra el empleado por hora");
			sueldohora = Double.parseDouble(sc.nextLine());
			
			sueldosemanal = sueldohora * hora * dias;
			
			pagoT = empleados * sueldosemanal;
			
			System.out.println("El sueldo semanal de el empleado es: " + sueldosemanal);
		}
		
		System.out.println("El costo semanal por todos los empleados es: " + pagoT);
		
		sc.close();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
