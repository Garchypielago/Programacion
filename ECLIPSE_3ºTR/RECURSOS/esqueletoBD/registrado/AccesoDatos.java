<<<<<<< HEAD
package registrado;

import java.sql.Connection;

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
}
=======
package registrado;

import java.sql.Connection;

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
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
