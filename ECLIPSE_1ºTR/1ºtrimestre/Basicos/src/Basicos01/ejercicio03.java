package Basicos01;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		int d1, m1, a1, d2, m2, a2, fecha2, diames=0, mesyear, mesbisiesto = 0;
		String fecha1;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Escribe la fecha en formato xx/xx/xxxx");

			fecha1 = sc.nextLine();

			d1 = Integer.parseInt(fecha1.substring(0, 2));
			m1 = Integer.parseInt(fecha1.substring(3, 5));
			a1 = Integer.parseInt(fecha1.substring(6));

			mesbisiesto = bisiesto(a1, mesbisiesto);

			diames = diames(m1, mesbisiesto, diames);

		} while (d1 > diames && m1 > 12);

		m2 = m1;
		d2 = d1 + 1;
		a2 = a1;
		
		if (d2 > diames) {
			m2++;
			d2 = 1;
		}
		if (m2 > 12) {
			a2++;
			m2= 1;
			d2=1;
		}
		
		System.out.println("Mañana será: " + d2 + "/" + m2 + "/" + a2);

		sc.close();

	}

	public static int bisiesto(int x, int y) {
		if (x % 4 == 0 && x % 100 != 0 || x % 100 == 0) {
			y = 29;
		} else {
			y = 28;
		}

		return y;
	}

	public static int diames(int x, int z, int y) {
		switch (x) {
		case 4:
		case 6:
		case 9:
		case 11:
			y = 30;
			break;
		case 2:
			y = z;
			break;
		default:
			y = 31;
			break;
		}
		
		return y;
	}
	
}
