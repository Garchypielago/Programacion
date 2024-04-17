package bolsa;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {

		// Al hacerlo con genericos no puedo mezclar en la misma bolsa Chocolatinas y
		// Golosinas
		// O es de Chocolatinas o de Golosinas

		Bolsa<Chocolatina> bolsa = new Bolsa<Chocolatina>(10);

		Chocolatina c1 = new Chocolatina("Milka");
		Chocolatina c2 = new Chocolatina("Ferrero");
		Chocolatina c3 = new Chocolatina("Milka");
		try {
			bolsa.add(c1);
			bolsa.add(c2);
			bolsa.add(c3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (Chocolatina chocolatinas : bolsa) {
			System.out.println(chocolatinas.getMarca());
		}

		Bolsa<Golosina> bolsa2 = new Bolsa<Golosina>(1);

		Golosina g1 = new Golosina("gominolas");
		Golosina g2 = new Golosina("chupachups");
		Golosina g3 = new Golosina("chicles");
		
		try {
			bolsa2.add(g1);
			bolsa2.add(g2);
			bolsa2.add(g3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Golosina golosinas : bolsa2) {
			System.out.println(golosinas.getNombre());
		}
		
		Iterator<Golosina> it1 = bolsa2.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		Iterator<Chocolatina> it2 = bolsa.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
