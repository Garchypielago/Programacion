package pruebas;

public class ImplementaInterfaz implements MiInterfaz {

	int multiplicando = MiInterfaz.CONSTANTE; // Se puede no poner el nombre del interfaz

	public int metodoAbstracto(int parametro) {// Obligatorio implementarla
		return (parametro * multiplicando);
		// return ( parametro * MiInterfaz.CONSTANTE );
	}
}
