<<<<<<< HEAD
package ejercicios_Basicos;

public class AA_Pruebas {

	public static void main(String[] args) {
		
		//ej01
		System.out.println("------------EJ01------------");
		
		Persona yo = new Persona("Alejandro", "Garcia", "Sanchez", "53824239F", 18, true);
		
		System.out.println(yo.getNombreCompleto()+".");

		yo.DatosPersonales();
		
		System.out.println("-----Modificar datos-----");
		yo.setEdad(22);
		yo.setCasado(false);
		
		System.out.println(yo.getNombreCompleto()+".");
		yo.DatosPersonales();
		
		System.out.println("-----Mostrar persona-----");
		yo.mostrarPersona();
		
		System.out.println();
		System.out.println(yo); // hacen lo mismo pero por que he definido el toString en la clase persona
		System.out.println(yo.toString()); //lo mismo que lo de arriba
		
		
		System.out.println();
		//ej02 DiscoMusical
		System.out.println("------------EJ02------------");
		
		DiscoMusical DM= new DiscoMusical("Personal Jesus", "autor", "formato", 10, true);
		
		System.out.println(DM.getTitulo());
		
		System.out.println();
		//ej03 Profesor
		System.out.println("------------EJ03------------");
		
		Profesor Mates= new Profesor("Alejandro", "Garcia", "Sanchez", 22, false, true);
		
		System.out.println(Mates);
		
		System.out.println();
		//ej04 Medico
		System.out.println("------------EJ04------------");
		
		Medico Cabecera=new Medico("Alejandro", "Garcia", "Sanchez", 18, false, "53824239F", "Psicologia");
		
		Cabecera.setEdad(22);
		System.out.println(Cabecera.getEdad());
		
		System.out.println();
		//ej05 calculoParaMultiploEdad
		System.out.println("------------EJ05------------");
		
		Cabecera.calculoParaMultiploEdad();
		
		System.out.println();
		//ej06 rueda
		System.out.println("------------EJ06------------");
		
		Rueda Coche= new Rueda("Todoterreno", "Campo", 0.35, 1.5);
		
		Coche.comprobarDimensiones();
		
		Coche.setGrosor(0.42);
		System.out.println();
		Coche.comprobarDimensiones();
		
		System.out.println();
		//ej07 motor
		System.out.println("------------EJ07------------");
		
		Motor Agua=new Motor(1, "", "gasolina");
		
		System.out.println(Agua);
		Agua.dimeTipoMotor();
		System.out.println(Agua);
		
		System.out.println();
		//ej08 motoresparaagua
		System.out.println("------------EJ08------------");
		
		Motor Gasolina=new Motor(2,"","gasolina");
		
		System.out.println(Agua.dimeSiMotorEsparaAgua());
		System.out.println(Gasolina.dimeSiMotorEsparaAgua());
	}

}
=======
package ejercicios_Basicos;

public class AA_Pruebas {

	public static void main(String[] args) {
		
		//ej01
		System.out.println("------------EJ01------------");
		
		Persona yo = new Persona("Alejandro", "Garcia", "Sanchez", "53824239F", 18, true);
		
		System.out.println(yo.getNombreCompleto()+".");

		yo.DatosPersonales();
		
		System.out.println("-----Modificar datos-----");
		yo.setEdad(22);
		yo.setCasado(false);
		
		System.out.println(yo.getNombreCompleto()+".");
		yo.DatosPersonales();
		
		System.out.println("-----Mostrar persona-----");
		yo.mostrarPersona();
		
		System.out.println();
		System.out.println(yo); // hacen lo mismo pero por que he definido el toString en la clase persona
		System.out.println(yo.toString()); //lo mismo que lo de arriba
		
		
		System.out.println();
		//ej02 DiscoMusical
		System.out.println("------------EJ02------------");
		
		DiscoMusical DM= new DiscoMusical("Personal Jesus", "autor", "formato", 10, true);
		
		System.out.println(DM.getTitulo());
		
		System.out.println();
		//ej03 Profesor
		System.out.println("------------EJ03------------");
		
		Profesor Mates= new Profesor("Alejandro", "Garcia", "Sanchez", 22, false, true);
		
		System.out.println(Mates);
		
		System.out.println();
		//ej04 Medico
		System.out.println("------------EJ04------------");
		
		Medico Cabecera=new Medico("Alejandro", "Garcia", "Sanchez", 18, false, "53824239F", "Psicologia");
		
		Cabecera.setEdad(22);
		System.out.println(Cabecera.getEdad());
		
		System.out.println();
		//ej05 calculoParaMultiploEdad
		System.out.println("------------EJ05------------");
		
		Cabecera.calculoParaMultiploEdad();
		
		System.out.println();
		//ej06 rueda
		System.out.println("------------EJ06------------");
		
		Rueda Coche= new Rueda("Todoterreno", "Campo", 0.35, 1.5);
		
		Coche.comprobarDimensiones();
		
		Coche.setGrosor(0.42);
		System.out.println();
		Coche.comprobarDimensiones();
		
		System.out.println();
		//ej07 motor
		System.out.println("------------EJ07------------");
		
		Motor Agua=new Motor(1, "", "gasolina");
		
		System.out.println(Agua);
		Agua.dimeTipoMotor();
		System.out.println(Agua);
		
		System.out.println();
		//ej08 motoresparaagua
		System.out.println("------------EJ08------------");
		
		Motor Gasolina=new Motor(2,"","gasolina");
		
		System.out.println(Agua.dimeSiMotorEsparaAgua());
		System.out.println(Gasolina.dimeSiMotorEsparaAgua());
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
