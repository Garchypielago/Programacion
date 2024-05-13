package i_o;



import java.util.Scanner;

import excepciones.ExcepVehiculo;

public class CreacionObj {
	
	public static Vehiculo crearVehiculo(Scanner sc) throws ExcepVehiculo {
		String mat=null, mod=null, mar=null;
		int an=0;
		
		System.out.println("Escriba la matricula");
		mat = sc.nextLine();
		System.out.println("Escriba la marca");
		mar = sc.nextLine();
		System.out.println("Escriba el modelo");
		mod = sc.nextLine();
		System.out.println("Escriba el año");
		an = Integer.parseInt(sc.nextLine());
		
		if (mat.equals(null) || mod.equals(null) || mar.equals(null)|| an==0) {
			throw new ExcepVehiculo("Error: creacion de vehiculo");
		}
		
		return new Vehiculo(mat, mar, mod, an);
		
		
	}

}
