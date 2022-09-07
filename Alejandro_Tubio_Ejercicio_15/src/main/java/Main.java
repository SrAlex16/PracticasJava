import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		/*
		 *  Elegir una API de tu gusto e interes, conectarte a la misma 
			y almacenar la información en un TXT de salida. 
			
			ENTREGABLES: 
			- Codigo del proyecto
			- TXT de salida
			- Descripción de la API en el mensaje enviado al profesor en el campu
		 */

		String[] nombres = { "Antonio", "Mauro", "Roberto", "Alejandro", "Diana", "Alba", "Mariam" };
		ArrayList<Personas> personas = new ArrayList<Personas>();
		for (int i = 0; i < nombres.length; i++) {
			try {
				URL url = new URL("https://api.genderize.io?name=" + nombres[i] + "&country_id=ES");
				BufferedReader lector = new BufferedReader(new InputStreamReader(url.openStream()));
				String linea = lector.readLine();
				String texto = "";
				while (linea != null) {
					texto += linea;
					linea = lector.readLine();
				}
				GsonBuilder builder = new GsonBuilder();
				Gson gson = builder.create();
				Personas p = gson.fromJson(texto, Personas.class); // Unmarshalling
				personas.add(p);

				lector.close();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(personas);

		try {
		      FileWriter escritor = new FileWriter("fichero.txt");
		      escritor.write(personas.toString());
		      escritor.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}

}
