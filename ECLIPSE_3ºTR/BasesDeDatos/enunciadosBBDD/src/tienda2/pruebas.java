package tienda2;

import java.sql.Connection;
import java.util.ArrayList;

public class pruebas {

	final static String FICH_RESET = "reset.txt";
	final static String FICH = "productos.dat";
	static Tienda tienda= new Tienda();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		tienda = AccesoDatos.guardarTienda(conexion);
		
		//tienda.leer();
		
		
		
		
		
		AccesoDatos.actualizarTienda(conexion, tienda);

		//AccesoDatos.resetearTienda(conexion, FICH_RESET);
		
		Conexion.desConexion(conexion);	
	}

}
