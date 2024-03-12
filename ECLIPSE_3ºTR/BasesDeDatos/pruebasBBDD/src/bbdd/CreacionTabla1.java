package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreacionTabla1 {
	public static void main(String args[]) {
		Connection conexion = null;
		try {
			String url = "jdbc:mysql://localhost/Prueba";

			conexion = DriverManager.getConnection(url, "root", "");

			if (conexion != null)
				System.out.println("Conectados");

			// Tiene que estar creada ya la conexi�n para crear sentencia

			Statement st = conexion.createStatement();

			st.execute("create table datos(descripcion varchar(100), primary key(descripcion))");
			System.out.println("Tabla creada");

		} catch (SQLException e) {
			System.out.println(e + "Fallo al crear la tabla");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (conexion != null)
					conexion.close();
			} catch (Exception e) {
				System.out.println(e + " No se ha cerrado la BD");
			}

		}

	}

}
