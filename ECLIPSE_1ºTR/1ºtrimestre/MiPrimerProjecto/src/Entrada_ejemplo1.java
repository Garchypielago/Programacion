import java.util.*;

public class Entrada_ejemplo1 {
    public static void main(String[] args){
       
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Itroduce tu nombre, por favor:");

            String nombre_usuario=entrada.nextLine();  //se usa nextLine para que devuelva un String, es decir una palabra

            System.out.println("Introduce edad, por favor:");

            int edad=entrada.nextInt();  //se usa nextInt para que devuelva un int, es decir un numero entero
            
            System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años.");
        }

    }

}