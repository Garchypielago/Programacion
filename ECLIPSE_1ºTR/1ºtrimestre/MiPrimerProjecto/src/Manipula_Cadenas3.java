public class Manipula_Cadenas3 {
    public static void main(String[] args){

        String alumno1, alumno2;

        alumno1="David";

        alumno2="david";

        System.out.println(alumno1.equals(alumno2));  //al ser equals diferencia entre mayus y minus [equalsIgnoreCase no lo hace]

        System.out.println(alumno1.equalsIgnoreCase(alumno2));

    }
    
}
