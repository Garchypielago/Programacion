<<<<<<< HEAD
package herencia;

public class Empleado {
    protected String nombre;
    protected int numEmpleado, sueldo;

    static private int contador = 0;
    
    public Empleado(){
   	 numEmpleado = ++contador;
   }
    
    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        numEmpleado = ++contador;
    }

    public void aumentarSueldo(int porcentaje) {
        sueldo += (int)(sueldo * porcentaje / 100);
    }

    public String toString() {
        return " Num. empleado " + numEmpleado + "\n" + " Nombre: " + nombre
                + "\n" +" Sueldo: " + sueldo;
    }
=======
package herencia;

public class Empleado {
    protected String nombre;
    protected int numEmpleado, sueldo;

    static private int contador = 0;
    
    public Empleado(){
   	 numEmpleado = ++contador;
   }
    
    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        numEmpleado = ++contador;
    }

    public void aumentarSueldo(int porcentaje) {
        sueldo += (int)(sueldo * porcentaje / 100);
    }

    public String toString() {
        return " Num. empleado " + numEmpleado + "\n" + " Nombre: " + nombre
                + "\n" +" Sueldo: " + sueldo;
    }
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}