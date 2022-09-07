
public class Club {
	private String Nombre;
	private String Socios;	
	
	
	public Club(String nombre, String socios) {
		super();
		Nombre = nombre;
		Socios = socios;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getSocios() {
		return Socios;
	}

	public void setSocios(String socios) {
		Socios = socios;
	}

	@Override
	public String toString() {
		return "Club [Nombre=" + Nombre + ", Socios=" + Socios + ", nombre=" + "]";
	}
	
	
	
}
