package Dominio;

public class Pelicula {
	private final int idPelicula;
	private static int Cont=1;
	String Nombre; 
	Categoria categoria;
		
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getIdPelicula() {
		return idPelicula;
	} 
	
	public Pelicula(String nomb,String cat)
	{
		idPelicula = Cont++;
		this.setNombre(nomb);
		categoria = new Categoria(cat);
		
	}
	@Override
	public String toString() {
		return "Pelicula [idPelicula=" + idPelicula + ", Nombre=" + Nombre + ", categoria=" + categoria.nombre + "]";
	}
}
