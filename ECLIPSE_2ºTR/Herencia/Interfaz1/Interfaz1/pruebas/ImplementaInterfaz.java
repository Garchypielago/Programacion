<<<<<<< HEAD
package pruebas;

public class ImplementaInterfaz implements MiInterfaz {

	int multiplicando = MiInterfaz.CONSTANTE; // Se puede no poner el nombre del interfaz

	public int metodoAbstracto(int parametro) {// Obligatorio implementarla
		return (parametro * multiplicando);
		// return ( parametro * MiInterfaz.CONSTANTE );
	}
}
=======
package pruebas;

public class ImplementaInterfaz implements MiInterfaz {

	int multiplicando = MiInterfaz.CONSTANTE; // Se puede no poner el nombre del interfaz

	public int metodoAbstracto(int parametro) {// Obligatorio implementarla
		return (parametro * multiplicando);
		// return ( parametro * MiInterfaz.CONSTANTE );
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
