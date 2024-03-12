//Clase Principal
package Estaticos01;

public class Persona3App {

    public static void main(String[] args) {
        Persona3 p1 = new Persona3("Tomas Navarra", 22);
        Persona3 p2 = new Persona3("Jonas Estacio", 23);
        System.out.println("Se han creado: " + Persona3.getContadorPersonas() + " personas");
    }
}