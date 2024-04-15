package nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;

public class _4_EjemploPath2 {
	public static void main(String args[]) {
		// Obtener con nio los distintos componentes de una carpeta o fichero
		//Path rutaDirectorio = FileSystems.getDefault().getPath("C:\\Usuarios\\Zeus\\NTUSER.DAT");
		Path rutaDirectorio = FileSystems.getDefault().getPath("C:\\Users\\Zeus\\Downloads\\sublime_text_build_4113_x64_setup.exe");
		Iterator<Path> it = rutaDirectorio.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getFileName());
		}
	}

}
