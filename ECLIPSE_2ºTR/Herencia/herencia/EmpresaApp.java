package herencia;

public class EmpresaApp{
	
	public static void main(String[] args){
		Empleado emp1 = new Empleado ("Pepe Gotera" , 1200) ;
		System.out.println(emp1);
		emp1.aumentarSueldo(10);
		System.out.println();
		System.out.println("Modificado " + emp1);
		System.out.println();
				
		Ejecutivo ejec = new Ejecutivo("Armando Mucho", 3000);
		ejec.asignarPresupuesto(15000);
		ejec.aumentarSueldo(5);
	    System.out.println(ejec);
	    
	    System.out.println();
	    
	    Ejecutivo ejec1 = new Ejecutivo("Luis López", 2000, 12000);
	    System.out.println(ejec1);
	    
	    System.out.println();
	    
	    Ejecutivo ejec2 = new Ejecutivo();
	    System.out.println(ejec2);
	}	
}