package Explicacion;

public class PruebaPositivo {
	
	public static void main(String[] args) {
		for (int i = 5; i >= -5; i--) {

			System.out.println("i=" + i);
			System.out.println(i + " es positivo: " + esPositivo(i));
		}
	}

	public static boolean esPositivo (int x) {
		x*=2;
		System.out.println("x=" + x);
		if (x < 0)
			return false;
		else
			return true;
	}

}
