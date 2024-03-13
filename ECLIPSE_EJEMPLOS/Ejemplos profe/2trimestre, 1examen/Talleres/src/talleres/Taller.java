package talleres;
import java.util.ArrayList;

public class Taller {
	private String nombre;
	private String CIF;
	private String direccion;
	private ArrayList<Coche> v;

	public Taller(String _nombre, String _CIF, String _direccion) {
		nombre = _nombre;
		CIF = _CIF;
		direccion = _direccion;
		v = new ArrayList<Coche>();
	}

	public void introducirCoche(Coche unCoche) {
		v.add(unCoche);
	}

	public String toString() {
		String taller = "";
		taller += "\nNombre del taller: " + nombre;
		taller += "\nCIF: " + CIF;
		taller += "\nDireccion: " + direccion;
		taller += "\n----------------------";
		for (int i = 0; i < v.size(); i++) {
			taller += "\n Coche numero " + (i + 1);
			taller += v.get(i);
		}
		return taller;
	}
}