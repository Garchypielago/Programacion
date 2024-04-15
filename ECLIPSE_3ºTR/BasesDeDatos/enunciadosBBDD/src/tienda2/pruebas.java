package tienda2;

import java.sql.Connection;

public class pruebas {

	final static String FICH_RESET = "reset.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		
		
		AccesoDatos.resetearTienda(conexion, FICH_RESET);

		
		Conexion.desConexion(conexion);	
	}

}
