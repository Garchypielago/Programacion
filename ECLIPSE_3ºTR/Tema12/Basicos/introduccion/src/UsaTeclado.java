package src;

public class UsaTeclado {
	public static void main(String[] args) {
		
		Teclado.crear();
		
		System.out.println("Introduce un numero:");
		int numeroLeido = Teclado.leerInt();
		
		System.out.println("Introduce una cadena:");
		String mensaje = Teclado.leerLinea();
		
		System.out.println("Leido el numero: " + numeroLeido + " y la cadena: " + mensaje);
		
		Teclado.cerrar();
		
	}
}
