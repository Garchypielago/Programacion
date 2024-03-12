<<<<<<< HEAD
package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion1 {
	public static void main(String args[]) {
		// Se carga automáticamente la clase como driver a partir del jdk 7
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/Prueba", "root", "");
			if (conexion != null)
				System.out.println("Conectados");

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
=======
package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion1 {
	public static void main(String args[]) {
		// Se carga automáticamente la clase como driver a partir del jdk 7
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/Prueba", "root", "");
			if (conexion != null)
				System.out.println("Conectados");

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
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
