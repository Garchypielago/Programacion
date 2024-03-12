<<<<<<< HEAD
package ordenacion;
import java.util.ArrayList;
import java.util.Collections;

public class Programa {

    public static void main(String arg[]) {

        ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

        listaJugadores.add(new Jugador("Mario", 22, 187));

        listaJugadores.add(new Jugador("Pepe", 52, 173));

        listaJugadores.add(new Jugador("Manuel", 27, 158));
        
        listaJugadores.add(new Jugador("David", 25, 164));

        listaJugadores.add(new Jugador("Alberto", 80, 184));

        Collections.sort(listaJugadores);  // Ejemplo uso ordenaci�n natural

        System.out.println("Jugadores Ordenados por orden natural de nombre: \n"+listaJugadores);

      } 

}
=======
package ordenacion;
import java.util.ArrayList;
import java.util.Collections;

public class Programa {

    public static void main(String arg[]) {

        ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

        listaJugadores.add(new Jugador("Mario", 22, 187));

        listaJugadores.add(new Jugador("Pepe", 52, 173));

        listaJugadores.add(new Jugador("Manuel", 27, 158));
        
        listaJugadores.add(new Jugador("David", 25, 164));

        listaJugadores.add(new Jugador("Alberto", 80, 184));

        Collections.sort(listaJugadores);  // Ejemplo uso ordenaci�n natural

        System.out.println("Jugadores Ordenados por orden natural de nombre: \n"+listaJugadores);

      } 

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
