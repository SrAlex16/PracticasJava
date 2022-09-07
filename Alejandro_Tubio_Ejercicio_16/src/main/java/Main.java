import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.JSONArray;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crear un proyecto Java y Convertirlo a un Proyecto Maven donde se implemente
		 * la creación de un JSON, una interfaz y el concepto de herencia.
		 * 
		 * CONSIGNA: Nos contrataron de Audi para realizar un analisis de su flota de
		 * autos disponibles Para lo cual nos pidieron que generemos un sistema que
		 * genere un archivo de salida con la información de los precios de los autos y
		 * sus respectivos modelos.
		 * 
		 * ESTRUCTURA DEL PROGRAMA: - Implementar una interfaz que genere el valor final
		 * del auto (calculando el 25% de impuesto) - Implementar Herencia entre Clase
		 * Padre Auto y Clase Audi - Desarrollar un JSON que almacene la información de
		 * salida - Nombre de TXT de salida: "costos_mesAñoActual"
		 * 
		 * ENTREGABLES: - Source del proyecto (codigo del proyecto completo) - TXT de
		 * salida
		 * 
		 * VALORES PRECIO BASE: A1 €10000 A2 €15000 A3 €18000 A5 €21000
		 */

		Coche a1 = new Coche(10000, "A1");
		Coche a2 = new Coche(15000, "A2");
		Coche a3 = new Coche(18000, "A3");
		Coche a5 = new Coche(21000, "A5");

		JSONArray json = new JSONArray();
		json.put(a1);
		json.put(a2);
		json.put(a3);
		json.put(a5);
		
		String nombreArchivo = "salida.txt";
		try
		{
			File file = new File (nombreArchivo);
			file.createNewFile();
			PrintWriter out = new PrintWriter(nombreArchivo);
			out.println(json.toString());
			out.close();
		}
		catch (IOException e)
		{
		e.printStackTrace();	
		}
		
		
		
		
		// Coche[] cochesArr = { a1, a2, a3, a5 };
		/*
		for (int i = 0; i < json.length(); i++) {
			JSONObject jsonObject = json.getJSONObject(i);
			try {
			      FileWriter myWriter = new FileWriter("a1.txt");
			      BufferedWriter bw = new BufferedWriter(myWriter); 
			      bw.write(json.toString());
			      bw.close();
			      myWriter.close();
			    } catch (IOException e) {
			      e.printStackTrace();
			    }
		}
		*/
	}
}
