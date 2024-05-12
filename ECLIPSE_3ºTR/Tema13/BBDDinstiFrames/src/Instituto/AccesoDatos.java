package Instituto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;


public class AccesoDatos {

	/*
	 * crea BD
	 */
	public static void crearBD(Connection con) {
		// Nota: hacemos esto para tener presente que podemos perder la conexion, pero esta comprobacion
		// no es suficiente, puede no haber conexión y ser distinto de null
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
	}

	public static String stringInstituto() {
		String insti = "";
		
		try (Connection con= Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
				PreparedStatement pstmt = con.prepareStatement("select *\r\n"
				+ "from ALUMNOS al", ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE)) {

			ResultSet rs = pstmt.executeQuery();
			insti = ("    Matricula\tNombre\t\tPoblacion\tTelefono\n" );
			while (rs.next()) {
				insti = insti + ( rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3)+ "\t" + rs.getString(4) + "\n");
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return insti;
	}
	
	
	public static void borrarAlumno(String matricula) {
		String delete="delete from ALUMNOS where ALUMNOS.MAT = '"+ matricula+"'";
		try (Connection con= Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
				PreparedStatement borrar= con.prepareStatement(delete)){
			borrar.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void insertarAlumno(String matricula, String nombre, String poblacion, String telefono) {
		String insert= "insert into ALUMNOS values( '"+matricula+"', '"+nombre+"', '"+poblacion+"', '"+telefono+"')";
		try (Connection con= Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
				PreparedStatement insertar= con.prepareStatement(insert)){
			insertar.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void modificarNombre(String matricula, String nuevoNombre) {
		String update="update ALUMNOS a set a.APEL_NOM='"+nuevoNombre+"' where a.MAT = '"+matricula+"'";
		try (Connection con= Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
				PreparedStatement actualizar= con.prepareStatement(update)){
			actualizar.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void modificarPoblacion(String matricula, String poblacionNueva) {
		String update="update ALUMNOS a set a.POBLACION='"+poblacionNueva+"' where a.MAT = '"+matricula+"'";
		try (Connection con= Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
				PreparedStatement actualizar= con.prepareStatement(update)){
			actualizar.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void modificarTelefono(String matricula, String telefonoNuevo) {
		String update="update ALUMNOS a set a.TELEFONO='"+telefonoNuevo+"' where a.MAT = '"+matricula+"'";
		try (Connection con= Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
				PreparedStatement actualizar= con.prepareStatement(update)){
			actualizar.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
