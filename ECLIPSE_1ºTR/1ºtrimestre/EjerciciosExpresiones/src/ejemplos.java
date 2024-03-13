public class ejemplos {

	public static void main(String[] args) {
		int x = 5, y =4, a = 3, b = 2 ,c =6, d = 7, e = 8, u = 1;
		
		System.out.println("El valor de x es " + x + "\nEl valor de y es " + y);
		System.out.println("El valor de u es " + u);
		System.out.println("El valor de a es " + a + "\nEl valor de b es " + b);
		System.out.println("El valor de c es " + c + "\nEl valor de d es " + d + "\nEl valor de e es " + e);

		// Escribimos x**2 + y**4
		System.out.println("El valor de x**2 + y**4 es " + (Math.pow(x, 2) + Math.pow(y, 4)));
		
		// Escribimos x**2 / (a**3 + b**3)
		System.out.println("El valor de x**2 / (a**3 + b**3) es " + Math.pow(x, 2) / (Math.pow(a, 3) + Math.pow(b, 3)));
		
		// Escribimos u + x**2 / y
		System.out.println("El valor de u + x**2 / y es " + (u + Math.pow(x, 2) / y));
		
		
	}

}
