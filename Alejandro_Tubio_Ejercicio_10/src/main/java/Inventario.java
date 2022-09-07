import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inventario implements Interfaz{
	private String inventarioLeido;

	public void generaSalida() {
		try {
		      File inventarioTxt = new File("inventario.txt");
		      FileWriter escritor = new FileWriter("inventario_salida.txt");
		      Scanner lector = new Scanner(inventarioTxt);
		      while (lector.hasNextLine()) {
		        String data = lector.nextLine();
		        escritor.write(data+"\n");
		        System.out.println(data);
		      }
		      lector.close();
		      escritor.close();
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
