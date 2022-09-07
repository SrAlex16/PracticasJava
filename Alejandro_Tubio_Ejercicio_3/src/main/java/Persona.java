import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDate fechaActual;
	private String fechaNacimiento;
	private byte edad;
	private String comidaFavorita;
	private String bebidaFavorita;
	private String ciudad;
	
	public Persona(String nombre, String apellido, LocalDate fechaActual, String fechaNacimiento, byte edad,
			String comidaFavorita, String bebidaFavorita, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaActual = fechaActual;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.comidaFavorita = comidaFavorita;
		this.bebidaFavorita = bebidaFavorita;
		this.ciudad = ciudad;
	}

	public String getCiudad() {
		return ciudad;
	}
	
	public String setCiudad() {
		return ciudad;
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

	public LocalDate getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public String getComidaFavorita() {
		return comidaFavorita;
	}

	public void setComidaFavorita(String comidaFavorita) {
		this.comidaFavorita = comidaFavorita;
	}

	public String getBebidaFavorita() {
		return bebidaFavorita;
	}

	public void setBebidaFavorita(String bebidaFavorita) {
		this.bebidaFavorita = bebidaFavorita;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", ciudad=" + ciudad + ", apellido=" + apellido + ", fechaActual=" + fechaActual
				+ ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", comidaFavorita=" + comidaFavorita
				+ ", bebidaFavorita=" + bebidaFavorita + "]";
	}
	
	
	
}
