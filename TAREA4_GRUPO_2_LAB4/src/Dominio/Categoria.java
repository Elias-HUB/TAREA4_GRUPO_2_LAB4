package Dominio;

public class Categoria {
	String nombre; 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Categoria(String nomb)
	{
		this.setNombre(nomb);
	}

	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + "]";
	}
}
