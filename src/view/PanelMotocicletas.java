package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class PanelMotocicletas extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton botonConsultar;
	private JTable tablaMotocicletas;
	private JTextField autonomia;
	private JTextField precio;
	private JTextField nombreFabricante;
	private JLabel jLabel1;
	private JButton botonGuardar;
	private JPanel jPanel2;
	private JScrollPane jScrollPane1;
	private JPanel jPanel1;

	public PanelMotocicletas() {
		super();
		initGUI();
	}
	
	public JButton getBotonConsultar() {
		return botonConsultar;
	}


	public void setBotonConsultar(JButton botonConsultar) {
		this.botonConsultar = botonConsultar;
	}


	public JTextField getAutonomia() {
		return autonomia;
	}


	public void setAutonomia(JTextField autonomia) {
		this.autonomia = autonomia;
	}


	public JTextField getPrecio() {
		return precio;
	}


	public void setPrecio(JTextField precio) {
		this.precio = precio;
	}


	public JTextField getNombreFabricante() {
		return nombreFabricante;
	}


	public void setNombreFabricante(JTextField nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}


	public JButton getBotonGuardar() {
		return botonGuardar;
	}


	public void setBotonGuardar(JButton botonGuardar) {
		this.botonGuardar = botonGuardar;
	}


	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(600, 345));
			{
				jPanel1 = new JPanel();
				this.add(jPanel1);
				jPanel1.setPreferredSize(new java.awt.Dimension(578, 121));
				jPanel1.setBorder(BorderFactory.createTitledBorder("Datos Motocicleta"));
				{
					jPanel2 = new JPanel();
					jPanel1.add(jPanel2);
					jPanel2.setPreferredSize(new java.awt.Dimension(454, 84));
					{
						jLabel1 = new JLabel();
						jPanel2.add(jLabel1);
						jLabel1.setText("Nombre Fabricante");
						jLabel1.setPreferredSize(new java.awt.Dimension(163, 16));
					}
					{
						nombreFabricante = new JTextField();
						jPanel2.add(nombreFabricante);
						nombreFabricante.setPreferredSize(new java.awt.Dimension(266, 20));
					}
					{
						jLabel2 = new JLabel();
						jPanel2.add(jLabel2);
						jLabel2.setText("Precio");
						jLabel2.setPreferredSize(new java.awt.Dimension(163, 16));
					}
					{
						precio = new JTextField();
						jPanel2.add(precio);
						precio.setPreferredSize(new java.awt.Dimension(266, 20));
					}
					{
						jLabel3 = new JLabel();
						jPanel2.add(jLabel3);
						jLabel3.setText("Autonomia");
						jLabel3.setPreferredSize(new java.awt.Dimension(163, 16));
					}
					{
						autonomia = new JTextField();
						jPanel2.add(autonomia);
						autonomia.setPreferredSize(new java.awt.Dimension(266, 20));
					}
				}
				{
					botonGuardar = new JButton();
					jPanel1.add(botonGuardar);
					botonGuardar.setText("Guardar");
					botonGuardar.setPreferredSize(new java.awt.Dimension(96, 79));
				}
			}
			{
				jScrollPane1 = new JScrollPane();
				this.add(jScrollPane1);
				jScrollPane1.setPreferredSize(new java.awt.Dimension(576, 161));
				{
					String[] encabezados = {"ID","Nombre Fabricante","Precio","Autonomia"};
					DefaultTableModel modelo = new DefaultTableModel(null, encabezados);
					tablaMotocicletas = new JTable();
					jScrollPane1.setViewportView(tablaMotocicletas);
					tablaMotocicletas.setModel(modelo);
					tablaMotocicletas.getColumnModel().getColumn(0).setMinWidth(50);
					tablaMotocicletas.getColumnModel().getColumn(0).setMaxWidth(50);
					tablaMotocicletas.getColumnModel().getColumn(1).setMinWidth(300);
					tablaMotocicletas.getColumnModel().getColumn(1).setMaxWidth(300);
					tablaMotocicletas.getColumnModel().getColumn(2).setMinWidth(100);
					tablaMotocicletas.getColumnModel().getColumn(2).setMaxWidth(100);
				}
			}
			{
				botonConsultar = new JButton();
				this.add(botonConsultar);
				botonConsultar.setText("Consultar");
				botonConsultar.setPreferredSize(new java.awt.Dimension(579, 40));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
