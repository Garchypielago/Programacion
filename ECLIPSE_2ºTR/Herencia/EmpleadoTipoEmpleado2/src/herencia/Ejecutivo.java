package herencia;

public class Ejecutivo extends Empleado {
 protected int presupuesto;
 
 public Ejecutivo() {}
 
 public Ejecutivo (String n, int s, int p) {
     super(n,s);
     presupuesto=p;
 }
 
 void asignarPresupuesto(int p) {
     presupuesto = p;
 }

 public String tipoEmpleado() {
		return " Es ejecutivo";
	}
 
 public String toString() {

     return super.toString() + "\n" +" Presupuesto: " + presupuesto;

 }
}