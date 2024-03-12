package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion2 {
	public static void main(String args[]) {
		Connection conexion = null;
		try {
			// Cargamos la clase como driver
			// Se carga manualmente la clase como driver antes del jdk 7
			// Class.forName("com.mysql.jdbc.Driver").newInstance();
			// Class.forName("com.mysql.jdbc.Driver");

			

			// Esto no funcionaba en 2019-20
			// conexion=DriverManager.getConnection
			// ("jdbc:mysql://localhost/Prueba","root","");

			conexion = DriverManager.getConnection("jdbc:mysql://localhost/Prueba?useUnicode=true&use"
					+ "JDBCCompliantTimezoneShift&useLegacyDatetimeCode=false&ServerTimezone=UTC", "root", "");

			if (conexion != null)
				System.out.println("Conectados");

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
