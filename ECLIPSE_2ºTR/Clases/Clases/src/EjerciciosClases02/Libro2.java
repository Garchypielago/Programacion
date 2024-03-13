package EjerciciosClases02;

public class Libro2 {
	private String titulo;
	private int numEjemplar, numPrestados;
	private Autor autor;

	public Libro2() {
		super();
	}

	public Libro2(String titulo, Autor autor, int numEjemplar, int numPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplar = numEjemplar;
		this.numPrestados = numPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getNumEjemplar() {
		return numEjemplar;
	}

	public void setNumEjemplar(int numEjemplar) {
		this.numEjemplar = numEjemplar;
	}

	public int getNumPrestados() {
		return numPrestados;
	}

	public void setNumPrestados(int numPrestados) {
		this.numPrestados = numPrestados;
	}

	public boolean prestar() {
		boolean prestamo = false;

		if (numPrestados < numEjemplar) {
			numPrestados++;
			prestamo = true;
		}

		return prestamo;
	}
	
	public boolean devolucion() {
		boolean devolucion = false;

		if (numPrestados != 0) {
			numPrestados--;
			devolucion = true;
		}

		return devolucion;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numEjemplar=" + numEjemplar + ", numPrestados="
				+ numPrestados + "]";
	}

}
