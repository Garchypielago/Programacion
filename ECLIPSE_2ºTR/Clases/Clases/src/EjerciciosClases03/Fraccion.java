<<<<<<< HEAD
package EjerciciosClases03;

public class Fraccion {
	private int numerador, denominador;

	public Fraccion() {
		super();
	}

	public Fraccion(int numerador, int denominador) {
		super();
		if (denominador != 0) {
			this.numerador = numerador;
			this.denominador = denominador;
		} else {
			System.out.println("No se puede crear una fracción con denominador 0");
		}
	}

	public double getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public double getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}

	public Fraccion suma(Fraccion fraccion2) {
		int mcm = minimoComunMultiplo(this.denominador, fraccion2.denominador);
		int m1, m2;

		m1 = mcm / this.denominador;
		m2 = mcm / fraccion2.denominador;

		Fraccion suma = new Fraccion(this.numerador * m1 + fraccion2.numerador * m2, mcm);
		
		return suma.reducir();
	}

	public int minimoComunMultiplo(int num1, int num2) {
		boolean confirmacion = false;
		int i = 1;

		for (; confirmacion != true; i++) {
			for (int j = 1; Math.min(num2, num1) * i >= Math.max(num1, num2) * j; j++) {
				if (Math.min(num2, num1) * i == Math.max(num1, num2) * j) {
					confirmacion = true;
				}
			}
		}
		int mcm = Math.min(num2, num1) * (i - 1);

		return mcm;
	}

	public Fraccion reducir() {
		boolean confirmacion = false;
		Fraccion reducida = new Fraccion(numerador, denominador);
		

		for (int i = Math.min(Math.abs(numerador), Math.abs(denominador)); confirmacion != true && i>0; i--) {
			if (Math.min(numerador, denominador) % i == 0 &&  Math.max(denominador, numerador) % i ==0) {
				reducida.setNumerador(numerador/i);
				reducida.setDenominador(denominador/i);
				confirmacion = true;
			}
		}

		return reducida;
	}

	public int maximoComunDivisor(int denominador1, int denominador2) {
		boolean confirmacion = false;
		int i = 1;

		for (; confirmacion != true; i++) {
			for (int j = 1; Math.min(denominador2, denominador1) * i >= Math.max(denominador1, denominador2) * j; j++) {
				if (Math.min(denominador2, denominador1) * i == Math.max(denominador1, denominador2) * j) {
					confirmacion = true;
				}
			}
		}
		int mcm = Math.min(denominador2, denominador1) * (i - 1);

		return mcm;
	}
	
	public Fraccion resta(Fraccion fraccion2) {
		int mcm = minimoComunMultiplo(this.denominador, fraccion2.denominador);
		int m1, m2;

		m1 = mcm / this.denominador;
		m2 = mcm / fraccion2.denominador;

		Fraccion suma = new Fraccion(this.numerador * m1 - fraccion2.numerador * m2, mcm);
		
		return suma.reducir();
	}
	
	public Fraccion division(Fraccion fraccion2) {

		Fraccion division = new Fraccion(this.numerador*fraccion2.denominador, this.denominador*fraccion2.numerador);
		
		return division.reducir();
	}
	
	public Fraccion multiplicacion(Fraccion fraccion2) {

		Fraccion division = new Fraccion(this.numerador*fraccion2.numerador, this.denominador*fraccion2.denominador);
		
		return division.reducir();
	}
	
	public Fraccion inversa() {

		Fraccion division = new Fraccion(denominador, numerador);
		
		return division.reducir();
	}
	

	public static void main(String[] args) {

		Fraccion f1 = new Fraccion(2, 2);
		Fraccion f2 = new Fraccion(4, 3);
		Fraccion f3 = new Fraccion(2, 0);

		System.out.println("Fraccion 1:     " + f1);
		System.out.println("Fraccion 2:     " + f2);

		Fraccion f4 = f1.suma(f2);
		System.out.println("Suma:           " + f4);

		Fraccion f5 = f1.resta(f2);
		System.out.println("Resta:          " + f5);
		
		Fraccion f6 = f1.division(f2);
		System.out.println("Division:       " + f6);
		
		Fraccion f7 = f1.multiplicacion(f2);
		System.out.println("Multiplicacion: " + f7);
		
		Fraccion f8 = f2.inversa();
		System.out.println("Inversa(f2):    " + f8);
	}

}
=======
package EjerciciosClases03;

