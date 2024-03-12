<<<<<<< HEAD
package Ej_01;

import java.util.ArrayList;
import java.util.Iterator;

import modificaciones.Coche;

public class TrianguloIsosceles {
	private double base, altura, lado, area, perimetro;
	
	public TrianguloIsosceles(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		lado();
		perimetro();
		area();
	}


	public TrianguloIsosceles() {
		super();
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
		lado();
		perimetro();
		area();
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
		lado();
		perimetro();
		area();
	}
	
	
	public void lado() {
		lado = Math.sqrt((Math.pow(base/2,2)+Math.pow(altura, 2)));
	}
	
	public void perimetro() {
		perimetro=lado*2+base;
	}
	
	public void area() {
		area = (base*altura)/2;
	}


	public double getLado() {
		return lado;
	}

	public double getArea() {
		return area;
	}


	public double getPerimetro() {
		return perimetro;
	}


	@Override
	public String toString() {
		return "TrianguloIsosceles [base=" + base + ", altura=" + altura + ", lado=" + lado + ", area=" + area
				+ ", perimetro=" + perimetro + "]";
	}
	
	public String toStringBaseAltura() {
		return "TrianguloIsosceles [base=" + base + ", altura=" + altura + "]";
	}
	
	public String toStringSinLado() {
		return "TrianguloIsosceles [base=" + base + ", altura=" + altura + ", area=" + area
				+ ", perimetro=" + perimetro + "]";
	}

	
	
	
	
	
}
=======
package Ej_01;

import java.util.ArrayList;
import java.util.Iterator;

import modificaciones.Coche;

public class TrianguloIsosceles {
	private double base, altura, lado, area, perimetro;
	
	public TrianguloIsosceles(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		lado();
		perimetro();
		area();
	}


	public TrianguloIsosceles() {
		super();
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
		lado();
		perimetro();
		area();
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
		lado();
		perimetro();
		area();
	}
	
	
	public void lado() {
		lado = Math.sqrt((Math.pow(base/2,2)+Math.pow(altura, 2)));
	}
	
	public void perimetro() {
		perimetro=lado*2+base;
	}
	
	public void area() {
		area = (base*altura)/2;
	}


	public double getLado() {
		return lado;
	}

	public double getArea() {
		return area;
	}


	public double getPerimetro() {
		return perimetro;
	}


	@Override
	public String toString() {
		return "TrianguloIsosceles [base=" + base + ", altura=" + altura + ", lado=" + lado + ", area=" + area
				+ ", perimetro=" + perimetro + "]";
	}
	
	public String toStringBaseAltura() {
		return "TrianguloIsosceles [base=" + base + ", altura=" + altura + "]";
	}
	
	public String toStringSinLado() {
		return "TrianguloIsosceles [base=" + base + ", altura=" + altura + ", area=" + area
				+ ", perimetro=" + perimetro + "]";
	}

	
	
	
	
	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
