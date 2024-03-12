<<<<<<< HEAD
package ejercicios;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		int crono2, cronos, cronom, cronoh, seg = 1, min = 0, hora = 0;
		String crono1;

		Scanner sc = new Scanner(System.in);
		System.out.println("De cuanto tiempo quieres tu cronómetro (xx:xx:xx)");

		crono1 = sc.nextLine();

		cronoh = Integer.parseInt(crono1.substring(0, 2));
		cronom = Integer.parseInt(crono1.substring(3, 5));
		cronos = Integer.parseInt(crono1.substring(6));

		crono2 = cronoh * 3600 + cronom * 60 + cronos;

		while (cronoh != hora || cronom != min || cronos != seg) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			if (seg == 60) {
				min++;
				seg = 0;
			}
			if (min == 60) {
				hora++;
				min = 0;
			}
			seg++;
			System.out.println(hora + ":" + min + ":" + seg);
		}
		sc.close();
	}
}
=======
package ejercicios;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		int crono2, cronos, cronom, cronoh, seg = 1, min = 0, hora = 0;
		String crono1;

		Scanner sc = new Scanner(System.in);
		System.out.println("De cuanto tiempo quieres tu cronómetro (xx:xx:xx)");

		crono1 = sc.nextLine();

		cronoh = Integer.parseInt(crono1.substring(0, 2));
		cronom = Integer.parseInt(crono1.substring(3, 5));
		cronos = Integer.parseInt(crono1.substring(6));

		crono2 = cronoh * 3600 + cronom * 60 + cronos;

		while (cronoh != hora || cronom != min || cronos != seg) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			if (seg == 60) {
				min++;
				seg = 0;
			}
			if (min == 60) {
				hora++;
				min = 0;
			}
			seg++;
			System.out.println(hora + ":" + min + ":" + seg);
		}
		sc.close();
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
