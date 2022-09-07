
public class Persona {
	private String Nombre;
	private String Apellido;
	
	public Persona(String nombre, String apellido) {
		super();
		Nombre = nombre;
		Apellido = apellido;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellido=" + Apellido + "]";
	}
	
	
	
}
