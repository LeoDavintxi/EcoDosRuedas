package model;

import java.sql.*;
import javax.swing.JOptionPane;
import controller.*;

public class Bicicleta extends Vehiculo{

	private int anio;
	private Conectar conexion;
	private String cadenaSQL;

	public Bicicleta(int idVehiculo, String nombreFabricante, int precio, int anio) {
		super(idVehiculo, nombreFabricante, precio);
		this.anio = anio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void guardarBicicleta(){
		try {
			//CONSULTA VALOR ID
			ResultSet tabla = null;
			cadenaSQL = "SELECT MAX(id_vehiculo) FROM vehiculo";
			conexion = new Conectar();
			tabla = conexion.ConsultarSql(cadenaSQL);
			if(tabla.next()) {
				setIdVehiculo(tabla.getInt(1)+1);
			}
			tabla.close();
			conexion.cerrarbase();
			
			//SE INGRESA EL VEHICULO
			conexion = new Conectar();
			cadenaSQL = "INSERT INTO VEHICULO (PRECIO_UNITARIO,NOMBRE_FABRICANTE) VALUES(?,?)";
			PreparedStatement ps = conexion.getDbConecta().prepareStatement(cadenaSQL);
			ps.setInt(1, getPrecio());
			ps.setString(2, getNombreFabricante());
			conexion.EjecutarSql(ps);
			conexion.cerrarbase();
			
			//SE INGRESA LA BICICLETA
			conexion = new Conectar();
			cadenaSQL = "INSERT INTO BICICLETA (ID_VEHICULO,ANIO_CONSTRUCCION) VALUES(?,?)";
			ps = conexion.getDbConecta().prepareStatement(cadenaSQL);
			ps.setInt(1, getIdVehiculo());
			ps.setInt(2, getAnio());
			JOptionPane.showMessageDialog(null, conexion.EjecutarSql(ps));
			conexion.cerrarbase();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
