import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Leer un TXT y sus valores informados utilizando SET y detectar los valores
		 * que contiene el mismo Imprimir un TXT de salida con los valores ordenados de
		 * menor a mayor. ENTREGABLE: - TXT de SALIDA - Codigo del proyecto
		 */

		List<Integer> numeros = new ArrayList<Integer>();

		try {
			File fichero = new File("fichero.txt");
			FileWriter escritor = new FileWriter("fichero_escrito.txt");
			Scanner lector = new Scanner(fichero);
			while (lector.hasNextLine()) {
				int data = lector.nextInt();
				numeros.add(data);
				escritor.write(data+"\n");
				// System.out.println(data);
			}
			Collections.sort(numeros);

			for (Integer datos : numeros) {
				System.out.println(datos);
			}
			escritor.close();
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
