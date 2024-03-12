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
}