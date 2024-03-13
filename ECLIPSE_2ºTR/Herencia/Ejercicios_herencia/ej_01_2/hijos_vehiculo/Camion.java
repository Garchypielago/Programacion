package hijos_vehiculo;

import Vehiculo.Vehiculo;
import remolque.Remolque;
import excepciones_ej01_2.*;

public class Camion extends Vehiculo {
	Remolque remolque;

	public Camion(String matricula) {
		super(matricula);
		remolque = null;
	}

	public Remolque getRemolque() {
		return remolque;
	}

	public void setRemolque(Remolque remolque) {
		this.remolque = remolque;
	}

	public void ponRemolque(int peso) {
		this.remolque = new Remolque(peso);
	}

	public void quitaRemolque() {
		this.remolque = null;
	}

	@Override
	public String toString() {
		return super.toString() + ", remolque " + remolque.toString();
	}

	public void acelerar(int ac) throws DemasiadoRapidoExcepcion {
		int vn = this.getVelocidad() + ac;

		if (vn > 100)
			throw new DemasiadoRapidoExcepcion("Demasiado rapido");

		setVelocidad(vn);

	}

}
