import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 7
			Desarrollar un programa que te pregunte tu estado emocional, y en base al mismo te de distintas respuestas.
			1. Enojado -> Dar un consejo para relajarse.
			2. Feliz -> Felicitaciones! La vida es bonita.
			3. Triste -> Contar un chiste. 
			4. Miedo -> Contar un cuento. 
			
			ESTRUCTURA DEL PROGRAMA: 
			- Mensaje de bienvenida
			- Preguntar nombre por consola
			- Preguntar estado de animo por consola
			
			(!) ESTE PROGRAMA DEBE IMPLEMENTAR UNA INTERFAZ PARA ALGUNO DE LOS ESTADOS DE ANIMOS (!)
			
			ENTREGABLE: JAR File y codigo del proyecto.
		 */
		System.out.println("Dime tu nombre");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		System.out.println("Bienvenido "+nombre);
		System.out.println("Dime tu estado emocional: \t\n"+Estados.ENFADADO.toString()+" \t\n "+Estados.FELIZ.toString()
		+"\t\n "+Estados.TRISTE.toString()+"\t\n "+Estados.MIEDO.toString());
		Byte opcion = sc.nextByte();
		switch(opcion) {
		case 1:
			System.out.println("Dar un consejo para relajarse.");
			break;
		case 2:
			System.out.println("Felicitaciones! La vida es bonita.");
			break;
		case 3:
			System.out.println("Contar un chiste");
			break;
		case 4:
			System.out.println("Contar un cuento");
			break;
		}
	}

}
