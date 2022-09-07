import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 	Generar un programa que devuelva la siguiente salida:
 
				- Fecha Actual 
				- Nombre
				- Apellido
				- Edad
				- Localidad
				- Auto que maneja y sus respectivos atributos color, marca
				- Formación Academica y sus respectivos atributos titulo, tipo
				
				El archivo se debe llamar: "archivo_salida_fechaDeHoy"
				
				ESTRUCTURA DEL PROGRAMA:
				- Contar con al menos de 2 clases, en las que se implemente herencia y sus respectivos atributos
				
				ENTREGABLES:
				- TXT de SALIDA
				- Codigo Fuente.
			 */
		Auto auto = new Auto("rojo", "mazda");
		FormacionAcademica formacion = new FormacionAcademica("programador", TIPO_FORMACION.CICLO);
		Alumno a = new Alumno("Alex", "Tubio", "Córdoba", (byte) 22, auto.toString(), formacion.toString());
		
		try {
		      FileWriter escritor = new FileWriter("archivo_salida_fechaDeHoy.txt");
		      escritor.write(a.toString());
		      escritor.close();
		      System.out.println("Archivo creado y escrito correctamente.");
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		
		
	}

}
