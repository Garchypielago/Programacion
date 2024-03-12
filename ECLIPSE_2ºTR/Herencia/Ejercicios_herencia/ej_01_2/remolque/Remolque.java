package remolque;

public class Remolque  {
	protected int peso;

	public Remolque(int peso) {
		super();
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "de peso: " + peso;
	}
	
}
