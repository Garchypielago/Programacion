package empresa;

import java.sql.Connection;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		
		Conexion.desConexion(conexion);
	}

}
