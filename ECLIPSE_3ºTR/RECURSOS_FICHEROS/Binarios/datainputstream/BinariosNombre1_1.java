package datainputstream;
import java.io.*;
 public class BinariosNombre1_1 {
	 public static void main(String args[]) {		   
		 String nombre;
		 double nota;
		 final String FICHERO = "notasNombres.dat";
		 
		 try (DataInputStream dis = new DataInputStream(new FileInputStream(FICHERO)))
		 {  			 			 
			 System.out.println("        Nombre   Nota\n");
			 try { 
				while (true) {    
					nombre = dis.readUTF();   
					nota = dis.readDouble();  
					//System.out.printf("%35d %5.1f \n", nm, nota); 
					System.out.println(String.format("%15s %5.1f", nombre, nota)); 
				}
			 } catch (EOFException ex) {
				//System.out.println("FINAL DE FICHERO " + ex.getMessage()); 
				//Este error no se muestra
			 } catch (IOException ex) {
				 System.out.println("Error: " + ex.getMessage());
			 } catch (Exception ex) {
				 System.out.println("Error: " + ex.getMessage());
			 } 
		 }
		 catch (IOException ex) {
			 System.out.println("Error: " + ex.getMessage());
		 } 
	 }
 }
