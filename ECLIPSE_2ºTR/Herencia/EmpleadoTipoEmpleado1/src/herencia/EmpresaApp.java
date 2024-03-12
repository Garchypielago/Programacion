package herencia;

import java.util.ArrayList;

public class EmpresaApp{
	
	public static void main(String[] args){
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado emp = new Empleado ( "Esteban Garrido", 1000) ;
		System.out.println(emp);
		System.out.println("objeto emp " + emp.tipoEmpleado());
		//emp.asignarPresupuesto(5000);  // error, es un metodo del hijo: Ejecutivo
		
		System.out.println();
		
		Empleado emp1 = new Empleado ("Jose Alonso", 1200) ;
		System.out.println(emp1);
		System.out.println("objeto emp1 " + emp1.tipoEmpleado());
		emp1.aumentarSueldo(10);
		
		System.out.println();
		
		System.out.println(emp1);
		
		System.out.println();
		
		Ejecutivo ejec = new Ejecutivo("Felipe Lopez", 2000, 50000);
		
		System.out.println(ejec);
		
		System.out.println();
		
		// No hay constructor para ejecutivo, lo creamos en la siguiente version:
		
		//ejec.asignarPresupuesto(1500);
		ejec.aumentarSueldo(5);
		System.out.println("objeto ejec " + ejec.tipoEmpleado());
		System.out.println(ejec);
		
		Jefe jefe = new Jefe("Pedro Alonso", 200, "Finanzas");
		System.out.println(jefe);
		
		System.out.println("objeto jefe " + jefe.tipoEmpleado());
		
		System.out.println("************************************");
		empleados.add(emp);
		empleados.add(emp1);
		empleados.add(ejec);
		empleados.add(jefe);
		
		for (Empleado unEmp:empleados) {
			System.out.println(unEmp);
			unEmp.esJefe();
			System.out.println(unEmp.tipoEmpleado());
		}	
	}	
}