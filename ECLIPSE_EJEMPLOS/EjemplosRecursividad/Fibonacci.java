package recursividad;

public class Fibonacci {
	public static void main(String args[]) {
		int numTerm = 10;
		for (int i = 0; i < numTerm; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	static int fibonacci(int n) {
		if ((n == 0) || (n == 1))
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