public class Fraccion {
	private int numerador, denominador;

	public Fraccion() {
		super();
	}

	public Fraccion(int numerador, int denominador) {
		super();
		if (denominador != 0) {
			this.numerador = numerador;
			this.denominador = denominador;
		} else {
			System.out.println("No se puede crear una fracción con denominador 0");
		}
	}

	public double getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public double getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}

	public Fraccion suma(Fraccion fraccion2) {
		int mcm = minimoComunMultiplo(this.denominador, fraccion2.denominador);
		int m1, m2;

		m1 = mcm / this.denominador;
		m2 = mcm / fraccion2.denominador;

		Fraccion suma = new Fraccion(this.numerador * m1 + fraccion2.numerador * m2, mcm);
		
		return suma.reducir();
	}

	public int minimoComunMultiplo(int num1, int num2) {
		boolean confirmacion = false;
		int i = 1;

		for (; confirmacion != true; i++) {
			for (int j = 1; Math.min(num2, num1) * i >= Math.max(num1, num2) * j; j++) {
				if (Math.min(num2, num1) * i == Math.max(num1, num2) * j) {
					confirmacion = true;
				}
			}
		}
		int mcm = Math.min(num2, num1) * (i - 1);

		return mcm;
	}

	public Fraccion reducir() {
		boolean confirmacion = false;
		Fraccion reducida = new Fraccion(numerador, denominador);
		

		for (int i = Math.min(Math.abs(numerador), Math.abs(denominador)); confirmacion != true && i>0; i--) {
			if (Math.min(numerador, denominador) % i == 0 &&  Math.max(denominador, numerador) % i ==0) {
				reducida.setNumerador(numerador/i);
				reducida.setDenominador(denominador/i);
				confirmacion = true;
			}
		}

		return reducida;
	}

	public int maximoComunDivisor(int denominador1, int denominador2) {
		boolean confirmacion = false;
		int i = 1;

		for (; confirmacion != true; i++) {
			for (int j = 1; Math.min(denominador2, denominador1) * i >= Math.max(denominador1, denominador2) * j; j++) {
				if (Math.min(denominador2, denominador1) * i == Math.max(denominador1, denominador2) * j) {
					confirmacion = true;
				}
			}
		}
		int mcm = Math.min(denominador2, denominador1) * (i - 1);

		return mcm;
	}
	
	public Fraccion resta(Fraccion fraccion2) {
		int mcm = minimoComunMultiplo(this.denominador, fraccion2.denominador);
		int m1, m2;

		m1 = mcm / this.denominador;
		m2 = mcm / fraccion2.denominador;

		Fraccion suma = new Fraccion(this.numerador * m1 - fraccion2.numerador * m2, mcm);
		
		return suma.reducir();
	}
	
	public Fraccion division(Fraccion fraccion2) {

		Fraccion division = new Fraccion(this.numerador*fraccion2.denominador, this.denominador*fraccion2.numerador);
		
		return division.reducir();
	}
	
	public Fraccion multiplicacion(Fraccion fraccion2) {

		Fraccion division = new Fraccion(this.numerador*fraccion2.numerador, this.denominador*fraccion2.denominador);
		
		return division.reducir();
	}
	
	public Fraccion inversa() {

		Fraccion division = new Fraccion(denominador, numerador);
		
		return division.reducir();
	}
	

	public static void main(String[] args) {

		Fraccion f1 = new Fraccion(2, 2);
		Fraccion f2 = new Fraccion(4, 3);
		Fraccion f3 = new Fraccion(2, 0);

		System.out.println("Fraccion 1:     " + f1);
		System.out.println("Fraccion 2:     " + f2);

		Fraccion f4 = f1.suma(f2);
		System.out.println("Suma:           " + f4);

		Fraccion f5 = f1.resta(f2);
		System.out.println("Resta:          " + f5);
		
		Fraccion f6 = f1.division(f2);
		System.out.println("Division:       " + f6);
		
		Fraccion f7 = f1.multiplicacion(f2);
		System.out.println("Multiplicacion: " + f7);
		
		Fraccion f8 = f2.inversa();
		System.out.println("Inversa(f2):    " + f8);
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
