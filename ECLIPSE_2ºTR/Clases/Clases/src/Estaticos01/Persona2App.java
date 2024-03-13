//Clase Principal
package Estaticos01;

public class Persona2App {

    public static void main(String[] args) {
        Persona2 p1 = new Persona2("Tomas Navarra", 22);
        Persona2 p2 = new Persona2("Jonas Estacio", 23);
        
        System.out.println("Se han creado: " + Persona2.contadorPersonas + " personas");
    }
}