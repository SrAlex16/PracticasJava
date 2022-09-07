
public class Comida{
	private String nombreComida;
	private TIPO_COMIDA tipoComida;
	
	public Comida(String nombreComida, TIPO_COMIDA tipoComida) {
		super();
		this.nombreComida = nombreComida;
		this.tipoComida = tipoComida;
	}

	public String getNombreComida() {
		return nombreComida;
	}

	public void setNombreComida(String nombreComida) {
		this.nombreComida = nombreComida;
	}

	public TIPO_COMIDA getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(TIPO_COMIDA tipoComida) {
		this.tipoComida = tipoComida;
	}

	@Override
	public String toString() {
		return "Comida [nombreComida=" + nombreComida + ", tipoComida=" + tipoComida + "]";
	}
	
}
