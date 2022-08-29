package controller;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;


public class Conectar{
	private Connection dbConecta;
	private String host;
	private String puerto;
	private String dataBase;
	private String usuario;
	private String password;

	public Connection getDbConecta() {
		return dbConecta;
	}

	public Conectar(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			Properties propiedades = new Properties();
			propiedades.load(new FileInputStream("data/configuracion.ini"));
			host = propiedades.getProperty("host");
			puerto = propiedades.getProperty("puerto");
			dataBase = propiedades.getProperty("Db");
			usuario = propiedades.getProperty("user");
			password = propiedades.getProperty("password");
			dbConecta = DriverManager.getConnection("jdbc:mysql://"+host+":"+puerto+"/"+dataBase, usuario, password);
		}catch (Exception Ex){
			System.out.println("Error al intentar conectarse: "+Ex.getMessage());
			System.exit(0);
		}
	}

	public String EjecutarSql(PreparedStatement ps){
		int registros = 0;
		try{
			registros = ps.executeUpdate();
		}
		catch (SQLException ex){
			ex.printStackTrace();
		}
		return "Se modificaron: "+registros + " registro(s)";
	}
	
	public ResultSet ConsultarSql(String cadenaSql){
		ResultSet tabla = null;
		try{
			Statement stmt = dbConecta.createStatement();
			tabla = stmt.executeQuery(cadenaSql);
		}
		catch (SQLException ex){
			ex.printStackTrace();
		}
		return tabla;
	}

	public void cerrarbase(){
		try {
			dbConecta.close();
		}
		catch (SQLException e){
			System.out.println("se produjo un error al cerrar la Base de Datos");
		}
	}
}
