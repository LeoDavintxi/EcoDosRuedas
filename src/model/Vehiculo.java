package model;

public class Vehiculo {
	
	private int idVehiculo;
	private String nombreFabricante;
	private int precio;
	
	public Vehiculo(int idVehiculo, String nombreFabricante, int precio) {
		this.idVehiculo = idVehiculo;
		this.nombreFabricante = nombreFabricante;
		this.precio = precio;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", nombreFabricante=" + nombreFabricante + ", precio=" + precio + "]";
	}
}
