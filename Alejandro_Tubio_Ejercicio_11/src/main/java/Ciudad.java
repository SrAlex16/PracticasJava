
public class Ciudad extends Moneda{
	private String clima;
	private long habitantes;
	
	public Ciudad(float valor, String nombre) {
		super(valor, nombre);

	}
	
	
	

	public Ciudad(float valor, String nombre, String clima, long habitantes) {
		super(valor, nombre);
		this.clima = clima;
		this.habitantes = habitantes;

	}




	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public long getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(long habitantes) {
		this.habitantes = habitantes;
	}




	@Override
	public String toString() {
		return "Ciudad [clima=" + clima + ", habitantes=" + habitantes +"]";
	}

	

	

	
	
}
