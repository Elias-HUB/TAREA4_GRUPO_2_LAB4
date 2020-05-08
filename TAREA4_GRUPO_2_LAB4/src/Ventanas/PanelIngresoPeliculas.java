package Ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Dominio.Pelicula;

import javax.swing.JComboBox;

import java.awt.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelIngresoPeliculas extends JPanel {
	private JTextField txtNombre;
	private JComboBox cboGenero;
	private JButton btnAceptar;
	//private DefaultListModel<Pelicula> listModel;

	/**
	 * Create the panel.
	 */
	public PanelIngresoPeliculas() {
		setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(101, 29, 54, 27);
		add(lblId);
		
		JLabel txbID = new JLabel("");
		txbID.setBounds(200, 35, 46, 14);
		add(txbID);
		Pelicula pe1 = new Pelicula();
	    txbID.setText(Integer. toString(pe1.getIdPelicula()));
		
		JLabel lblNombe = new JLabel("Nombre : ");
		lblNombe.setBounds(97, 80, 54, 27);
		add(lblNombe);
		
		JLabel lblGenero = new JLabel("Genero :");
		lblGenero.setBounds(97, 132, 54, 27);
		add(lblGenero);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(196, 83, 158, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		String[] listaGene = {"Seleccione un genero","Terror" , "Accion", "Suspenso","Romantica", "Thriller"};
		cboGenero = new JComboBox(listaGene);
		cboGenero.setBounds(196, 135, 158, 24);
		add(cboGenero);

		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtNombre.getText().isEmpty() && cboGenero.getSelectedIndex()!=0)
				{
					Pelicula pel = new Pelicula(txtNombre.getText(),(cboGenero.getSelectedItem()).toString());
					txtNombre.setText("");	
					cboGenero.setSelectedIndex(0);
					txbID.setText((Integer. toString(pel.devuelveProximoID())));
				Principal.listModel.addElement(pel);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "No se puede agregar la película, debe completar todos los campos.");
				}
			}
		});
		btnAceptar.setBounds(101, 182, 89, 23);
		add(btnAceptar);

	}

}