package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class Provincia{
	private String provincia;
	private String capital;
	
	public Provincia(String provincia, String capital) {
		super();
		this.provincia = provincia;
		this.capital = capital;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Provincia [provincia=" + provincia + ", capital=" + capital + "]";
	}
	
	public static void crearProvincia() throws IOException{
		String[] nombres = {"Gustavo", "Alejandro", "Ana", "Jose", "Pedro", "Marta", "Rocio"};
		String[] apellidos = {"Vagas", "Tubio", "Perez", "Gomez", "Ramirez", "Gutierrez"};
		Random ran = new Random();
		int num;
		
		File myObj = new File("comunidades.txt");
	      Scanner myReader = new Scanner(myObj);
	      
	      String[] comunidadesArr;
	      String provincia;
	      String capital;
	      
	      FileWriter myWriter = new FileWriter("jenkins.jenkinsfile");
	      
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        //System.out.println(data);
	        
	        comunidadesArr = data.split(" ");
	        
	        provincia = comunidadesArr[0];
	        capital = comunidadesArr[1];
	        
	        Provincia p = new Provincia(provincia, capital);
	        //System.out.println(p.toString());
	        
	        Usuario u = new Usuario((byte) 1, nombres[num = ran.nextInt(6)].toString(), apellidos[num = ran.nextInt(6)].toString(), LocalDate.now(), p);
	        System.out.println(u.toString());
	        
	        myWriter.write(u.toString()+"\n");
	        
	        
	      }
	      myWriter.close();
	      myReader.close();
	}
	
}
