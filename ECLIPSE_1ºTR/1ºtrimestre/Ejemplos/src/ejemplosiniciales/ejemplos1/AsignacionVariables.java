package ejemplos1;

public class AsignacionVariables {
	public static void main(String[] args) {
		int a = 5, b = 0, c;

		b = a * 3; // Se cambia el valor de b a 15
		c = a; // Se guarda en c el valor de a que es 5
		a = a + 6; // Se suma 6 al valor que tenia a.
// Ahora a vale 11 
		b = a - c; // b guarda 11 - 5 , luego vale 6
		System.out.println("La variable a contiene: " + a);
		System.out.println("La variable b contiene: " + b);
		System.out.println("La variable c contiene: " + c);
	}
}
