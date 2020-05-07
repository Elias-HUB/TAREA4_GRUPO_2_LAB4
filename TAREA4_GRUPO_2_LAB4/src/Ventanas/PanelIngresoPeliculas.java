package Ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Dominio.Pelicula;

import javax.swing.JComboBox;

import java.awt.List;

import javax.swing.JButton;

public class PanelIngresoPeliculas extends JPanel {
	private JTextField txbNombre;

	/**
	 * Create the panel.
	 */
	public PanelIngresoPeliculas() {
		setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(101, 72, 54, 27);
		add(lblId);
		
		JLabel txbID = new JLabel("");
		txbID.setBounds(200, 78, 46, 14);
		add(txbID);
		Pelicula pe1 = new Pelicula();
	    txbID.setText((Integer. toString(pe1.devuelveProximoID())));
		
		JLabel lblNombe = new JLabel("Nombre : ");
		lblNombe.setBounds(101, 121, 54, 27);
		add(lblNombe);
		
		JLabel lblGenero = new JLabel("Genero :");
		lblGenero.setBounds(101, 173, 54, 27);
		add(lblGenero);
		
		txbNombre = new JTextField();
		txbNombre.setBounds(200, 124, 158, 20);
		add(txbNombre);
		txbNombre.setColumns(10);
		
		String[] listaGene = {"Seleccione un genero","Terror" , "Accion", "Suspenso","Romantica", "Thriller"};
		JComboBox cboGenero = new JComboBox(listaGene);
		cboGenero.setBounds(200, 176, 158, 24);
		add(cboGenero);

		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(103, 228, 89, 23);
		add(btnAceptar);

	}
}
