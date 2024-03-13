//Clase Persona
package Estaticos01;

public class Persona2 {

    private String nombre;
    private int edad;
    public static int contadorPersonas;

    public Persona2() {
        contadorPersonas++;
    }

    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorPersonas++;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int ed) {
        edad = ed;
    }

    public int getEdad() {
        return edad;
    }

}
