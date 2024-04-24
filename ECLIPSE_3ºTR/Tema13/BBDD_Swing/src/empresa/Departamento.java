package empresa;

public class Departamento {
	
	private String nombre, locate;
	private int cod;
	public Departamento(String nombre, String locate, int cod) {
		super();
		this.nombre = nombre;
		this.locate = locate;
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocate() {
		return locate;
	}
	public void setLocate(String locate) {
		this.locate = locate;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", locate=" + locate + ", cod=" + cod + "]";
	}
	
	

}
