package bbdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreacionTabla2 {
	public static void main(String args[]) {
		Connection conexion = null;

		try {
			String url = "jdbc:mysql://localhost/Prueba";
			// Class.forName("com.mysql.jdbc.Driver");

			conexion = DriverManager.getConnection(url, "root", "");

			if (conexion != null)
				System.out.println("Conectados");

			// Tiene que estar creada ya la conexión para crear sentencia

			// Si quiero iniciar todo desde el principio:
			Statement st = conexion.createStatement();
			st.execute("drop database prueba");
			st.execute("create database prueba");
			st.execute("use prueba");
			System.out.println("Base de datos creada y puesta como actual");
			st.execute("drop table if exists datos");
			st.execute("create table datos(descripcion varchar(100), primary key(descripcion))");
			System.out.println("Tabla creada");

		} catch (SQLException e) {
			System.out.println(e);
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
