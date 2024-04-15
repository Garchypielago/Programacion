package tienda2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoDatos {

	/*
	 * crea BD
	 */
	public static void crearBD(Connection con) {
		// Nota: hacemos esto para tener presente que podemos perder la conexion, pero esta comprobacion
		// no es suficiente, puede no haber conexión y ser distinto de null
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
	}

	/*
	 * borrarTablaRegistro
	 */
	public static void borrarTablaRegistro(Connection con) {

	}

	/*
	 * crearTablaRegistro
	 */
	public static void crearTablaRegistro(Connection con) {

	}

	/*
	 * rellenarTablaRegistro, en esta versionse aniaden registros sueltos en el
	 * propio metodo
	 */
	public static void rellenarTablaRegistro(Connection con) {

	}

	/*
	 * leerRegistrados
	 */
	public static void leerRegistrados(Connection con) {

	}

	/*
	 * leerRegistradosPrepared
	 */
	public static void leerRegistradosPrepared(Connection con, String usuario) {

	}

	/*
	 * modificarRegistrado
	 */
	public static void modificarRegistrado(Connection con, String usuario, String nuevoCorreo) {

	}

	/*
	 * borrarRegistro
	 */
	public static void borrarRegistro(Connection con, String usuario) {

	}
	
	public static void resetearTienda(Connection con, String FICH_RESET) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pst = con.prepareStatement("delete from productos;");
				BufferedReader br = new BufferedReader(new FileReader(FICH_RESET))) {
			pst.executeUpdate();
			
			String frase;
			while ((frase = br.readLine()) != null) {
				pst.executeUpdate(frase);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
}
