package Ej_Fincas;

public class Parcela {
	private double metros2;
	private boolean agricola, ganadera;
	public Parcela(double metros2, boolean agricola, boolean ganadera) {
		super();
		this.metros2 = metros2;
		this.agricola = agricola;
		this.ganadera = ganadera;
	}
	public double getMetros2() {
		return metros2;
	}
	public void setMetros2(double metros2) {
		this.metros2 = metros2;
	}
	public boolean isAgricola() {
		return agricola;
	}
	public void setAgricola(boolean agricola) {
		this.agricola = agricola;
	}
	public boolean isGanadera() {
		return ganadera;
	}
	public void setGanadera(boolean ganadera) {
		this.ganadera = ganadera;
	}
	@Override
	public String toString() {
		return "parcela [metros2=" + metros2 + ", agricola=" + agricola + ", ganadera=" + ganadera + "]";
	}
	
	
}
