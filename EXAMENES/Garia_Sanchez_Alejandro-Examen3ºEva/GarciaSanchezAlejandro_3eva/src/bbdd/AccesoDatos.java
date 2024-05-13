package bbdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import ficheros.Citas_txt;
import objetos.Cita;

public class AccesoDatos {

	public static void crearBBDD() {
		Connection con = Conexion.conexion("jdbc:mysql://localhost/", ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pst = con.prepareStatement("create database if not exists CentroSalud;");) {
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.desConexion(con);
		}
	}

	public static void crearTabla() {
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		String create;

		create = "Create table if not exists citas(" + "idCita int(2) not null primary key, "
				+ "nifPaciente varchar(5) not null, " + "nifMedico varchar(3) not null, " + "numeroSala int(2) not null"
				+ ");";

		try (PreparedStatement pst = con.prepareStatement(create);) {
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.desConexion(con);
		}

	}

	public static void borrarTabla() {
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pst = con.prepareStatement("delete from citas;");) {
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.desConexion(con);
		}

	}
	
	public static void rellenarDesdeTXT() {
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		ArrayList<Cita> citas = Citas_txt.leerTXT();

		try (PreparedStatement pst = con.prepareStatement("Insert into citas values (?,?,?,?);")) {

			for (int i = 0; i < citas.size(); i++) {
				try {
					pst.setInt(1, citas.get(i).getIdCita());
					pst.setString(2, citas.get(i).getNifPacinete());
					pst.setString(3, citas.get(i).getNifMedico());
					pst.setInt(4, citas.get(i).getNumeroSala());
					
					pst.executeUpdate();
				} catch (SQLIntegrityConstraintViolationException SQLe) {
					System.out.println("Cita: " + citas.get(i).getIdCita() + " ya insertada.");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.desConexion(con);
		}

	}
	
	public static void mostrarBBDD() {
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pst = con.prepareStatement("Select * from citas;")) {
			ResultSet rs = pst.executeQuery();
			int idCita=0;
			String nifPaciente=null, nifMedico=null;
			int numeroSala=0;
			
			//poner una cabecera de impresion y formatear
			while(rs.next()) {
				idCita = rs.getInt(1);
				nifPaciente=rs.getString(2);
				nifMedico=rs.getString(3);
				numeroSala = rs.getInt(4);
				Cita c = new Cita(idCita,nifPaciente,nifMedico,numeroSala);
				//formatear la salida
				System.out.println(c.toString());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.desConexion(con);
		}
	}
	
	public static ArrayList<Cita> arrayCitas() {
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		ArrayList<Cita> citas = new ArrayList<Cita>();

		try (PreparedStatement pst = con.prepareStatement("Select * from citas;")) {
			ResultSet rs = pst.executeQuery();
			int idCita=0;
			String nifPaciente=null, nifMedico=null;
			int numeroSala=0;
			
			while(rs.next()) {
				idCita = rs.getInt(1);
				nifPaciente=rs.getString(2);
				nifMedico=rs.getString(3);
				numeroSala = rs.getInt(4);
				Cita c = new Cita(idCita,nifPaciente,nifMedico,numeroSala);
				//formatear la salida
				citas.add(c);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Conexion.desConexion(con);
		}
		return citas;
	}

}
