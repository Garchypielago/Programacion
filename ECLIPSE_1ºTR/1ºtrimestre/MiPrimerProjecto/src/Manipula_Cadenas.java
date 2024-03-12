public class Manipula_Cadenas {
    public static void main(String[] args){

        String nombre="Alejandro";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");

        System.out.println("El nombre " + nombre + " empieza por " + nombre.charAt(0));

        int ultima_letra;

        ultima_letra=nombre.length();

        System.out.println("Y termina en " + nombre.charAt(ultima_letra-1));


    }
}
