<<<<<<< HEAD
package datos;
public class Finca {
	private String nombre;
	private int metros;
	private Casa casa;
	private Parcela parcela;
	
	public Finca (String _nombre, Casa _miCasa, Parcela _miParcela) {// no recibe los metros, lo calcula dentro
		nombre = _nombre;
		metros = _miCasa.getMetros() + _miParcela.getMetros();
		casa = _miCasa;
		parcela = _miParcela;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Casa getCasa() {
		return casa;
	}
	
	public Parcela getParcela() {
		return parcela;
	}
	
	public void setNombre(String _nombre) {
		nombre = _nombre;
	}
	
	public void setParcela(Parcela _parcela) {
		parcela = _parcela;
	}
	
	public String toString() {
		String aux;
		
		aux = "> FINCA\n";
		aux += "Nombre: " + nombre;
		aux += " *** Metros: " + metros;
		
		return aux + "\n" + casa + "\n" + parcela ;
	}
=======
package datos;
public class Finca {
	private String nombre;
	private int metros;
	private Casa casa;
	private Parcela parcela;
	
	public Finca (String _nombre, Casa _miCasa, Parcela _miParcela) {// no recibe los metros, lo calcula dentro
		nombre = _nombre;
		metros = _miCasa.getMetros() + _miParcela.getMetros();
		casa = _miCasa;
		parcela = _miParcela;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Casa getCasa() {
		return casa;
	}
	
	public Parcela getParcela() {
		return parcela;
	}
	
	public void setNombre(String _nombre) {
		nombre = _nombre;
	}
	
	public void setParcela(Parcela _parcela) {
		parcela = _parcela;
	}
	
	public String toString() {
		String aux;
		
		aux = "> FINCA\n";
		aux += "Nombre: " + nombre;
		aux += " *** Metros: " + metros;
		
		return aux + "\n" + casa + "\n" + parcela ;
	}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}