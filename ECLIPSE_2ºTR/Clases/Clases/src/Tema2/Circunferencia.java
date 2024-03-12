<<<<<<< HEAD
package Tema2;

class Circunferencia {
	private double x, y, radio; //solo lo puede modificar esta clase

	public Circunferencia() { //este no recibe valores y se crea uno por defecto
	}

	public Circunferencia(double cx, double cy, double r) { //con valores como los otros ej
		x = cx;
		y = cy;
		radio = r;
	}
	
	//crea un objeto circunferencia 

	public void ponRadio(double r) {
		radio = r;
	}
	
	//es void por que modifica un valor de mi objeto de la clase circunferencia

	public double longitud() {
		return 2 * Math.PI * radio;
	}
	
	//operacion de nuestra clase con nuestro objeto circunferencia
}
=======
package Tema2;

class Circunferencia {
	private double x, y, radio; //solo lo puede modificar esta clase

	public Circunferencia() { //este no recibe valores y se crea uno por defecto
	}

	public Circunferencia(double cx, double cy, double r) { //con valores como los otros ej
		x = cx;
		y = cy;
		radio = r;
	}
	
	//crea un objeto circunferencia 

	public void ponRadio(double r) {
		radio = r;
	}
	
	//es void por que modifica un valor de mi objeto de la clase circunferencia

	public double longitud() {
		return 2 * Math.PI * radio;
	}
	
	//operacion de nuestra clase con nuestro objeto circunferencia
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
