import java.time.LocalDate;

public class Main {
	public static void main(String args[]) {
		/*
		 	Crear un programa que muestre por consola la siguiente informacion:
			- Fecha actual
			- Nombre
			- Apellido
			- Edad
			- Fecha de Nacimiento (Tipo date)
			- Ciudad
			- Bebida Favorita
			- Comida Favorita
			
			Estructura del programa: 
			El programa debe contar AL MENOS con tres clases. Clase Persona, Clase Ciudad y Clase Bebida. Donde Persona va a IMPLEMENTAR atributos de las otras clases. 
			
			Entregables: 
			- Codigo del proyecto
			- Captura de pantalla de la consola con el output
		 */
		Comida c = new Comida("ensalada", TIPO_COMIDA.VERDURA);
		Bebida b = new Bebida("CocaColda", 0);
		Ciudad f = new Ciudad("Lucena", 20);
		Persona p = new Persona("Alejandro", "Tubio", LocalDate.now(), "10/04/2000", (byte)22, c.toString(), b.toString(), f.toString());
		System.out.println(p.toString());
		
	}
}
