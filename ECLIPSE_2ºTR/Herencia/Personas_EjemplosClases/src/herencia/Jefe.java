<<<<<<< HEAD
package herencia;

public class Jefe extends Empleado {
	protected String departamento;

	public Jefe(String nombre, int sueldo, String departamento) {
		super(nombre, sueldo);
		this.departamento = departamento;
	}
	
	public Jefe() {
		super();
	}

	public void cambiarDepartamento(String dep) {
		departamento=dep;
	}

	@Override
	public String toString() {
		return "Jefe [departamento=" + departamento + "]";
	}
	
	public String tipoEmpleado00() {
    	return "Es un jefe";
    }

}
=======
package herencia;

public class Jefe extends Empleado {
	protected String departamento;

	public Jefe(String nombre, int sueldo, String departamento) {
		super(nombre, sueldo);
		this.departamento = departamento;
	}
	
	public Jefe() {
		super();
	}

	public void cambiarDepartamento(String dep) {
		departamento=dep;
	}

	@Override
	public String toString() {
		return "Jefe [departamento=" + departamento + "]";
	}
	
	public String tipoEmpleado00() {
    	return "Es un jefe";
    }

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
