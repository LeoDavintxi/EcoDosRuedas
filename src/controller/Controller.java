package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Bicicleta;
import view.Frame;

public class Controller implements ActionListener{

	private Frame vista;
	private Bicicleta bicicleta;

	public Controller() {
		vista = new Frame();
		asignarOyente();
	}

	public void asignarOyente() {
		vista.getPanelBicicletas().getBotonGuardar().addActionListener(this);
		vista.getPanelBicicletas().getBotonConsultar().addActionListener(this);
		
		vista.getPanelMotocicletas().getBotonGuardar().addActionListener(this);
		vista.getPanelMotocicletas().getBotonConsultar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==vista.getPanelBicicletas().getBotonGuardar()) {
			bicicleta = new Bicicleta(
					0,
					vista.getPanelBicicletas().getNombreFabricante().getText(),
					Integer.parseInt(vista.getPanelBicicletas().getPrecio().getText()),
					Integer.parseInt(vista.getPanelBicicletas().getAnio().getText()));
			bicicleta.guardarBicicleta();
			
			vista.getPanelBicicletas().getNombreFabricante().setText("");
			vista.getPanelBicicletas().getPrecio().setText("");
			vista.getPanelBicicletas().getAnio().setText("");
			
		}
		if(e.getSource()==vista.getPanelBicicletas().getBotonConsultar()) {

		}
	}

}
