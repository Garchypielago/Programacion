package excepcion;

public class ExcepcionIntervalo extends Exception {

	private static final long serialVersionUID = 1L;

	// En este caso no pongo el constructor por defecto
	public ExcepcionIntervalo(String msg) {
        super(msg);
    }
}