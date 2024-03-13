package Ej_Fincas;

public class Finca {
	private Casa casa;
	private Parcela parcela;
	public Finca(Casa casa, Parcela parcela) {
		super();
		this.casa = casa;
		this.parcela = parcela;
	}
	public Casa getCasa() {
		return casa;
	}
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	public Parcela getParcela() {
		return parcela;
	}
	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}
	@Override
	public String toString() {
		return "Finca [casa=" + casa + ", parcela=" + parcela + "]";
	}
	
	

}
