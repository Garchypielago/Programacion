package tienda2;

import java.sql.Connection;
import java.util.ArrayList;

public class pruebas {

	final static String FICH_RESET = "reset.txt";
	final static String FICH = "productos.dat";
	final static String FICH_VEN = "vendidos.txt";
	static Tienda tienda= new Tienda();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		//1
		AccesoDatos.bbddFICH(conexion, FICH);
		
		//2
		tienda = AccesoDatos.FICHarray(conexion, FICH);
		
		//3 
		//aqui seria meter el menu
		tienda.leer();
		tienda.comprar(1, 2);
		tienda.leer();
		tienda.comprar(2, 6);
		
		//5
		tienda.leerTXT();
		
		//6
		AccesoDatos.arrayBBDD(conexion, tienda);
		
		//7
		AccesoDatos.bbddFICH(conexion, FICH);
		
		//8
		AccesoDatos.compararBBDDFICH(conexion, FICH);
		
		
		
		AccesoDatos.arrayBBDD(conexion, tienda);

		//AccesoDatos.resetearTienda(conexion, FICH_RESET);
		
		Conexion.desConexion(conexion);	
	}

}
