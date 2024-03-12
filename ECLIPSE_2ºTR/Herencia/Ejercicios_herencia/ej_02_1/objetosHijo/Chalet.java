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
