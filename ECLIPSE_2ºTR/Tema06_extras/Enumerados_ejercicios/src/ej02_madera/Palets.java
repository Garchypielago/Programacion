<<<<<<< HEAD
package ej02_madera;

import java.util.*;

public class Palets {
	
	private static final double m3=2.27;
	private Madera tipo;
	private double peso;
	
	public Palets(Madera tipo) {
		super();
		this.tipo = tipo;
		this.peso = m3 * tipo.getPeso();
	}
	
	@Override
	public String toString() {
		return "Palets madera=" + tipo + ", peso=" + peso + "Kg" + ", color=" + tipo.getColor();
	}

	public static void main(String[] args) {
		
		ArrayList<Palets> ps = new ArrayList<Palets>();
		
		for (Madera m : Madera.values()) {
			ps.add(new Palets(m));
		}
		
		for (Palets p: ps) {
			System.out.println(p);
		}
		
		
		
	}
	
	
}
=======
package ej02_madera;

import java.util.*;

public class Palets {
	
	private static final double m3=2.27;
	private Madera tipo;
	private double peso;
	
	public Palets(Madera tipo) {
		super();
		this.tipo = tipo;
		this.peso = m3 * tipo.getPeso();
	}
	
	@Override
	public String toString() {
		return "Palets madera=" + tipo + ", peso=" + peso + "Kg" + ", color=" + tipo.getColor();
	}

	public static void main(String[] args) {
		
		ArrayList<Palets> ps = new ArrayList<Palets>();
		
		for (Madera m : Madera.values()) {
			ps.add(new Palets(m));
		}
		
		for (Palets p: ps) {
			System.out.println(p);
		}
		
		
		
	}
	
	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
