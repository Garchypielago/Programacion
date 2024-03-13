package pruebas;
public class Globo extends NaveAerea implements Conducible {
	private int volumenGas;

	public void setVolumenGas(int volumenGas) {
		this.volumenGas = volumenGas;
	}

	public int getVolumenGas() {
		return this.volumenGas;
	}

	// los dos siguientes métodos es obligatorio implementarlos:
	
	public void girarDerecha(int grados) {
		if (getDireccion() == 'N' && grados == MAXIMO_GIRO)
			setDireccion('E');
	}

	public void girarIzquierda(int grados) {
		if (getDireccion() == 'N' && grados == MAXIMO_GIRO)
			setDireccion('O');
	}
}
