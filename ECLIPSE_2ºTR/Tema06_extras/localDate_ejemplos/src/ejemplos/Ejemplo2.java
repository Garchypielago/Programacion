package ejemplos;

import java.time.LocalDate;

public class Ejemplo2 {
	public static void main(String[] args) {
		LocalDate unaFecha1 = LocalDate.of(2017, 6, 23);
		System.out.println(unaFecha1.isLeapYear());
		LocalDate unaFecha2 = LocalDate.of(2012, 10, 20);
		System.out.println(unaFecha2.isLeapYear());
		LocalDate unaFecha3 = LocalDate.of(2000, 11, 14);
		System.out.println(unaFecha3.isLeapYear());
	}
}
