package prueba;

import java.sql.*;

/**
 * 
 * @author Esther Alonso
 * 
 *         En esta clase vamos a probar métodos para saber datos de nuestra base
 *         de datos
 *
 */
public class PruebasMetaData {

	public static void main(java.lang.String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Instituto", "root", "")) {

			DatabaseMetaData metadata = connection.getMetaData();
			System.out.println("Gestor: " + metadata.getDatabaseProductName());
			System.out.println("Usuario conectado: " + metadata.getUserName());
			System.out.println("Driver utilizado: " + metadata.getDriverVersion());

			String[] tipos = { "TABLE" };
			// Asi pido info sobre todas las tablas, accedera segun los permisos del usuario
			// ResultSet resul = metadata.getTables(null, null, null, tipos);

			ResultSet resul = metadata.getTables(connection.getCatalog(), "instituto", null, tipos);

			while (resul.next()) {
				String nombreTabla = resul.getString("TABLE_NAME");
				System.out.println("Nombre de la tabla " + nombreTabla);
				ResultSet columnas = metadata.getColumns(null, null, nombreTabla, null);
				while (columnas.next()) {
					String nombreColumna = columnas.getString("COLUMN_NAME");
					int tipoDato = columnas.getInt("DATA_TYPE");
					String nombreTipo = columnas.getString("TYPE_NAME");
					System.out.println("COLUMN_NAME -> " + nombreColumna + " DATA_TYPE -> " + tipoDato + " TYPE_NAME -> " + nombreTipo);
//					if (tipoDato==java.sql.Types.CHAR ||
//						tipoDato==java.sql.Types.VARCHAR) {
//							String tamanyo = columnas.getString("COLUMN_SIZE");
//					}
//			    	String nulo = columnas.getString("IS_NULLABLE");
//					if (nulo.equalsIgnoreCase("no")) 
//						System.out.println("NOT NULL");
				}
				//Si pongo null en los 2 primeros parametros, se hace de todas las tablas
				ResultSet clavesPrimarias = metadata.getPrimaryKeys(connection.getCatalog(), "instituto", nombreTabla);
				while (clavesPrimarias.next()) {
					String nombreClave = clavesPrimarias.getString("COLUMN_NAME");
					System.out.println("nombre de la clave " + nombreClave);
				}
				System.out.println("**************************************");
			}
			resul.close();

			System.out.println("**********************************************");
			System.out.println("Vamos a analizar los elementos de una consulta");
			System.out.println("**********************************************");
			Statement stmt = connection.createStatement();
			resul = stmt.executeQuery("SELECT * FROM ALUMNOS");
			ResultSetMetaData rsmd = resul.getMetaData();
			int columnas = rsmd.getColumnCount();
			for (int i = 1; i <= columnas; i++) {
				System.out.println("Nombre tabla=" + rsmd.getTableName(i));
				System.out.println("Nombre columna=" + rsmd.getColumnName(i));
				System.out.println("Tipo de dato=" + rsmd.getColumnType(i)); // 12 es varchar
				System.out.println("Autoincremento=" + rsmd.isAutoIncrement(i));
				System.out.println("**************************************");
			}
			resul.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
