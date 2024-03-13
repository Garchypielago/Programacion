//Clase Persona
package Estaticos01;

public class Persona1 {
    private String nombre;
    private int edad;
    public static int contadorPersonas=0;

    public Persona1() {}

    public Persona1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
