package basicos;
// Este ejercicio es para ejecutarlo dos veces seguidas.
// La primera vez fallarian todas las operaciones menos la ultima,
//  que crearia el arbol de directorios. La segunda las
// dos primeras tendrian exito y las dos ultimas fallarian.
import java.io.File;

/**
 * 
 */
public class MkDirExamples {
  public static void main(String[] args) {
    boolean status;
    
    // mkdir no crea la estructura de directorios si no existe, hay que crearla
    status = new File("primero/segundo/tercero").mkdir();
    impError(status);
    
    status = new File("primero/segundo/cuarto").mkdir();
    impError(status);

    // mkdir no crea la estructura de directorios si no existe, hay que crearla
    status = new File("primero/segundo/quinto/sexto/septimo").mkdir();
    impError(status);
    
    // mkdirs crea la estructura de directorios aunque no exista
    status = new File("primero/segundo/quinto/sexto/septimo").mkdirs();
    impError(status);
  }

  static void impError(boolean b) {
    System.out.println(b ? "exito" : "fallo");
  }
}
