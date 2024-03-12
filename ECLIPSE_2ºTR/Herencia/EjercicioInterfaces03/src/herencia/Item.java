<<<<<<< HEAD
package herencia;

public abstract class Item {
	private String nombre;
	private int id;
	public Item(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	public Item() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Nombre= " + nombre + ", id= " + id;
	}
	

}
=======
package herencia;

public abstract class Item {
	private String nombre;
	private int id;
	public Item(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	public Item() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Nombre= " + nombre + ", id= " + id;
	}
	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
