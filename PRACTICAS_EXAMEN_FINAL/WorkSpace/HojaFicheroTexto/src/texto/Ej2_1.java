package texto;
import java.io.*;

public class Ej2_1 {
 public static void main(String[] args){
	 char ct;
	 int c;
	 FileReader fr = null;
	 FileWriter fw = null;
	 BufferedReader br = null;
	 final String FICHERO1 = "parrafo.txt", FICHERO2 = "parrafo1.txt";
	 
	 try {
		//Abro fichero para lectura
		fr=new FileReader(FICHERO1);
		
		//Creo fichero para escritura
		fw=new FileWriter(FICHERO2);
		
		// Leo primer caracter del fichero
		c=fr.read();
		while(c != -1){ // Devuelve -1 si no hay mas caracteres
			ct =(char)c;
			if((ct!='a') && (ct!='e') && (ct!='i') && (ct!='o') && (ct!='u'))
			  fw.write(ct);
			c=fr.read(); // Leo el resto de caracteres del fichero
		}		
	 } catch(Exception e){
		 System.out.println("ERROR DE LECTURA " + e);
	 }
	 finally {
		 try{
			 if (fr != null) fr.close();
			 if (fw != null) fw.close();
		 }
		 catch(IOException e){
			 System.out.println(e.getMessage());
		 }
	 }
	
	 // Ahora leemos y mostramos el nuevo fichero creado linea a linea (como no hay metodos, solo muestro el nuevo)
	 
	 String frase;
	 try{
		fr=new FileReader(FICHERO2);
		br=new BufferedReader(fr); 
		// Se puede hacer de una vez
		// BufferedReader br=new BufferedReader(new FileReader("parrafo1.txt")); 
		frase=br.readLine();
		while(frase!=null){
		  System.out.println(frase);
		  frase=br.readLine();
		}
		
	 }catch(IOException e){
		 System.out.println("ERROR DE LECTURA " + e);
	 }
	 finally {
		 try{
			 if (fr != null) fr.close();
			 if (br != null) br.close();
		 }
		 catch(Exception e){
			 System.out.println(e.getMessage());
		 }
	 }
 }
}