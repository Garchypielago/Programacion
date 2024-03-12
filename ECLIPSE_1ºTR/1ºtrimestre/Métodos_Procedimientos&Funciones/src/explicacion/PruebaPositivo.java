<<<<<<< HEAD
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
=======
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
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
