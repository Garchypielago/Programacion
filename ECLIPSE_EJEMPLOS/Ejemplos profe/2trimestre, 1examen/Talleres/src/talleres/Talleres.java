package talleres;

public class Talleres {
	public static final int NTALLERES = 2;
	private Taller v[];
	private int nTalleres;

	public Talleres() {
		v = new Taller[NTALLERES];
		nTalleres = 0;
	}

	public void introducirTaller(Taller unTaller) {
		v[nTalleres] = unTaller;
		nTalleres++;
	}

	public void introducirCoche(int numTaller, Coche c) {
		v[numTaller - 1].introducirCoche(c);
	}

	public int devNumTalleres() {
		return nTalleres;
	}

	public String toString() {
		String cadena = "";
		for (int i = 0; i < NTALLERES; i++) {
			cadena += "\n\n******** TALLER " + (i + 1) + "********\n\n";
			cadena += v[i]; // concatena con el array de talleres
		}
		return cadena;
	}

}
