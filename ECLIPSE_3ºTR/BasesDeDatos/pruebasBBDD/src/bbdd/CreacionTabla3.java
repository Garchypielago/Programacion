package bbdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreacionTabla3 {
	public static void main(String args[]) {

		String url = "jdbc:mysql://localhost/Prueba";

		// Ahora lo hacemos con un try con recursos, se cierra al terminar sola la BD
		try (Connection conexion = DriverManager.getConnection(url, "root", "");	//try con recursos
				Statement st = conexion.createStatement();) {	//se puden poner objetos autocerrables

			System.out.println("Conectados");

			// Si quiero iniciar todo desde el principio:

			st.execute("drop database prueba");// Habr�a que hacer varios try..catch si queremos distinguir mensajes
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
		}
	}

}
