package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Select {
	public static void main(String args[]) {
		Connection conexion = null;
		try {
			// Class.forName("com.mysql.jdbc.Driver");

			conexion = DriverManager.getConnection("jdbc:mysql://localhost/Prueba", "root", "");
			if (conexion != null)
				System.out.println("Conectados");

			// Tiene que estar creada ya la conexi�n para crear sentencia

			Statement st = conexion.createStatement();

			// Comentado si ya existe la tabla con los datos
			// st.execute("create table datos(descripcion varchar(100), primary
			// key(descripcion))");

			st.executeUpdate("insert into datos values('Esto es una prueba 2')");

			ResultSet rs;

			rs = st.executeQuery("select * from datos");

			String misDatos;
			while (rs.next()) {
				// misDatos=rs.getString(1);
				misDatos = rs.getString("descripcion");
				System.out.println("Le�do " + misDatos);
			}

		} /*
			 * catch(ClassNotFoundException e) { System.out.println(e); }
			 */ catch (SQLException e) {
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