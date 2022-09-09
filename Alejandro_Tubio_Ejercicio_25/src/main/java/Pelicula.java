import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pelicula {
	private String nombre;
	private long dinero;

	public Pelicula(String nombre, long dinero) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDinero() {
		return dinero;
	}

	public void setDinero(long dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", dinero=" + dinero + "]";
	}

	public static void EscribirFichero(List<Pelicula> peliculas) {
		try {
		      FileWriter escritor = new FileWriter("peliculas.jenkinsfile");
		      escritor.write(peliculas.toString()+"\t");
		      escritor.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}
}
