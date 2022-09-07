public class Persona {
	String nombre;
	String apellido;
	String ciudad;
	String linkedin;
	byte edad;
	
	public Persona(String nombre, String apellido, String ciudad, String linkedin, byte edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.linkedin = linkedin;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}
}
