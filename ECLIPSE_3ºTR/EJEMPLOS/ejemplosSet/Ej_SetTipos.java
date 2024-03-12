package ejemplos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ej_SetTipos {

    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<Integer>();
        conjunto1.add(20);
        conjunto1.add(10);
        conjunto1.add(1);
        conjunto1.add(5);
        conjunto1.add(3);
        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
        conjunto1.add(20);
        // La impresion no asegura un orden especifico
        System.out.println("\nHashSet:  La impresion no asegura un orden especifico\n ");
        for (int elemento : conjunto1)
            System.out.print(elemento + " - ");
        System.out.println();
        System.out.println(conjunto1);

        Set<Integer> conjunto2 = new TreeSet<Integer>();
        conjunto2.add(20);
        conjunto2.add(10);
        conjunto2.add(1);
        conjunto2.add(5);
        conjunto2.add(3);
        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
        conjunto2.add(20);
        // Los elementos se muestran de menor a mayor
        System.out.println("\nTreeSet:  Los elementos se muestran de menor a mayor\n ");
        for (int elemento : conjunto2)
            System.out.print(elemento + " - ");
        System.out.println();

        Set<Integer> conjunto3 = new LinkedHashSet<Integer>();
        conjunto3.add(20);
        conjunto3.add(10);
        conjunto3.add(1);
        conjunto3.add(5);
        conjunto3.add(3);
        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
        conjunto3.add(20);
        // Los elementos se muestran en el orden que se insertaron
        System.out.println("\nLinkedHashSet:  Los elementos se muestran en el orden que se insertaron\n ");
        for (int elemento : conjunto3)
            System.out.print(elemento + " - ");
        System.out.println();

    }
}