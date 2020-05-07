package Ventanas;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;

import Dominio.Pelicula;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelListadoPelicula extends JPanel {

	
	private JList<Pelicula> jList;
	private DefaultListModel<Pelicula> listModel;
	
	/**
	 * Create the panel.
	 */
	public PanelListadoPelicula() {
		dibujarControles();
	}
		
		public void dibujarControles() {		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{24, 75, 325, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel LblPeliculas = new JLabel("Peliculas");
		LblPeliculas.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_LblPeliculas = new GridBagConstraints();
		gbc_LblPeliculas.insets = new Insets(0, 0, 5, 5);
		gbc_LblPeliculas.gridx = 1;
		gbc_LblPeliculas.gridy = 1;
		add(LblPeliculas, gbc_LblPeliculas);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		JList Jlist = new JList<Pelicula>();
		scrollPane.setViewportView(Jlist);

	}

	public DefaultListModel<Pelicula> getListModel() {
		return listModel;
	}

	public void setListModel(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;
	}

	public JList<Pelicula> getjList() {
		return jList;
	}

	public void setjList(JList<Pelicula> jList) {
		this.jList = jList;
	}

}
