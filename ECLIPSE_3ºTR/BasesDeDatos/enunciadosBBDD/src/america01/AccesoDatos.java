package america01;

import java.sql.Connection;
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
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("CREATE TABLE PersonasPaises ("
					+ " ID int(11) not null PRIMARY KEY,"
					+ " NOMBRE VARCHAR(15),"
					+ " APELLIDO VARCHAR(15),"
					+ " EDAD INT(4),"
					+ " PAIS VARCHAR(15),"
					+ " TAMANIO VARCHAR(15),"
					+ " FOREIGN KEY (ID)  REFERENCES PERSONAS (ID) ON DELETE CASCADE");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

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
}
