package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Borrado {
	public static void main(String args[]) {
		Connection conexion = null;
		try {
			String conn = "jdbc:mysql://localhost/Prueba";

			conexion = DriverManager.getConnection(conn, "root", "");
			if (conexion != null)
				System.out.println("Conectados");

			Statement st = conexion.createStatement();

			// Tiene que estar creada ya la conexión para crear sentencia
			// Si no hubiera borrado la bd arriba, puedo borrar la tabla si existiera (en
			// mySQL)

			int n = st.executeUpdate("delete from datos where descripcion like 'Esto es una prueba'");
			System.out.println("Devuelto el valor n " + n);

		} catch (SQLException e) {
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
