package excepciones;

public class PorcentajeIncorrectoException extends Exception {

	private static final long serialVersionUID = 1L;

	public PorcentajeIncorrectoException(String msg) {
        super(msg);
    }
}