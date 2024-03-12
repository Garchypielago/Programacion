<<<<<<< HEAD
package EjerciciosClases02;

public class Libro {
	private String titulo, autor;
	private int numEjemplar, numPrestados;

	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, int numEjemplar, int numPrestados) {
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
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
=======
package EjerciciosClases02;

public class Libro {
	private String titulo, autor;
	private int numEjemplar, numPrestados;

	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, int numEjemplar, int numPrestados) {
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
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
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
