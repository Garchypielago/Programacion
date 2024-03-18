package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Select {
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

			ResultSet rs;

			rs = st.executeQuery("select * from datos");

			String misDatos;
			while (rs.next()) {
				// misDatos=rs.getString(1);
				misDatos = rs.getString("descripcion");
				System.out.println("Leído " + misDatos);
			}

		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}