package ordenacion;
import java.util.Comparator;

public class OrdenarJugadorNombre implements Comparator<Jugador> {
    @Override
    public int compare(Jugador o1, Jugador o2) {
    return o1.getNombre().compareTo(o2.getNombre()); // Devuelve un entero positivo si el nombre de o1 es mayor 1ue el nombre de o2
    // As� ordenar�amos alfabeticamente
    
    }
}
