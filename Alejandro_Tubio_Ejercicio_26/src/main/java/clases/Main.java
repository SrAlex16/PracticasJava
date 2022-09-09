package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// api
		try {
			URL url = new URL("https://www.el-tiempo.net/api/json/v2/provincias/41");
			BufferedReader lector = new BufferedReader(new InputStreamReader(url.openStream()));
			String linea = lector.readLine();
			String texto = "";
			while (linea != null) {
				texto += linea;
				linea = lector.readLine();
			}
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();
			Ciudad c = gson.fromJson(texto, Ciudad.class); // Unmarshalling
			Ciudad.produccionActiva();

			lector.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
