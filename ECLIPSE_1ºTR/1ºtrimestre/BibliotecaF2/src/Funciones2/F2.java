<<<<<<< HEAD
package Funciones2;

public class F2 {

	public static void main(String[] args) {
		long x = 12345, y, n = 2, m = 3;

		y = voltea(x);
		System.out.println("voltea: " + y);

		System.out.println(esCapicua(x));

		y = digitos(x);
		System.out.println("digitos: " + y);

		y = digitoN(x, n);
		System.out.println("digitoN: " + y);

		y = posicionDigito(x, n);
		System.out.println("posiciondigito: " + y);

		y = quitaDetras(x, n);
		System.out.println("quitaDetras: " + y);

		y = quitaDelante(x, n);
		System.out.println("quitaDelante: " + y);

		y = pegaDetras(x, n);
		System.out.println("pegaDetras: " + y);

		y = pegaDelante(x, n);
		System.out.println("pegaDelante: " + y);

		y = trozoNumero(x, n, m);
		System.out.println("trozoNumero: " + y);

	}

	public static long voltea(long x) {
		long y = 0;

		for (long c; x != 0; x = x / 10) {
			c = x % 10;
			y = (c + y * 10);
		}

		return y;
	}

	public static boolean esCapicua(long x) {
		long y = 0;

		y = voltea(x);
		boolean capicua = (y == x) ? true : false;

		return capicua;
	}

	public static long digitos(long x) {
		long c = 0;

		for (; x != 0; x = x / 10, c++) {

		}

		return c;
	}

	public static long digitoN(long x, long n) {
		long c = 0;

		x = voltea(x);
		
		for (int i = 0; i < n; x = x / 10, i++) {
		}
		c = x % 10;
		
		return c;
	}

	public static long posicionDigito(long x, long n) {
		long c = 0;
		int i = -1;

		x = voltea(x);
		
		for (; c != n; x = x / 10, i++) {
			c = x % 10;
		}
		
		return i;
	}

	public static long quitaDetras(long x, long n) {

		for (int i = 0; i < n; x = x / 10, i++) {
		}

		return x;
	}

	public static long quitaDelante(long x, long n) {
		long y = 0, c, e = 1;

		for (int i = 0; i <= n; x = x / 10, i++) {
			c = x % 10;

			for (int i2 = 0; i2 < i; e = e * 10, i2++) {
			}
			y = (y + c * e);
			e = 1;
		}

		return y;
	}

	public static long pegaDetras(long x, long n) {
		long n1 = n, i = 0, c = 1;

		for (; n1 != 0; n1 = n1 / 10, i++);

		for (long j = 0; j < i; j++, c = c * 10);

		x = x * c + n;

		return x;
	}

	public static long pegaDelante(long x, long n) {
		long x1 = x, i = 0, c = 1;

		for (; x1 != 0; x1 = x1 / 10, i++) {
		}

		for (long i1 = 0; i1 < i; i1++, c = c * 10) {
		}

		x = n * c + x;

		return x;
	}

	public static long trozoNumero(long x, long n, long m) {
		long c = 0, x1 = x, n1 = Long.min(n, m), m1 = Long.max(n, m), e = 1, y=0, y1;

//		for (int i3 = 0; i3 <= m1; y = y / 10, i3++) {
//		}
//
//		for (int i = 0; i <= n1; x1 = x1 / 10, i++) {
//			c = x1 % 10;
//
//			for (int i2 = 0; i2 < i; e = e * 10, i2++) {
//			}
//			y = (y + c * e);
//			e = 1;
//		}
//		
//		y1 = quitaDetras(x,m);
//		y = quitaDelante(y1,n);
		
		
		return y;
	}

}
=======
package Funciones2;

public class F2 {

	public static void main(String[] args) {
		long x = 12345, y, n = 2, m = 3;

		y = voltea(x);
		System.out.println("voltea: " + y);

		System.out.println(esCapicua(x));

		y = digitos(x);
		System.out.println("digitos: " + y);

		y = digitoN(x, n);
		System.out.println("digitoN: " + y);

		y = posicionDigito(x, n);
		System.out.println("posiciondigito: " + y);

		y = quitaDetras(x, n);
		System.out.println("quitaDetras: " + y);

		y = quitaDelante(x, n);
		System.out.println("quitaDelante: " + y);

		y = pegaDetras(x, n);
		System.out.println("pegaDetras: " + y);

		y = pegaDelante(x, n);
		System.out.println("pegaDelante: " + y);

		y = trozoNumero(x, n, m);
		System.out.println("trozoNumero: " + y);

	}

	public static long voltea(long x) {
		long y = 0;

		for (long c; x != 0; x = x / 10) {
			c = x % 10;
			y = (c + y * 10);
		}

		return y;
	}

	public static boolean esCapicua(long x) {
		long y = 0;

		y = voltea(x);
		boolean capicua = (y == x) ? true : false;

		return capicua;
	}

	public static long digitos(long x) {
		long c = 0;

		for (; x != 0; x = x / 10, c++) {

		}

		return c;
	}

	public static long digitoN(long x, long n) {
		long c = 0;

		x = voltea(x);
		
		for (int i = 0; i < n; x = x / 10, i++) {
		}
		c = x % 10;
		
		return c;
	}

	public static long posicionDigito(long x, long n) {
		long c = 0;
		int i = -1;

		x = voltea(x);
		
		for (; c != n; x = x / 10, i++) {
			c = x % 10;
		}
		
		return i;
	}

	public static long quitaDetras(long x, long n) {

		for (int i = 0; i < n; x = x / 10, i++) {
		}

		return x;
	}

	public static long quitaDelante(long x, long n) {
		long y = 0, c, e = 1;

		for (int i = 0; i <= n; x = x / 10, i++) {
			c = x % 10;

			for (int i2 = 0; i2 < i; e = e * 10, i2++) {
			}
			y = (y + c * e);
			e = 1;
		}

		return y;
	}

	public static long pegaDetras(long x, long n) {
		long n1 = n, i = 0, c = 1;

		for (; n1 != 0; n1 = n1 / 10, i++);

		for (long j = 0; j < i; j++, c = c * 10);

		x = x * c + n;

		return x;
	}

	public static long pegaDelante(long x, long n) {
		long x1 = x, i = 0, c = 1;

		for (; x1 != 0; x1 = x1 / 10, i++) {
		}

		for (long i1 = 0; i1 < i; i1++, c = c * 10) {
		}

		x = n * c + x;

		return x;
	}

	public static long trozoNumero(long x, long n, long m) {
		long c = 0, x1 = x, n1 = Long.min(n, m), m1 = Long.max(n, m), e = 1, y=0, y1;

//		for (int i3 = 0; i3 <= m1; y = y / 10, i3++) {
//		}
//
//		for (int i = 0; i <= n1; x1 = x1 / 10, i++) {
//			c = x1 % 10;
//
//			for (int i2 = 0; i2 < i; e = e * 10, i2++) {
//			}
//			y = (y + c * e);
//			e = 1;
//		}
//		
//		y1 = quitaDetras(x,m);
//		y = quitaDelante(y1,n);
		
		
		return y;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
