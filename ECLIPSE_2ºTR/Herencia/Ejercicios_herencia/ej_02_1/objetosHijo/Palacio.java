<<<<<<< HEAD
package objetosHijo;

import objetoPadre.Vivienda;

public class Palacio extends Vivienda {
	protected int nhabitaciones;

	public Palacio(double m2, String calle, int num, int nhabitaciones) {
		super(m2, calle, num);
		this.nhabitaciones = nhabitaciones;
	}

	public Palacio() {
		super();
	}

	public int getNhabitaciones() {
		return nhabitaciones;
	}

	public void setNhabitaciones(int nhabitaciones) {
		this.nhabitaciones = nhabitaciones;
	}

	@Override
	public String toString() {
		return "Palacio: " + super.toString() + ", numero de habitaciones=" + nhabitaciones;
	}
	

}
=======
package objetosHijo;

import objetoPadre.Vivienda;

public class Palacio extends Vivienda {
	protected int nhabitaciones;

	public Palacio(double m2, String calle, int num, int nhabitaciones) {
		super(m2, calle, num);
		this.nhabitaciones = nhabitaciones;
	}

	public Palacio() {
		super();
	}

	public int getNhabitaciones() {
		return nhabitaciones;
	}

	public void setNhabitaciones(int nhabitaciones) {
		this.nhabitaciones = nhabitaciones;
	}

	@Override
	public String toString() {
		return "Palacio: " + super.toString() + ", numero de habitaciones=" + nhabitaciones;
	}
	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
