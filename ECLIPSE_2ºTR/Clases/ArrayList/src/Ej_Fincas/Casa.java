package Ej_Fincas;

public class Casa {
	private double metros2;
	private int plantas, numhabitaciones;
	public Casa(double metros2, int plantas, int numhabitaciones) {
		super();
		this.metros2 = metros2;
		this.plantas = plantas;
		this.numhabitaciones = numhabitaciones;
	}
	public double getMetros2() {
		return metros2;
	}
	public void setMetros2(double metros2) {
		this.metros2 = metros2;
	}
	public int getPlantas() {
		return plantas;
	}
	public void setPlantas(int plantas) {
		this.plantas = plantas;
	}
	public int getNumhabitaciones() {
		return numhabitaciones;
	}
	public void setNumhabitaciones(int numhabitaciones) {
		this.numhabitaciones = numhabitaciones;
	}
	@Override
	public String toString() {
		return "Casa [metros2=" + metros2 + ", plantas=" + plantas + ", numhabitaciones=" + numhabitaciones + "]";
	}
	
	

}
