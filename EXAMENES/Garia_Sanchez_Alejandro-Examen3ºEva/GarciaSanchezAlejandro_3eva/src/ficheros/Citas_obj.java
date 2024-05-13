package ficheros;

import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import bbdd.AccesoDatos;
import objetos.Cita;
import recursos.MyOutputStream;

public class Citas_obj {
	
	private static String FICH = "citas.obj";
	private static String AUX = "citas_aux.obj";
	
	public static void escribirFichero() {
		File file = new File(FICH);
		try(MyOutputStream oos = new MyOutputStream(file)){
			ArrayList<Cita> citas = AccesoDatos.arrayCitas();
			Cita cita;
			for  (int i=0; i<citas.size();i++) {
				cita = citas.get(i);
				oos.writeObject(cita);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//terminar
	public static void mostrarFichero() {
		File file = new File(FICH);
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))){
			Cita c;
			while(true) {
				c = (Cita) ois.readObject();
				System.out.println(c);
			}
		}catch (EOFException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void OrdenarObj(TreeSet<Cita> citas) {
		File file = new File(FICH);
		File file2 = new File(AUX);
		
		try(MyOutputStream oos = new MyOutputStream(file2)){

			Cita c;
			for  (int i=0; i<citas.size();i++) {
				c =  (Cita)citas.toArray()[i];
				oos.writeObject(c);
			}
			
			if (file.exists()) {
				file.delete();
				file2.renameTo(file);
			}
			
		}catch (EOFException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static TreeSet<Cita> limpiarObj() {
		TreeSet<Cita> citas = new TreeSet<Cita>();
		File file = new File(FICH);
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))){
			Cita c;
			while(true) {
				c = (Cita) ois.readObject();
				citas.add(c);
			}
			
		} catch (EOFException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return citas;
		}
	}
	
	

}
