package bufferedReader;

import java.io.*;
public class EscribirFicheroLineas {
     
    public static void main(String[] args) {
    	final String NOMFICH="test.txt";
        try {
	        //FileWriter connection = new FileWriter(NOMFICH);
	        FileWriter connection = new FileWriter(NOMFICH, true);
	        PrintWriter file = new PrintWriter(connection);     
	        file.println("Hola"); 
	        file.println("Hola");
	        file.close(); 
	        writeAgain(NOMFICH);
        }
         
        catch (IOException e) {
            System.out.println("IOException");
        }
                
    }
          
    public static void writeAgain(String nomfich) throws IOException {
        FileWriter connection = new FileWriter(nomfich, true);
        BufferedWriter file = new BufferedWriter(connection);
        file.write("Adios");
        file.newLine();
        file.write("Adios");
        file.newLine();
        file.close();
    }
     
}

