package conMetodos;

import java.io.*; //Importamos todas las clases de java.io.

public class FicheroTextoBuffered {
    public static void main(String[] args) {
    	final String FICH = "fichero.txt";
    	
    	BufferedReader br=null;
    	BufferedWriter bw=null;
    	
        try{       	
            bw=new BufferedWriter(new FileWriter(FICH));

            //Escribimos en el fichero
            bw.write("Esto es una prueba usando Buffered");
            bw.newLine();
            bw.write("Seguimos usando Buffered");
            
            //Guardamos los cambios del fichero independientemente de buffer
            bw.flush();
            
            br=new BufferedReader(new FileReader(FICH));
            
            //Leemos el fichero y lo mostramos por pantalla
            String linea=br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=br.readLine();
            }
            
            BufferedWriter bw2=new BufferedWriter(new FileWriter(FICH, true));
            //Escribimos en el fichero
            bw2.write("Segunda vez Buffered");
            bw2.newLine();
            bw2.write("Seguimos usando Buffered");
            bw2.close();
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
    }
}