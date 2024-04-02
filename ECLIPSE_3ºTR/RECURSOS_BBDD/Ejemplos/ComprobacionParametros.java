package prueba;
import java.sql.*;

/**
 * 
 * @author Esther ALonso
 * 
 * En esta clase vamos a comprobar cuales son los parametros que admite nuestro driver
 *
 */
public class ComprobacionParametros {

	public static void main(java.lang.String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost", "root", "")) {

			DatabaseMetaData metadata = connection.getMetaData();

			System.out.println("Chequeamos las diferentes formas del primer parametro de ResulSet ");

			if (! metadata.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				System.out.println("La base de datos no admite TYPE_SCROLL_SENSITIVE.");
			}
			
			if (!metadata.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				System.out.println("La base de datos no admite TYPE_SCROLL_INSENSITIVE.");
			}

			if (!metadata.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				System.out.println("La base de datos no admite TYPE_FORWARD_ONLY.");
			}
			
			System.out.println("Chequeamos las diferentes formas de las combinaciones con actualizable ");
					
			if (!metadata.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)) {
				System.out.println("La base de datos no admite TYPE_FORWARD_ONLY y CONCUR_READ_ONLY.");
			}
			if (!metadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
				System.out.println("La base de datos no admite TYPE_SCROLL_INSENSITIVE y CONCUR_READ_ONLY.");
			}
			if (!metadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
				System.out.println("La base de datos no admite TYPE_SCROLL_SENSITIVE y CONCUR_READ_ONLY.");
			}
			if (!metadata.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
				System.out.println("La base de datos no admite TYPE_FORWARD_ONLY y CONCUR_UPDATABLE.");
			}
			if (!metadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
				System.out.println("La base de datos no admite TYPE_SCROLL_INSENSITIVE y CONCUR_UPDATABLE.");
			}
			if (!metadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
				System.out.println("La base de datos no admite TYPE_SCROLL_SENSITIVE y CONCUR_UPDATABLE.");
			}		
			
		} catch (SQLException e) {
			e.printStackTrace();

		}


	}
}
