
public class Ciudad {
	private String nombre;
	private float kms;
	
	public Ciudad(String nombre, float kms) {
		super();
		this.nombre = nombre;
		this.kms = kms;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getKms() {
		return kms;
	}

	public void setKms(float kms) {
		this.kms = kms;
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", kms=" + kms + "]";
	}

}
