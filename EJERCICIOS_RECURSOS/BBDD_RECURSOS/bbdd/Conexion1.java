package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion1 {
	public static void main(String args[]) {
		try (Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"oracle");) {
			// DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			if (conexion != null)
				System.out.println("Conectados");

		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}