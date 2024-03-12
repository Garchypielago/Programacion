public class Variables {
    public static void main(String[] args) {

        byte edad;  //declaración e iniciación de variable en una única línea

        edad=35;

        System.out.println(edad);  //esta primera impresión es la basica sin modificación
        //imprime antes de las siguientes modificaciones, no tiene en cuenta el codigo de debajo

        int edad1=35;  //puedo usar el int para una mayor agilidad en la programacion

        edad1=75;

        System.out.println(edad1);  //en esta se sustituye el valor de la variable mas adelante

        edad1=100;

        System.out.println(edad1);  //en esta imprime teniendo en cuena la última modificación

    }
}