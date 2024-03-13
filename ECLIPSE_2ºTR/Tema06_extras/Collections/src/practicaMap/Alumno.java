package practicaMap;

public class Alumno {
	
	private String nombre;
	private int pev, sev, tev;
	
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
		pev=-1;
		sev=-1;
		tev=-1;
	}
	
	

	public Alumno(String nombre, int pev, int sev, int tev) {
		super();
		this.nombre = nombre;
		this.pev = pev;
		this.sev = sev;
		this.tev = tev;
	}



	public int getPev() {
		return pev;
	}

	public void setPev(int pev) {
		this.pev = pev;
	}

	public int getSev() {
		return sev;
	}

	public void setSev(int sev) {
		this.sev = sev;
	}

	public int getTev() {
		return tev;
	}

	public void setTev(int tev) {
		this.tev = tev;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		String pevs, sevs, tevs;
		pevs= (pev<0) ? "-" : String.valueOf(pev);
		sevs= (sev<0) ? "-" : String.valueOf(sev);
		tevs= (tev<0) ? "-" : String.valueOf(tev);
		
		String alumno= String.format("%s    \t %10s %14s %14s ", nombre, pevs, sevs, tevs);
		
		return alumno;
	}
	
	
	
	
	
	
	

}
