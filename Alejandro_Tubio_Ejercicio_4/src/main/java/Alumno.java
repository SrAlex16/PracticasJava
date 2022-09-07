
public class Alumno{
	private String nombre;
	private String apellido;
	private String localidad;
	private byte edad;
	private String auto;
	private String formacion;
	
	
	public Alumno(String nombre, String apellido, String localidad, byte edad, String auto,
			String formacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.localidad = localidad;
		this.edad = edad;
		this.auto = auto;
		this.formacion = formacion;
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


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public byte getEdad() {
		return edad;
	}


	public void setEdad(byte edad) {
		this.edad = edad;
	}


	public String getAuto() {
		return auto;
	}


	public void setAuto(String auto) {
		this.auto = auto;
	}


	public String getFormacion() {
		return formacion;
	}


	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", localidad=" + localidad + ", edad=" + edad
				+ ", auto=" + auto + ", formacion=" + formacion + "]";
	}
	
	
	
}
