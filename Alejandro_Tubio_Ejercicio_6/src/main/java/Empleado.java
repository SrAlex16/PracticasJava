import java.time.LocalDate;

public class Empleado extends Persona implements Interfaz{
	
	private String nombre;
	private String apellido;
	private String fechaIngreso;
	private String puesto;
	private int idEmpleado;
	private int antiguedadLaboral;
	private int salario;
	
	public Empleado(String nombre, String apellido, String fechaIngreso, String puesto, int idEmpleado, int antiguedadLaboral, int salario) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaIngreso = fechaIngreso;
		this.puesto = puesto;
		this.idEmpleado = idEmpleado;
		this.antiguedadLaboral = antiguedadLaboral;
		this.salario = salario;
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

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public int getAntiguedadLaboral() {
		return antiguedadLaboral;
	}

	public void setAntiguedadLaboral(int antiguedadLaboral) {
		this.antiguedadLaboral = antiguedadLaboral;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", fechaIngreso=" + fechaIngreso + ", puesto="
				+ puesto + ", idEmpleado=" + idEmpleado + ", antiguedadLaboral=" + antiguedadLaboral + ", salario="
				+ salario + "]";
	}

	public String calcularAntiguedad(int antiguedadLaboral) {
		LocalDate fechaActual = LocalDate.now();
		antiguedadLaboral =  fechaActual.getYear() - antiguedadLaboral;
		//System.out.println("Antiguedad laboral: "+antiguedadLaboral+" años");
		String resultado = "Antiguedad laboral: "+antiguedadLaboral+" años";
		return resultado;
	}
	
	
	
}
