package Dominio;

import javax.swing.DefaultListModel;

import Ventanas.VentanaPrincipal;

public class Principal {
	private static DefaultListModel<Pelicula> listaPeliculas;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		VentanaPrincipal v0= new VentanaPrincipal();
		v0.setVisible(true);
		listaPeliculas = new DefaultListModel<Pelicula>();
		
	}

}
