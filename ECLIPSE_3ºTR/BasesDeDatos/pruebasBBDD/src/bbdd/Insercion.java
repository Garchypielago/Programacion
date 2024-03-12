package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insercion {
	public static void main(String args[]) {
		Connection conexion = null;
		try {
			// Class.forName("com.mysql.jdbc.Driver");

			String conn = "jdbc:mysql://localhost/Prueba";

			conexion = DriverManager.getConnection(conn, "root", "");
			if (conexion != null)
				System.out.println("Conectados");

			Statement st = conexion.createStatement();

			// Tiene que estar creada ya la conexi�n para crear sentencia
			// Si no hubiera borrado la bd arriba, puedo borrar la tabla si existiera (en
			// mySQL)

//			st.execute("drop table if exists datos");
//
//			st.execute("create table datos(descripcion varchar(100), primary key(descripcion))");

			int n = st.executeUpdate("insert into datos values('Esto es una prueba0')");
			System.out.println("Devuelto el valor n " + n);

		} /*
			 * catch(ClassNotFoundException e) { System.out.println(e); }
			 */catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conexion != null)
				try {
					conexion.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
