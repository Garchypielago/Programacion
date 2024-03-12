package herencia;

public class Autonomo extends Empleado {
	protected String empresa;

	public Autonomo(String nombre, int sueldo, String empresa) {
		super(nombre, sueldo);
		this.empresa = empresa;	
		
	}
	
	public Autonomo() {
		super();
	}
	
	public void cambiarEmpresa(String emp) {
		empresa=emp;
	}

	@Override
	public String toString() {
		return "Autonomo [empresa=" + empresa + "]";
	}
	
	public String tipoEmpleado00() {
    	return "Es un autonomo";
    }
	
	

}
