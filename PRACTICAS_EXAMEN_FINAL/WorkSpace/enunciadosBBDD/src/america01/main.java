package america01;

import java.sql.Connection;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		
		AccesoDatos.borrarTablaRegistro(conexion);
		
		AccesoDatos.crearTablaRegistro(conexion);
		
		AccesoDatos.rellenarTablaRegistro(conexion);
		
		//AccesoDatos.borrarRegistros(conexion);
		
		AccesoDatos.sumarCostaRica(conexion);
		
		
		Conexion.desConexion(conexion);
		
	}

}
