public class Usuario {
	private String nombre;
	private static String fechaNac;
	
	public Usuario(String nombre, String fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNac=" + fechaNac + ", numeroSuerte=" +numeroSuerte()+ "]";
	}
	
	//	1 0 / 0 4 / 2 0 0 0
	
	//  0 1 2 3 4 5 6 7 8 9
	public int numeroSuerte() {
		fechaNac = fechaNac.replace("/", "");
		
		int[] num = new int[fechaNac.length()];
		int suma = 0;

	    for (int i = 0; i < fechaNac.length(); i++){
	    	
	    	num[i] = fechaNac.charAt(i) - '0';
	    	suma+=num[i];
	    }
		return suma;
	}
}
