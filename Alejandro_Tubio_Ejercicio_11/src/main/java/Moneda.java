
public class Moneda {
	private float valor;
	private String nombre;
	
	public Moneda(float valor, String nombre) {
		super();
		this.valor = valor;
		this.nombre = nombre;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Moneda [valor=" + valor + ", nombre=" + nombre + "]";
	}
	
	

}
