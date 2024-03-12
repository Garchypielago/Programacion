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
    
    public String tipoEmpleado00() {
    	return "Es un empleado";
    }
    
    public String tipoEmpleado() {
    	String tipo;
    	
    	if (this instanceof Ejecutivo)
    		tipo = "Es ejecutivo";
    	else if (this instanceof Jefe)
    		tipo = "Es jefe";
    	else if (this instanceof Autonomo)
    		tipo = "Es Autonomo";
    	
    	return null;
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
    
    public String tipoEmpleado00() {
    	return "Es un empleado";
    }
    
    public String tipoEmpleado() {
    	String tipo;
    	
    	if (this instanceof Ejecutivo)
    		tipo = "Es ejecutivo";
    	else if (this instanceof Jefe)
    		tipo = "Es jefe";
    	else if (this instanceof Autonomo)
    		tipo = "Es Autonomo";
    	
    	return null;
    }
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}