//Clase Persona
package Estaticos01;

public class Persona3 {

    private String nombre;
    private int edad;
    private static int contadorPersonas;

    public Persona3() {
        contadorPersonas++;
    }

    public Persona3(String nombre, int edad) {
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

    public static int getContadorPersonas() {//Haciendo que sea static hago que se use con el nombre de la clase
        return contadorPersonas;
    }
}
