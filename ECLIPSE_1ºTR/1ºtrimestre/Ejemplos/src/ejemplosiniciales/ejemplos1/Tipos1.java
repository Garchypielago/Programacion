package ejemplos1;

public class Tipos1 {
    public static void main(String[] args) {
        byte b1 = 4;
        byte b2 = 3;
        
        byte suma =  (byte) (b1 + b2);
        byte resta =  (byte) (b1 - b2);
        byte division =  (byte) (b1/b2);
        byte multiplicacion = (byte) (b1*b2);
      
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Division: " + division);
        System.out.println("Multiplicacion: " + multiplicacion);
    }
}
