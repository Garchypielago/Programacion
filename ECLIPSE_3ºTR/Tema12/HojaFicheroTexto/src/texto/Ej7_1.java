package texto;
import java.io.*;

public class Ej7_1 {
	public static void main(String[] args){
		String nom;
		double sumNom=0, sumApel=0;
		int cont=0;
		BufferedReader br = null;
		final String FICHERO = "nombres.txt";
			
		try{
			br=new BufferedReader(new FileReader(FICHERO));	
			
			while((nom=br.readLine())!=null){
			  String nombApell[] = nom.split(" ");
			  sumNom=sumNom+nombApell[0].length();
			  sumApel=sumApel+nombApell[1].length();
			  System.out.println(nombApell[0]+" longitud "+nombApell[0].length());
			  System.out.println(nombApell[1]+" longitud "+nombApell[1].length());
			  cont++;
			}
			
			System.out.println("La longitud media de nombres es "+sumNom/cont);
			System.out.println("La longitud media de apellidos es "+sumApel/cont);
			
		 }catch(Exception e){
			 System.out.println("ERROR DE LECTURA " + e);
		 }finally {
			 try{
				 if (br != null) br.close();
			 }
			 catch(Exception e){
				 System.out.println(e.getMessage());
			 }
		 }		 		 	 
	 }
}

