package conductor;

public class Conductor {
	private boolean socio;
	private String NIF;
	
	public Conductor(boolean socio, String nIF) {
		super();
		this.socio = socio;
		NIF = nIF;
	}
	public Conductor() {
		super();
	}
	public boolean isSocio() {
		return socio;
	}
	public void setSocio(boolean socio) {
		this.socio = socio;
	}
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	@Override
	public String toString() {
		return "Conductor [socio=" + socio + ", NIF=" + NIF + "]";
	}
	
	

}
