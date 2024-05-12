package america;

import java.sql.*;

public class America {
	  public static void main(String[] args) {
		  Connection conexion = null;
		  
		  conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
     
          AccesoDatos.borrarPersonasPaises(conexion);
          
//          AccesoDatos.crearPersonasPaises(conexion); // aqui creamos la tabla con un select
          
          AccesoDatos.crearTablaPersonasPaises(conexion); // Primero creamos la tabla y abajo insertamos las filas
          AccesoDatos.insertarPersonasPaises(conexion);
          
          System.out.println("\nTabla PersonasPaises\n");
          
          AccesoDatos.imprimirPersonasPaises(conexion);
          
          AccesoDatos.actualizarPersonasPaises(conexion, "Costa Rica");
          
          System.out.println("\nTabla actualizada\n");
          
          AccesoDatos.imprimirPersonasPaises(conexion);
          
   	   	  Conexion.desConexion(conexion);			   			   			     
	
	   }
   
  }
