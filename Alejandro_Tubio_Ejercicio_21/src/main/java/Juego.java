
public class Juego {
	private String nombre;
	private static byte precio;
	private static long registro;
	
	public Juego(String nombre, byte precio, long registro) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.registro = registro;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public byte getPrecio() {
		return precio;
	}
	
	public void setPrecio(byte precio) {
		this.precio = precio;
	}
	
	public long getRegistro() {
		return registro;
	}
	
	public void setRegistro(long registro) {
		this.registro = registro;
	}
	
	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", precio=" + precio + ", registro=" + registro + ", precio calculado=" + calcularPrecio(precio) + "]";
	}
	
	
	private static long calcularPrecio(long precioTotal) {
		precioTotal = precio * registro;
		
		return precioTotal;
	}

}
