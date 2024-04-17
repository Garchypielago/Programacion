package recursividad;

import java.io.File;

public class VerDirectorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String DIREC = "c:\\directorioRecursivo";
		
		directorio(DIREC);

	}
	
	public static void directorio(String DIREC) {
		File f = new File(DIREC);
		System.out.println("------Entra en: " + DIREC);
		if (!f.exists()) {
			System.out.println("Directorio no existe");
		} else {
			File[] ficheros = f.listFiles();
			for(int x=0; x<ficheros.length;x++) {
				System.out.println(ficheros[x].getAbsolutePath());
				if(ficheros[x].isDirectory()) {
					directorio(ficheros[x].getAbsolutePath());
				}
			}
		}
		
		System.out.println("------Sale de: " + DIREC);
	}

}
