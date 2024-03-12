	/*Mostrar siempre texto blanco sobre fondo negro puede resultar muy aburrido. El texto
	que se muestra por pantalla se puede colorear; para ello es necesario insertar unas
	secuencias de caracteres - que indican el color con el que se quiere escribir - justo
	antes del propio texto2
	.
	Prueba el siguiente programa y no te preocupes si todavía no lo entiendes del todo,
	en el próximo capítulo se explican los diferentes tipos de datos que se pueden utilizar
	en Java, entre estos tipos está la cadena de caracteres o String.
	*/
package SalidaDeDatosPorLaPantalla;

public class ej1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String morado = "\033[35m";
		String blanco = "\033[37m";
		System.out.print(naranja + "mandarina" + verde + " hierba");
		System.out.print(naranja + " saltamontes" + rojo + " tomate");
		System.out.print(blanco + " sábanas" + azul + " cielo");
		System.out.print(morado + " nazareno" + azul + " mar");
	}

}
	/*Como puedes ver en los dos ejemplos que hemos mostrado, algunas líneas están
	ligeramente desplazadas hacia la derecha, es lo que se llama sangría o indentación.
	En programación es muy importante sangrar (indentar) bien porque da una idea de qué
	partes del código son las que contienen a otras. En este último ejemplo tenemos un
	programa que tiene unos comentarios al principio y luego la clase principal marcada
	por la línea public class Colores {. Dentro de la clase Colores está el main o bloque del
	programa principal que tiene sangría por estar dentro de la definición de la clase colores. 
	Como puedes ver en los dos ejemplos que hemos mostrado, algunas líneas están
	ligeramente desplazadas hacia la derecha, es lo que se llama sangría o indentación.
	En programación es muy importante sangrar (indentar) bien porque da una idea de qué
	partes del código son las que contienen a otras. En este último ejemplo tenemos un
	programa que tiene unos comentarios al principio y luego la clase principal marcada
	por la línea public class Colores {. Dentro de la clase Colores está el main o bloque del
	programa principal que tiene sangría por estar dentro de la definición de la clase
	 */