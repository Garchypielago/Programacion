package serializablesTransient;

import java.io.*;
public class PruebaCliente{
    public static void main(String[] args) {
    	final String FICHERO = "cliente.obj";
	   Cliente cliente=new Cliente("Pepe", "3001284");
	   try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO));
			oos.writeObject(cliente); 
			oos.close(); 

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO));
			cliente=(Cliente)ois.readObject();
			cliente.Escribir();
			System.out.println(cliente);
			ois.close();
	
	   }catch (IOException ex) {  
			System.out.println(ex); 
	   }catch (ClassNotFoundException ex) {
			System.out.println(ex);
	   } 
    }
} 