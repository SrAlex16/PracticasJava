
public class FormacionAcademica {
	private String titulo;
	private TIPO_FORMACION tipoGrado;
	
	public FormacionAcademica(String titulo, TIPO_FORMACION tipoGrado) {
		super();
		this.titulo = titulo;
		this.tipoGrado = tipoGrado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public TIPO_FORMACION getTipoGrado() {
		return tipoGrado;
	}

	public void setTipoGrado(TIPO_FORMACION tipoGrado) {
		this.tipoGrado = tipoGrado;
	}

	@Override
	public String toString() {
		return "FormacionAcademica [titulo=" + titulo + ", tipoGrado=" + tipoGrado + "]";
	}
	
	
	
}
