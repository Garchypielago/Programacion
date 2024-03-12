package america01;

import java.sql.Connection;

import Instituto01.Conexion;
import Instituto01.ConstantesBD;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		
		AccesoDatos.borrarTablaRegistro(conexion);
		
		
		Conexion.desConexion(conexion);
		
	}

}
