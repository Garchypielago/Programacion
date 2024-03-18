package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insercion {
	public static void main(String args[]) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try (Connection conexion = DriverManager.getConnection(url, "prueba", "prueba");
				Statement st = conexion.createStatement()) {

			if (conexion != null)
				System.out.println("Conectados");

			// Tiene que estar creada ya la conexión para crear sentencia
			// Si no hubiera borrado la bd arriba, puedo borrar la tabla si existiera (en
			// mySQL)

			// Tenemos ya la tabla creada:

			int n = st.executeUpdate("insert into datos values('Esto es una prueba')");
			System.out.println("Devuelto el valor n " + n);

		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
