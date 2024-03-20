package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreacionTabla {
	public static void main(String args[]) {
//Connection conexion=null;
//Statement st = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// Hacer create user prueba pwd prueba
		// create user prueba identified by prueba;
		// grant all privileges to prueba;
		// select table_name from user_tables order by table_name;
		try (Connection conexion = DriverManager.getConnection(url, "prueba", "prueba");
				Statement st = conexion.createStatement()) {
			// Ahora lo hacemos con un try con recursos

			// if (conexion != null) System.out.println("Conectados"); Ya no hace falta if
			// null
			System.out.println("Conectados");
			// Tiene que estar creada ya la conexión para crear sentencia

			// Si quiero iniciar todo desde el principio:

			//st.execute("drop table if exists datos"); no válido en oracle
			st.execute("create table datos(descripcion varchar(100), primary key(descripcion))");

		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
