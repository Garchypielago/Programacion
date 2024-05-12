package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class _1_PathPaths {
	public static void main(String args[]) {
	// Path
	System.out.println("# info");
	Path relative = Paths.get("."); // carpeta actual, directorio de trabajo
	Path absolute = relative.toAbsolutePath().normalize();
	// normalize() elimina los elementos redundantes del path

	System.out.println("\nRelative:\n");
	System.out.printf("Relative: %s%n", relative);
	System.out.printf("getParent: %s%n", relative.getParent());
	System.out.printf("getFileName: %s%n", relative.getFileName());
	System.out.printf("getFileSystem: %s%n", relative.getFileSystem());
	
	System.out.println("Absolute:\n");
	System.out.printf("Absolute: %s%n", absolute);
	System.out.printf("Name count: %d%n", absolute.getNameCount());
	System.out.printf("Parent: %s%n", absolute.getParent());
	System.out.printf("Subpath(0, 2): %s%n", absolute.subpath(0, 2));
	System.out.printf("%n________________________________________%n");
	System.out.printf("Relative: %s%n", relative.getFileName());
	System.out.printf("Relative: %s%n", relative.getFileSystem());
	}
}
