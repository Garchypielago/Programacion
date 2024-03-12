<<<<<<< HEAD
//Clase Principal
package Estaticos01;

public class Persona1App {

    public static void main(String[] args) {
        Persona1 p1 = new Persona1("Tomas Navarra", 22);
        Persona1.contadorPersonas++;
        
        Persona1 p2 = new Persona1("Jonas Estacio", 23);
        Persona1.contadorPersonas++;
        
        System.out.println("Se han creado: " + Persona1.contadorPersonas + " personas");
    }
=======
//Clase Principal
package Estaticos01;

public class Persona1App {

    public static void main(String[] args) {
        Persona1 p1 = new Persona1("Tomas Navarra", 22);
        Persona1.contadorPersonas++;
        
        Persona1 p2 = new Persona1("Jonas Estacio", 23);
        Persona1.contadorPersonas++;
        
        System.out.println("Se han creado: " + Persona1.contadorPersonas + " personas");
    }
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}