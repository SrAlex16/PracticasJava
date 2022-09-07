public class Alumno extends Persona{
	int id;
	String lenguaje;
	
	public Alumno(String nombre, String apellido, String ciudad, String linkedin, byte edad, int id, String lenguaje) {
		super(nombre, apellido, ciudad, linkedin, edad);
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.lenguaje = lenguaje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	@Override
	public String toString() {
		return "Alumno [nombre="+ nombre +", apellido="+ apellido +", ciudad="+ ciudad +", linkedin="+ linkedin +" id=" + id + ", lenguaje=" + lenguaje + "]";
	}
	
	
	
}
