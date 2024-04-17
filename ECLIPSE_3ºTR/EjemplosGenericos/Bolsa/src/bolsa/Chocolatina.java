package bolsa;
public class Chocolatina {

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Chocolatina(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Chocolatina [marca=" + marca + "]";
	}

}
