package empresa;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoMetaDatos {
	public static void verInfo(Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try {
			DatabaseMetaData d = con.getMetaData();
			System.out.println("Gestor: " + d.getDatabaseProductName());
			System.out.println("Usuario conectado: " + d.getUserName());
			System.out.println("Driver utilizado: " + d.getDriverVersion());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void infoTablas(String esquema, String tabla, Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try {
			ResultSet rs;
			DatabaseMetaData d = con.getMetaData();
			
			// rs = d.getColumns(con.getCatalog(), esquema, "%", null);// ignora tabla, lo hace para todas
			 rs = d.getColumns(con.getCatalog(), esquema, tabla, null);
			// ResultSet java.sql.DatabaseMetaData.getColumns(String catalog, String schemaPattern,
			// String tableNamePattern, String columnNamePattern) throws SQLException
			System.out.println("\nEsquema\tNombre\n");

			
			while (rs.next()) {
				System.out.println("Nombre: " + rs.getString(3) + "\tColumna: " + rs.getString(4) +
						"\tTamanio: " + rs.getString(7) + "\tTipo: "
						+ rs.getString(6) + "\tValores nulos: " + rs.getString(18));
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void infoConsulta(String consulta, Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try {
			System.out.println("\nObteniendo Informacion sobre una consulta con un ResultSet");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(consulta);
			ResultSetMetaData rsm = rs.getMetaData();
			int col = rsm.getColumnCount();
			System.out.println("Columnas: " + col);
			for (int i = 1; i <= col; i++) {
				System.out.println("Nombre de Columa: " + rsm.getColumnName(i));
				System.out.println("Tipo de Dato: " + rsm.getColumnTypeName(i));
				System.out.println("Pertenece a la tabla: " + rsm.getTableName(i) + "\n");
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
