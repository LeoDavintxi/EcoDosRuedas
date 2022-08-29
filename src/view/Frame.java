package view;
import java.awt.BorderLayout;
import javax.swing.*;

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
public class Frame extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private PanelBicicletas panelBicicletas;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JPanel jPanel1;
	private PanelMotocicletas panelMotocicletas;
	private JTabbedPane panelPestanias;

	public Frame() {
		super();
		initGUI();
	}

	public PanelMotocicletas getPanelMotocicletas() {
		return panelMotocicletas;
	}


	public void setPanelMotocicletas(PanelMotocicletas panelMotocicletas) {
		this.panelMotocicletas = panelMotocicletas;
	}


	public PanelBicicletas getPanelBicicletas() {
		return panelBicicletas;
	}


	public void setPanelBicicletas(PanelBicicletas panelBicicletas) {
		this.panelBicicletas = panelBicicletas;
	}


	private void initGUI() {
		try {
			this.setSize(750, 390);
			this.setTitle("EcoDosRuedas LTDA");
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setVisible(true);
			{
				panelPestanias = new JTabbedPane();
				getContentPane().add(panelPestanias, BorderLayout.CENTER);
				panelPestanias.setTabPlacement(JTabbedPane.LEFT);
				{
					panelBicicletas = new PanelBicicletas();
					panelPestanias.addTab("Bicicletas", null, panelBicicletas, null);
				}
				{
					panelMotocicletas = new PanelMotocicletas();
					panelPestanias.addTab("Motocicletas", null, panelMotocicletas, null);
				}
				{
					jPanel1 = new JPanel();
					panelPestanias.addTab("Proveedor", null, jPanel1, null);
				}
				{
					jPanel3 = new JPanel();
					panelPestanias.addTab("Clientes", null, jPanel3, null);
				}
				{
					jPanel2 = new JPanel();
					panelPestanias.addTab("Registo Intenciones", null, jPanel2, null);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
