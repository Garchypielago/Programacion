package recursividad;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}

	public static long factorial(long num) {
		long resultado;

		if (num == 0)
			resultado = 1;
		else
			resultado = num * factorial(num - 1);

		return resultado;
	}

}
