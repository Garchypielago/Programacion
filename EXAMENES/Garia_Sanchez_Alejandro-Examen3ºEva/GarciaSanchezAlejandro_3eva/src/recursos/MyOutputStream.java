package recursos;

import java.io.*;

public class MyOutputStream extends ObjectOutputStream {
	
	public static boolean exists;

	//le paso el fichero y llamo a mi otro metodo
	public MyOutputStream(File f) throws IOException {
		super(crearFichero(f));
	}
	
	//verificos i esta pa las cabeceras
	public static FileOutputStream crearFichero(File f) throws FileNotFoundException{
		if (!f.exists() || f.length()==0)
			exists=true;
		else
			exists=false;
		return new FileOutputStream(f, true);
	}

	//su metodo porpio
	protected void writeStreamHeader() throws IOException {
		if (exists)
			super.writeStreamHeader();
	}
}