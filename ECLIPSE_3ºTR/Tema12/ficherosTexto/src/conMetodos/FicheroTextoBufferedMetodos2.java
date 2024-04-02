package conMetodos;

import java.io.*; //Importamos todas las clases de java.io.
import java.util.*;

public class FicheroTextoBufferedMetodos2 {
	
	    public static void main(String[] args) {
	    	BufferedReader br=null;
	    	BufferedWriter bw=null;
	    	Scanner sc = new Scanner(System.in);
	    	final String FICH = "fichero.txt";
	    	
	        try{       	
	            bw=new BufferedWriter(new FileWriter(FICH));

	            //Escribimos en el fichero
	            escribeFichero(bw, sc);
	            
	            //Guardamos los cambios del fichero
	            bw.flush();
	            
	            br=new BufferedReader(new FileReader(FICH));
	            
	            //Leemos el fichero y lo mostramos por pantalla
	            leeFichero(br);
	        }catch(IOException e){
	            System.out.println("Error E/S: "+e);
	        }
	       finally{
	        	try{
	        		if (br != null) br.close();
	        		if (bw != null) bw.close();
	        		
	        	}
	        	catch(IOException e){
	                System.out.println("Error E/S: "+e);
	            }
	        }
	        
	        if (sc != null) sc.close();
	    }
	    
	    /**
	     * escribeFichero
	     * */	    
	    public static void escribeFichero(BufferedWriter bw, Scanner sc) throws IOException{
	        //Escribimos en el fichero
	    	String leido=null;
	    	System.out.println("Introduzca una línea (fin para terminar)");
	    	while (!(leido=sc.nextLine()).equalsIgnoreCase("fin")){
	    		bw.write(leido);
	    		bw.newLine();
	    		System.out.println("Introduzca una línea (fin para terminar)");
	    	}

	    }
	    
	    /**
	     * leeFichero
	     * */
	    public static void leeFichero(BufferedReader br) throws IOException{
	        //Leemos el fichero y lo mostramos por pantalla
	        String linea=br.readLine();
	        while(linea!=null){
	            System.out.println(linea);
	            linea=br.readLine();
	        }
	    }	    	
	    	    
}

