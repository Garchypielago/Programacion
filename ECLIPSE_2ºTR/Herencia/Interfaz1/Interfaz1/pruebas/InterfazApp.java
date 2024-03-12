package pruebas;
public class InterfazApp {
	public static void main (String args[]) {		
		ImplementaInterfaz ejInterfaz = new ImplementaInterfaz();
		
		// Ejecuta el metodo del interfaz que implementa la clase
		System.out.println(ejInterfaz.metodoAbstracto(3));
	}	
}