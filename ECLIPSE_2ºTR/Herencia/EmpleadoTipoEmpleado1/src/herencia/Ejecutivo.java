<<<<<<< HEAD
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

 public String toString() {

     return super.toString() + "\n" +" Presupuesto: " + presupuesto;

 }
=======
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

 public String toString() {

     return super.toString() + "\n" +" Presupuesto: " + presupuesto;

 }
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}