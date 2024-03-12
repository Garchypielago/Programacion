<<<<<<< HEAD
package EjerciciosClases03;

public class Cubo {
	private int capacidad; // capacidad máxima en litros
	private int contenido; // contenido actual en litros

	public Cubo(int capacidad, int contenido) {
		super();
		this.capacidad = capacidad;
		this.contenido = contenido;
	}

	public Cubo(int capacidad) {
		super();
		this.capacidad = capacidad;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void llena() {
		this.contenido = capacidad;
	}

	public void vacia() {
		this.contenido = 0;
	}

	public int capacidadRestante() {
		return (capacidad - contenido);
	}

	void vuelcaEn(Cubo destino) {
		if (destino.capacidadRestante() >= contenido) {
			destino.setContenido(contenido + destino.getContenido());
			vacia();
		} else {
			contenido = contenido - destino.capacidadRestante();
			destino.llena();
			System.out.println("El cubo destino se desbordaria si se vuelca entero, tu cubo ahora tiene " + contenido + "L de contenido.");
		}
	}

	void pinta() {
		for (int i = getCapacidad(); i >= 0; i--) {
			if (i>getContenido()) {
				System.out.println("#     #");
			} else if (i==0){
				System.out.println("#######");
			} else {
				System.out.println("#~~~~~#");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Cubo c1= new Cubo(5,3);
		c1.pinta();
		System.out.println();
		
		Cubo c2= new Cubo(7,4);
		c2.pinta();
		System.out.println();
		
		c1.vuelcaEn(c2);
		c1.pinta();
		System.out.println();
		c2.pinta();
		System.out.println();
		
		c1.llena();
		c1.pinta();
		
	}

}
=======
package EjerciciosClases03;

public class Cubo {
	private int capacidad; // capacidad máxima en litros
	private int contenido; // contenido actual en litros

	public Cubo(int capacidad, int contenido) {
		super();
		this.capacidad = capacidad;
		this.contenido = contenido;
	}

	public Cubo(int capacidad) {
		super();
		this.capacidad = capacidad;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void llena() {
		this.contenido = capacidad;
	}

	public void vacia() {
		this.contenido = 0;
	}

	public int capacidadRestante() {
		return (capacidad - contenido);
	}

	void vuelcaEn(Cubo destino) {
		if (destino.capacidadRestante() >= contenido) {
			destino.setContenido(contenido + destino.getContenido());
			vacia();
		} else {
			contenido = contenido - destino.capacidadRestante();
			destino.llena();
			System.out.println("El cubo destino se desbordaria si se vuelca entero, tu cubo ahora tiene " + contenido + "L de contenido.");
		}
	}

	void pinta() {
		for (int i = getCapacidad(); i >= 0; i--) {
			if (i>getContenido()) {
				System.out.println("#     #");
			} else if (i==0){
				System.out.println("#######");
			} else {
				System.out.println("#~~~~~#");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Cubo c1= new Cubo(5,3);
		c1.pinta();
		System.out.println();
		
		Cubo c2= new Cubo(7,4);
		c2.pinta();
		System.out.println();
		
		c1.vuelcaEn(c2);
		c1.pinta();
		System.out.println();
		c2.pinta();
		System.out.println();
		
		c1.llena();
		c1.pinta();
		
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
