<<<<<<< HEAD
package bebidas;

enum Bebidas {
	// Tipos de vasos disponibles. Pasan al constructor su capacidad en cc
	// disponibles
	JARRA(500), TUBO(250), TERCIO(333), CANIA(200);
	private int cc; // atributo donde almacenaremos la capacidad

	Bebidas(int cc) {
		this.cc = cc;
	}

	// metodo que devuelve la capacidad del vaso
	public int getCentimetrosCubicos() {
		return cc;
	}

}
=======
package bebidas;

enum Bebidas {
	// Tipos de vasos disponibles. Pasan al constructor su capacidad en cc
	// disponibles
	JARRA(500), TUBO(250), TERCIO(333), CANIA(200);
	private int cc; // atributo donde almacenaremos la capacidad

	Bebidas(int cc) {
		this.cc = cc;
	}

	// metodo que devuelve la capacidad del vaso
	public int getCentimetrosCubicos() {
		return cc;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
