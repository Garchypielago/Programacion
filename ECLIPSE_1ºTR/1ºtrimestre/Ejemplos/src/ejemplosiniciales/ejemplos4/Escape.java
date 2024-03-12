package ejemplos4;


public class Escape {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       // TODO code application logic here

       //\n para dar un salto de linea
       System.out.println("Pagina:\n\nhttp://JavaSRC.wordpress.com");

       //\t para tabular
       System.out.println("Pagina:\thttp://JavaSRC.wordpress.com");

       //\\ para imprimir \
       System.out.println("Pagina:\\ http://JavaSRC.wordpress.com \\");

       //\" para imprimir "
       System.out.println("Pagina:\"http://JavaSRC.wordpress.com\"");

       //\' para imprimir '
       System.out.println("Pagina:\'http://JavaSRC.wordpress.com\'");

       //\r para un retorno de carro(Util solo en modo Administrador, elimina todo lo de la izquierda)
       System.out.println("Pagina:\rhttp://JavaSRC.wordpress.com");

       //\b para borrar un caracter de la izquierda(Util solo en modo Administrador)
       System.out.println("Pagina:\b\b\b\b http://JavaSRC.wordpress.com");
       
       // Las dos últimas las tenemos que probar ejecutando en consola
   }

}
