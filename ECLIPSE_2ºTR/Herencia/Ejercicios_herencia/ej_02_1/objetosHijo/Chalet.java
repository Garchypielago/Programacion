<<<<<<< HEAD
package objetosHijo;

import objetoPadre.Vivienda;

public class Chalet extends Vivienda {
	protected boolean jardin;

	public Chalet(String calle, int num, boolean jardin) {
		super(120, calle, num);
		this.jardin=jardin;
	}

	public Chalet() {
		super();
		super.setM2(120);
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	@Override
	public String toString() {
		return "Chalet: " + super.toString() + ", jardin=" + jardin;
	}
	
	
	
	
}
=======
package objetosHijo;

import objetoPadre.Vivienda;

public class Chalet extends Vivienda {
	protected boolean jardin;

	public Chalet(String calle, int num, boolean jardin) {
		super(120, calle, num);
		this.jardin=jardin;
	}

	public Chalet() {
		super();
		super.setM2(120);
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	@Override
	public String toString() {
		return "Chalet: " + super.toString() + ", jardin=" + jardin;
	}
	
	
	
	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
