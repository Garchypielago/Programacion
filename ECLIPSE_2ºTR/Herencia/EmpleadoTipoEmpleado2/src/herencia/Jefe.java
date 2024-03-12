package herencia;
public class Jefe extends Empleado {
    // private String departamento;
    protected String departamento;
    public Jefe () {
       
    }
    public Jefe (String n, int s, String dep) {
        super(n,s);
        departamento= dep;
    }

    public void cambiarDepartamento(String dep) {
        departamento= dep;
    }

    public String tipoEmpleado() {
		return " Es jefe";
	}
    public String toString() {
        String s = super.toString();
        s = s + "\n" + " Departamento: " + departamento;
        
        return s;
    }
}