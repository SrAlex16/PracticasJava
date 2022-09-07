
public class Main {

	public static void main(String[] args) {
		/*
		 * Hacer un progrma que muestre los siguientes valores:
		 * 
		 * Nombre
		 * Apellido
		 * Edad
		 * Ciudad
		 * url linkedin
		 * caracteristica solo de alumno
		 * 
		 * debe tener clase persona y almumno, alumno hereda de persona
		 */
		
		Alumno a = new Alumno("Alejandro", "Tubío", "Córdoba", "https://www.linkedin.com/feed/", (byte) 22, 1, "Java");
		System.out.println(a.toString());
	}

}
