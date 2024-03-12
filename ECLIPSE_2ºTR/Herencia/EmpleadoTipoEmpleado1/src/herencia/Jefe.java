<<<<<<< HEAD
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

    public String toString() {
        String s = super.toString();
        s = s + "\n" + " Departamento: " + departamento;
        
        return s;
    }
=======
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

    public String toString() {
        String s = super.toString();
        s = s + "\n" + " Departamento: " + departamento;
        
        return s;
    }
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}