import javax.swing.*;

public class Entrada_ejemplo2 {
    public static void main(String[] args){

        String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor:");  //uso del panel simple

        String edad=JOptionPane.showInputDialog("Introduce tu edad, por favor:");

        int edad_usuario=Integer.parseInt(edad);  //cambio el String a int, de serie de carcateres a numero entero, para operar

        edad_usuario++;

        System.out.println("Hola " + nombre_usuario + " el año que viene tendrás " + (edad_usuario) + " años.");

    }
}
