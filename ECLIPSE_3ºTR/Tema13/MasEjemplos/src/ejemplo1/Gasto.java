package ejemplo1;

public class Gasto {
	String concepto;
	double importe;

	public Gasto(String concepto, double cantidad) {
		this.concepto = concepto;
		this.importe = cantidad;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

}
