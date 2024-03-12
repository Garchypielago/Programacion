package solucion1;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaCantantes {

    ArrayList<CantanteFamoso> cantantes;

    public ListaCantantes() {
        cantantes = new ArrayList<CantanteFamoso>();
    }

    public void agregarCantanteFamoso(CantanteFamoso Cantante) {
        cantantes.add(Cantante);
    }

    public void listarCantantes() {
        //CantanteFamoso cantante;
        Iterator<CantanteFamoso> itCantante = cantantes.iterator();
        while (itCantante.hasNext()) {
            //cantante = itCantante.next();          
            /*System.out.print("Cantante: " + cantante.getNombre());
            System.out.println("        Discos con mas ventas: " + cantante.getDiscoConMasVentas());*/
        	System.out.println(itCantante.next());
        }
    }

}