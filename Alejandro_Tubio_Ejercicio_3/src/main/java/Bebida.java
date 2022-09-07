
public class Bebida {
	private String nombreBebida;
	private float alcohol;
	
	public Bebida(String nombreBebida, float alcohol) {
		super();
		this.nombreBebida = nombreBebida;
		this.alcohol = alcohol;
	}

	public String getNombreBebida() {
		return nombreBebida;
	}

	public void setNombreBebida(String nombreBebida) {
		this.nombreBebida = nombreBebida;
	}

	public float getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(float alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public String toString() {
		return "Bebida [nombreBebida=" + nombreBebida + ", alcohol=" + alcohol + "]";
	}
	
}
