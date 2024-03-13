package clase;

import java.time.*;
import java.util.*;

public class Viernes06 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate primera, segunda, menor, mayor;
		int year, mes,dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escibe la primera fecha del intervalo");
		System.out.println("Primero el año");
		year=Integer.parseInt(sc.nextLine());
		System.out.println("Luego el mes");
		mes=Integer.parseInt(sc.nextLine());
		System.out.println("Por ultimo el dia");
		dia=Integer.parseInt(sc.nextLine());
		primera = LocalDate.of(year, mes, dia);
		
		System.out.println("Escibe la segunda fecha del intervalo");
		System.out.println("Primero el año");
		year=Integer.parseInt(sc.nextLine());
		System.out.println("Luego el mes");
		mes=Integer.parseInt(sc.nextLine());
		System.out.println("Por ultimo el dia");
		dia=Integer.parseInt(sc.nextLine());
		segunda = LocalDate.of(year, mes, dia);
		
		if (primera.isBefore(segunda)) {
			menor=primera;
			mayor=segunda;
		}else {
			menor=segunda;
			mayor=primera;
		}
		
		//aqui hacer que menor llegue a un viernes
		if(menor.getDayOfWeek().ordinal()!=5) {
			int dif;
			if(menor.getDayOfWeek().getValue()<5)
				dif = 5 - menor.getDayOfWeek().getValue();
			else
				dif = 12 - menor.getDayOfWeek().getValue() ;
			
			menor=menor.plusDays(dif);
		}
		
		int contador=0;
		for (; menor.isBefore(mayor);menor = menor.plusDays(7)) {
			if (menor.getDayOfMonth()==6) {
				contador++;
				System.out.println(menor);
			}
		}
		System.out.println("Total: "+contador);
		
		//este lo hace mal
		
		if (primera.isBefore(segunda)) {
			menor=primera;
			mayor=segunda;
		}else {
			menor=segunda;
			mayor=primera;
		}
		
		//aqui hacer que menor llegue a un viernes
		if(menor.getDayOfWeek().ordinal()!=5) {
			int dif;
			if(menor.getDayOfWeek().ordinal()<5)
				dif = 5 - menor.getDayOfWeek().ordinal();
			else
				dif = 12 - menor.getDayOfWeek().ordinal() ;
			
			menor=menor.plusDays(dif);
		}
		
		contador=0;
		for (; menor.isBefore(mayor);menor = menor.plusDays(7)) {
			if (menor.getDayOfMonth()==6) {
				contador++;
				System.out.println(menor);
			}
		}
		System.out.println("Total: "+contador);
		
		System.out.println(menor.getDayOfWeek().ordinal());
		System.out.println(menor.getDayOfWeek().getValue());
		System.out.println(DayOfWeek.FRIDAY);
		System.out.println(DayOfWeek.FRIDAY.ordinal());
		System.out.println(DayOfWeek.FRIDAY.getValue());
	}

}
