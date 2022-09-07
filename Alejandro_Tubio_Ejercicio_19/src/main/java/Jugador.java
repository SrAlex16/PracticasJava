
public class Jugador {
	  private String Nombre;
	  private String Apellido;
	  private String Edad;
	  private String Pie;
	  private String Goles;
	  
	  
	  
	  
	public Jugador(String nombre, String apellido, String edad, String pie, String goles) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		Pie = pie;
		Goles = goles;
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




	public String getEdad() {
		return Edad;
	}




	public void setEdad(String edad) {
		Edad = edad;
	}




	public String getPie() {
		return Pie;
	}




	public void setPie(String pie) {
		Pie = pie;
	}




	public String getGoles() {
		return Goles;
	}




	public void setGoles(String goles) {
		Goles = goles;
	}




	@Override
	public String toString() {
		return "Jugador [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", Pie=" + Pie + ", Goles="
				+ Goles + "]";
	}
	  
	  
}
