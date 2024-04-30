package ejemplo1;

import java.util.ArrayList;

public class PrincipalSinStreams {

	public static void main(String[] args) {

		ArrayList<Gasto> lista = new ArrayList<Gasto>();

		lista.add(new Gasto("A", 80));
		lista.add(new Gasto("B", 50));
		lista.add(new Gasto("C", 70));
		lista.add(new Gasto("D", 95));

		double totalPago = 0;

		for (Gasto g : lista) {
			if (g.getImporte() * 1.21 < 100) {// los que exceden 100, no nos los pagan
				totalPago = totalPago + g.getImporte() * 1.21;
			}
		}

		System.out.println(totalPago);

	}

}
