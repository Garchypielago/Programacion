package main;
import definicion.X;
import implementacion.Implementa;

public class Ejemplo {
	
	public static void main(String args[]) {
		Implementa ob = new Implementa();

		ob.getMax();
		System.out.println(X.MAX);
		// X.MAX=9; es final, no puede modificarse
	}
}