package clases;

public class Chocolate {
	private String tipo;
	private long cantidad;

	public Chocolate(String tipo, long cantidad) {
		super();
		this.tipo = tipo;
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Chocolate [tipo=" + tipo + ", cantidad=" + cantidad + "]";
	}

}
