package solucion1;
import java.util.Scanner;

public class CantantesApp {

    public static void main(String[] args) {

        String cantante, disco;
        ListaCantantes listaCantantes = new ListaCantantes();

        CantanteFamoso cantante1 = new CantanteFamoso("John Lennon", "Stand by me");
        CantanteFamoso cantante2 = new CantanteFamoso("Paul McCartney", "Let it be");
        listaCantantes.agregarCantanteFamoso(cantante1);
        listaCantantes.agregarCantanteFamoso(cantante2);

        System.out.println("La lista contiene los siguientes datos: ");
        listaCantantes.listarCantantes();
        String continuar;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce el nombre de un cantante: ");
            cantante = sc.nextLine();
            System.out.println("Introduce su disco más vendido: ");
            disco = sc.nextLine();
            listaCantantes.agregarCantanteFamoso(new CantanteFamoso(cantante, disco));
            
            System.out.println("¿Deseas agregar otro cantante y su disco (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        
        System.out.println("La lista contiene los siguientes datos: ");
        listaCantantes.listarCantantes();
        
        sc.close();
    }

}