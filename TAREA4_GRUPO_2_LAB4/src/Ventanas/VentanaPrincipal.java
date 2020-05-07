package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dominio.Pelicula;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame {

	private JPanel Cont1;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	private JPanel contentPane;
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Cont1 = new JPanel();
		Cont1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Cont1);
		Cont1.setLayout(null);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		Cont1.add(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		//EVENTO AGREGAR
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelIngresoPeliculas pi = new PanelIngresoPeliculas();
				//pi.setDefaultListModel();
				contentPane.add(pi);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnPeliculas.add(mntmListar);
		String[] listaGene = {"Seleccione un genero","Terror" , "Accion", "Suspenso","Romantica", "Thriller"};
		List listaGeneros = new List(); 
		listaGeneros.add("Seleccione un genero");
		listaGeneros.add("Terror");
		listaGeneros.add("Accion");
		listaGeneros.add("Suspenso");
		listaGeneros.add("Romantica");
		listaGeneros.add("Thriller");
		Pelicula pe1 = new Pelicula();
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
