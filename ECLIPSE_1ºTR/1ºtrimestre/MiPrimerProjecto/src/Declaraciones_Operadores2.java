public class Declaraciones_Operadores2 {
    public static void main(String[] args) {

        final double apulgadas=2.54;  //asi se convierte en constante (final)

        double cm=6;

        double resultado=cm/apulgadas;

        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");  //asi se hace para imprimir texto y operacion

        int operador1, operador2, igual;  //se pueden declarar varios terminos en una linea

        operador1=8;

        operador2=7;

        igual=operador1+operador2;

        System.out.println(igual);

    }
}