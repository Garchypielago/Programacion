<<<<<<< HEAD
package ordenacion;
public class Jugador {
	public String nombre;
    public int edad, altura;

    public Jugador(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "\n Jugador->  Nombre: "+nombre+ " Edad: " + edad + " Altura: " +altura+ "\n";}

    public int getEdad() {return edad;}
    public String getNombre() {return nombre;}
    public int getAltura() {return altura;}
}
=======
package ordenacion;
public class Jugador {
	public String nombre;
    public int edad, altura;

    public Jugador(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "\n Jugador->  Nombre: "+nombre+ " Edad: " + edad + " Altura: " +altura+ "\n";}

    public int getEdad() {return edad;}
    public String getNombre() {return nombre;}
    public int getAltura() {return altura;}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
