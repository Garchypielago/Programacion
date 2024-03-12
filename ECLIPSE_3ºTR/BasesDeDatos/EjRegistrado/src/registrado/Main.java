<<<<<<< HEAD
package registrado;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		System.out.println("\n");
		
		AccesoDatos.crearBD(conexion);

		AccesoDatos.borrarTablaRegistro(conexion);

		AccesoDatos.crearTablaRegistro(conexion);

		AccesoDatos.rellenarTablaRegistro(conexion);

		System.out.println("\nAccesoDatos.leerRegistrados\n");

		AccesoDatos.leerRegistrados(conexion);
		
		System.out.println("\nAccesoDatos.leerRegistradosPreparedConVuelta\n");

		AccesoDatos.leerRegistradosPreparedConVuelta(conexion);

		System.out.println("\nAccesoDatos.leerRegistradosPrepared buscando a Lola\n");

		AccesoDatos.leerRegistradosPrepared(conexion, "Lola");
		
		System.out.println("\nAccesoDatos.modificarRegistrados, cambia correo de Lola\n");

		AccesoDatos.modificarRegistrados(conexion, "Lola", "lola@nuevo.com");
		
		System.out.println("\nAccesoDatos.leerRegistrados\n");
		
		AccesoDatos.leerRegistrados(conexion);

		System.out.println("\nAccesoDatos.borrarRegistro\n");
		
		AccesoDatos.borrarRegistro(conexion, "Lola");
		
		AccesoDatos.leerRegistrados(conexion);

		System.out.println("\n");
		
		Conexion.desConexion(conexion);		
	}

}
=======
package registrado;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		System.out.println("\n");
		
		AccesoDatos.crearBD(conexion);

		AccesoDatos.borrarTablaRegistro(conexion);

		AccesoDatos.crearTablaRegistro(conexion);

		AccesoDatos.rellenarTablaRegistro(conexion);

		System.out.println("\nAccesoDatos.leerRegistrados\n");

		AccesoDatos.leerRegistrados(conexion);
		
		System.out.println("\nAccesoDatos.leerRegistradosPreparedConVuelta\n");

		AccesoDatos.leerRegistradosPreparedConVuelta(conexion);

		System.out.println("\nAccesoDatos.leerRegistradosPrepared buscando a Lola\n");

		AccesoDatos.leerRegistradosPrepared(conexion, "Lola");
		
		System.out.println("\nAccesoDatos.modificarRegistrados, cambia correo de Lola\n");

		AccesoDatos.modificarRegistrados(conexion, "Lola", "lola@nuevo.com");
		
		System.out.println("\nAccesoDatos.leerRegistrados\n");
		
		AccesoDatos.leerRegistrados(conexion);

		System.out.println("\nAccesoDatos.borrarRegistro\n");
		
		AccesoDatos.borrarRegistro(conexion, "Lola");
		
		AccesoDatos.leerRegistrados(conexion);

		System.out.println("\n");
		
		Conexion.desConexion(conexion);		
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
