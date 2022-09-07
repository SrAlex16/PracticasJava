
public class Main {

	public static void main(String[] args) {
		/*
		 *  Generar un programa que informe los valores de los jugadores de futbol de completeConSuEquipoFavorito. 
			Los atributos que deben tener son los siguientes:
			- Clase para jugador
			  Nombre
			  Apellido
			  Edad
			  Pie Habil (I, D)
			  Goles
			- Clase para Club de futbol 
			  Nombre
			  Socios
			  Nombre del estadio
			- Clase MAIN que implemente y muestre por pantalla la información utilizada.
			Realizar composición para este ejercicio
			Hacerlo para al menos 3 jugadores. 
			ENTREGABLES: Codigo + Captura de pantalla de la consola
		 */
		
		Jugador j1 = new Jugador("paco","gomez","24","derecho","2");
		Jugador j2 = new Jugador("pepe","perez","22","izquierdo","6");
		Jugador j3 = new Jugador("jose","sanchez","25","izquierdo","1");
		
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		
		Club c1 = new Club("barça","10000000");
		Club c2 = new Club("madrid","20000000");
		Club c3 = new Club("atleti","30000000");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
	}

}
