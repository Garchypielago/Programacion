<<<<<<< HEAD
package ordenacion;

import java.util.Comparator;

public class OrdenarJugadorAltura implements Comparator<Jugador> {
	@Override
	public int compare(Jugador o1, Jugador o2) {
		return o1.getAltura() - o2.getAltura();
		// Devuelve un entero positivo si la altura de o1 es mayor que la de o2
		// As� ordenar�amos ascendemente
		// return o2.getAltura() - o1.getAltura();
		// Devuelve un entero positivo si la altura de o1 es menor que la de o2
		// As� ordenar�amos descendemente
	}
}
=======
package ordenacion;

import java.util.Comparator;

public class OrdenarJugadorAltura implements Comparator<Jugador> {
	@Override
	public int compare(Jugador o1, Jugador o2) {
		return o1.getAltura() - o2.getAltura();
		// Devuelve un entero positivo si la altura de o1 es mayor que la de o2
		// As� ordenar�amos ascendemente
		// return o2.getAltura() - o1.getAltura();
		// Devuelve un entero positivo si la altura de o1 es menor que la de o2
		// As� ordenar�amos descendemente
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
