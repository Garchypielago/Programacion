package ordenPersonas;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> milista= new ArrayList<Persona>();
        milista.add(new Persona("Miguel"));
        milista.add(new Persona("Alicia"));
        milista.add(new Persona("Carmen"));
        milista.add(new Persona("Zenobia"));
        /*
        Collections.sort(milista,new Comparator<Persona>() {
            public int compare(Persona p1,Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        */
        // Una expresion lambda se compone de dos elementos. En primer lugar de un conjunto de parametros
        // y en segundo lugar de una expresion que opera con los parametros indicados

        Collections.sort(milista, (Persona p1,Persona p2)-> p1.getNombre().compareTo(p2.getNombre()));

        for (Persona p: milista) {
            System.out.println(p.getNombre());
        }
    }
}
