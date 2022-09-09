import enums.NOMBRES;

public class Main {

	public static void main(String[] args) {
		/*
		 * RELEVAMIENTO:
		 * Nos contratan de una empresa de videojuegos para poder
		 * ayudarlos a desarrollar una APP que almacene la información de los titulos
		 * mas importantes que tienen hoy en día Para esto, debemos desarrollar un
		 * programa que informe a los empleados los titulos de videojuegos y sus
		 * respectivas ventas con el monto total que viene acumulando dichas ventas.
		 * 
		 * ESTRUCTURA DEL PROGRAMA: 
		 * - Contar con una interfaz que calcule el monton total de los videojuegos y su recaudación 
		 * - TXT de salida que informe titulos, cantidades de unidades vendidas y monto total. 
		 * - videojuego que tenga atributos pertinentes a los videojuegos.
		 * 
		 * ENTREGABLES: 
		 * - El proyecto debe estar publicado en Github 
		 * - Enviar el link del repo 
		 * - Enviar el codigo - Enviar el TXT de salida.
		 * 
		 *  VIDEOJUEGOS:			CANTIDAD DE REGISTROS		PRECIO UNITARIO
			DARK SOULS 3 				10000					5
			THE LAST OF US 				50000					10
			FIFA 2022					60000					15
			MARIO BROSS					45000					1
			DOOM 2						100000					1
			HORIZON						50000					5

		 */
		
		Juego j = new Juego (NOMBRES.DARK_SOULS_3.toString(), (byte) 5, 10000);
		Juego j2 = new Juego (NOMBRES.THE_LASTO_OF_US.toString(), (byte) 5, 100000);
		Juego j3 = new Juego (NOMBRES.FIFA_2022.toString(), (byte) 15, 6000);
		Juego j4 = new Juego (NOMBRES.MARIO_BROS.toString(), (byte) 1, 45000);
		Juego j5 = new Juego (NOMBRES.DOOM_2.toString(), (byte) 1, 10000);
		Juego j6 = new Juego (NOMBRES.DARK_SOULS_3.toString(), (byte) 5, 5000);
		
		System.out.println(j.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		System.out.println(j4.toString());
		System.out.println(j5.toString());
		System.out.println(j6.toString());
	}

}
