package tienda2;

import java.io.*;

public class MyOutputStream extends ObjectOutputStream {
	
	public static boolean exists;

	public MyOutputStream(File f) throws IOException {
		super(crearFichero(f));
	}
	
	public static FileOutputStream crearFichero(File f) throws FileNotFoundException{
		if (!f.exists() || f.length()==0)
			exists=true;
		else
			exists=false;
		return new FileOutputStream(f, true);
	}

	protected void writeStreamHeader() throws IOException {
		if (!exists)
			super.writeStreamHeader();
	}
}