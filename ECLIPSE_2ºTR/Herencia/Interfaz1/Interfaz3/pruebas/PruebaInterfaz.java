package pruebas;
public class PruebaInterfaz {
	public static void main(String args[]) {
		Figura figura = new Cuadrado(5);
		// Podemos crear una referencia de interface (variable figura) y que un objeto
		// que pertenezca a una clase que la implementa le sea asignado a la variable

		System.out.println(figura.area());

		Cuadrado c = new Cuadrado(5);
		System.out.println(c.area());
	}
}
