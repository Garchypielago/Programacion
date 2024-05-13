package ficheros;

import java.io.*;
import java.util.ArrayList;

import objetos.Cita;

public class Citas_txt {
	
	private static String FICH = "citas.txt";
	
	@SuppressWarnings("finally")
	public static ArrayList<Cita> leerTXT(){
		ArrayList<Cita> citas = new ArrayList<Cita>();
		
		try ( BufferedReader br = new BufferedReader(new FileReader(FICH))){
			Cita c;
			int idCita=0;
			String nifPaciente=null, nifMedico=null;
			int numeroSala=0;
			br.readLine(); //para que no pille la primera linea
			while(true) {
				String[] s = br.readLine().split(",");
				idCita = Integer.parseInt(s[0]);
				nifPaciente=s[1];
				nifMedico=s[2];
				numeroSala = Integer.parseInt(s[3]);
				
				c = new Cita(idCita,nifPaciente,nifMedico,numeroSala);
				citas.add(c);
			}
		} catch (EOFException e) {
		}catch (NullPointerException e) {
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return citas;
		}
	}

}
