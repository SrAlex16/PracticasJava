package clases;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Pais p1 = new Pais("Argentina", "America del Sur", "Buenos Aires", "humedo", 44000000f, 0f);
			Pais p2 = new Pais("Espana", "Europa", "Madrid", "calido", 47350000f, 1050f);
			Pais p3 = new Pais("Alemania", "Europa", "Berlin", "Frio", 83240000f, 15000f);
			Pais p4 = new Pais("Brasil", "America del Sur", "Brasilia", "variado", 212600000f, 500f);
			
			FileWriter myWriter = new FileWriter("datos.txt");
			myWriter.write(p1.toString()+" pbi= "+p1.calcularPbi()+"\n");
			myWriter.write(p2.toString()+" pbi= "+p2.calcularPbi()+"\n");
			myWriter.write(p3.toString()+" pbi= "+p3.calcularPbi()+"\n");
			myWriter.write(p4.toString()+" pbi= "+p4.calcularPbi()+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
