package clases;

import java.io.IOException;

public class Main {
	public static void main(String args[]) {
		try {
			Provincia.crearProvincia();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}