package Explicacion;


//Demostracion del metodo cubo
 
public class PruebaCubo {
	public static void main(String[] args) {
		System.out.println("El cubo de 7.5 es: " + cubo(7.5));
// llamada dentro de la sentencia System.out.println
	}

	public static double cubo(double x) {
		// declaracion
		return x * x * x;
	}
}
