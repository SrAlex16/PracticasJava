package clases;

public class Pais {
	private String pais;
	private String continente;
	private String capital;
	private String clima;
	private static float salario;
	private static float habitantes;
	private static float pbi;

	public static float calcularPbi() {
		pbi = habitantes * salario;
		return pbi;
	}

	public Pais(String pais, String continente, String capital, String clima, float salario, float habitantes) {
		super();
		this.pais = pais;
		this.continente = continente;
		this.capital = capital;
		this.clima = clima;
		this.salario = salario;
		this.habitantes = habitantes;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(float habitantes) {
		this.habitantes = habitantes;
	}

	@Override
	public String toString() {
		return "Pais [pais=" + pais + ", continente=" + continente + ", capital=" + capital + ", clima=" + clima
				+ ", salario=" + salario + ", habitantes=" + habitantes + "PBI= " + pbi + "]";
	}
}
