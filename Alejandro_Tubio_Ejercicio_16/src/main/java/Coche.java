
public class Coche {
	private int precio;
	private float resultado;
	private String modelo;
	
	public Coche(int precio, String modelo) {
		super();
		this.precio = precio;
		this.modelo = modelo;
	}

	
	public float getResultado() {
		return resultado;
	}
	
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [precio=" + precio + ", resultado=" + calcularResultado(resultado) + ", modelo="
				+ modelo + "]";
	}
	
	public float calcularResultado(float resultado) {
		resultado = precio*0.25f;
		return resultado;
	}
	
}
