package bbdd;

import java.io.EOFException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ficheros.Fichero;
import i_o.Vehiculo;

public class AccesoDatos {
	
	public static void volcarFich(Connection con) {
		try(PreparedStatement pst = con.prepareStatement("insert into coches values (?,?,?,?);")) {
			ArrayList<Vehiculo> lista = Fichero.sacarCoches();
			
			for (int i=0;i<lista.size();i++) {
				try {
				pst.setString(1, lista.get(i).getMatricula());
				pst.setString(2, lista.get(i).getMarca());
				pst.setString(3, lista.get(i).getModelo());
				pst.setInt(4, lista.get(i).getAnio());
				pst.executeUpdate();
				} catch (SQLException e) {
					System.out.println("Coche "+ lista.get(i).getMatricula() +" ya insertado");
				}
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void mostrarCoches(Connection con) {
		try(PreparedStatement pst = con.prepareStatement("select * from coches;")) {
			ResultSet rs = pst.getResultSet();
			rs = pst.executeQuery();
			Vehiculo coche;
			while (rs.next()) {
				coche = new Vehiculo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				System.out.println(coche.toString());
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
	}

}
