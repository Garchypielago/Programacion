package institutoPrepared;

import java.sql.*;

public class Instituto {
	public static final String NOTAS_FINALES = "NotasFinales", NOTAS = "Notas";

	public static void main(String[] args) {

		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		System.out.println("\n");

		AccesoDatos.borrarNotasFinales(conexion, NOTAS_FINALES);

		AccesoDatos.crearNotasFinales(conexion, NOTAS_FINALES);

//		AccesoDatos.rellenarNotasFinales1(conexion, NOTAS, NOTAS_FINALES);
		AccesoDatos.rellenarNotasFinales2(conexion, NOTAS, NOTAS_FINALES);

		System.out.println("\n");

		AccesoDatos.imprimirNotasFinales(conexion);

		System.out.println("\n");

		Conexion.desConexion(conexion);
	}

}