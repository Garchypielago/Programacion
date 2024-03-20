package bbdd;

import java.sql.*;

class Prueba {
	public static void main(String args[]) throws SQLException {

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		/*
		 * Connection conn = DriverManager.getConnection
		 * ("jdbc:oracle:thin:@localhost:1521:orcl", "system", "oracle");
		 * si no es la versión express, ponemos orcl, que es el nombre de la instancia
		 */
		// ("jdbc:oracle:thin:@localhost:1521:oracleBD", "system", "oracle");
		// driver@machineName:port: SID, userid, password

		Statement stmt = conn.createStatement();

		ResultSet rset = stmt.executeQuery("select * from dba_users");

		while (rset.next())
			System.out.println("USERS " + rset.getString(1));

		stmt.close();

	}
}