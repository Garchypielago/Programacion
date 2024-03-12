package ejemplos;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ejemplo4 {
	public static void main(String[] args) {
		// Escribimos el patrón con el que queremos convertir la cadena a fecha
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		// Cadena que queremos convertir a fecha
		String stringDate = "2023/10/23";
// Convertimos la cadena al formato fecha deseado
		LocalDate date = LocalDate.parse(stringDate, formatter);
// Si lo mostramos asi, lo muestra en el formato por defecto
		System.out.println("Local Date: " + date);
// Asi lo mostrara en el formato que indicamos en DateTimeFormatter
		System.out.println("Local Date in the given format: " + formatter.format(date));
		
		
		//horas
		LocalDateTime atTime = LocalDate.now().atStartOfDay();
		System.out.println("Local Date Time atTime: " + atTime);
		
		atTime = LocalDate.now().atTime(10, 45, 50);
		System.out.println("Local Date Time atTime: " + atTime);
		
		LocalDateTime atTimeCom = LocalDate.now().atTime(10, 50, 50);
		System.out.println(atTime.compareTo(atTimeCom));
		atTimeCom = LocalDate.now().atTime(10, 45, 50);
		System.out.println(atTime.compareTo(atTimeCom));
		atTimeCom = LocalDate.now().atTime(10, 40, 50);
		System.out.println(atTime.compareTo(atTimeCom));
		
		atTimeCom = LocalDate.now().atTime(10, 50, 50);
		System.out.println(atTime.equals(atTimeCom));
		atTimeCom = LocalDate.now().atTime(10, 45, 50);
		System.out.println(atTime.equals(atTimeCom));
		atTimeCom = LocalDate.now().atTime(10, 40, 50);
		System.out.println(atTime.equals(atTimeCom));
		
		
		
	}
}
