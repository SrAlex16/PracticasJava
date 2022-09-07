
public class Personas {
	private String name;
	private String gender;
	private float probability;
	private int count;
	private String country_id;
	public Personas(String name, String gender, float probability, int count, String country_id) {
		super();
		this.name = name;
		this.gender = gender;
		this.probability = probability;
		this.count = count;
		this.country_id = country_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getProbability() {
		return probability;
	}
	public void setProbability(float probability) {
		this.probability = probability;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	@Override
	public String toString() {
		return "Personas [name=" + name + ", gender=" + gender + ", probability=" + probability + ", count=" + count
				+ ", country_id=" + country_id + "]";
	}
}
