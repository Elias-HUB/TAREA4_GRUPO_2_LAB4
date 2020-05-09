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
	public Pelicula()
	{
		idPelicula = Cont;
		this.setNombre("");
		categoria = new Categoria("");
		
	}
	public int devuelveProximoID()
	{
		return this.getIdPelicula()+1; 
	}
	@Override
	public String toString() {
		return "Nombre=" + Nombre + " Categoria=" + categoria.nombre;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + idPelicula;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (idPelicula != other.idPelicula)
			return false;
		return true;
	}
}
