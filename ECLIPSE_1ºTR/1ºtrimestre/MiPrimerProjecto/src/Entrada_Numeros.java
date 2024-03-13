import javax.swing.*;

public class Entrada_Numeros {
    public static void main(String[] args){

        //double x=10000.0

        //System.out.printf("%1.2f", x/3)  //imprimir con formato, en esete caso dos decimales solo


        String num1=JOptionPane.showInputDialog("Introduce un número");

        double num2=Double.parseDouble(num1);

        System.out.print("La raiz de " + num2 + " es ");
    
        System.out.printf("%1.2f", Math.sqrt(num2));

    }
}
