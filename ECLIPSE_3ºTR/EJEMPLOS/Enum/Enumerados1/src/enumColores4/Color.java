package enumColores4;

//Una enumeracion (Note la palabra enum en lugar de class)
public enum Color {
	ROJO, VERDE, AZUL;

	// enum constructor llamado por separado para cada constante cuando se crea
	// una variable de tipo enum Color. Observad la ejecucion
	private Color() {
		System.out.println("Constructor llamado para : " + this);
	}

	// Solo metodos concretos (no abstractos) permitidos
	public void colorInfo() {
		System.out.println(this + " desde colorInfo()");
	}
}