import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main (String[] args) {
		/*
		 	CONTEXTO: Nos contrataron de una empresa para poder armar un sistema que informe la siguiente información de los empleados de la compañia:
			id empleado:
			Nombre:
			Apellido:
			Fecha de ingreso:
			Puesto:
			Antiguedad laboral:
			Salario: 
			
			Desde la empresa esperan que el sistema pueda brindar esta información a traves de un TXT de salida generandolo de forma diaria. 
			
			ESTRUCTURA DEL PROGRAMA: El programa debe contar con al MENOS 2 clases (Persona y empleado) y debe implementar al MENOS una interfaz para calcular la antiguedad
			laboral. 
			OPCIONAL: Implementar otra interfaz para la generación del salario.
			
			ENTREGABLE: 
			- TXT de salida con el siguiente nombre: "informacion_empleados_fecha"
			- Source del proyecto.
		 */
		
		Empleado e = new Empleado("alejandro","tubio","1/1/2022","programador",1,1,1200);
		Empleado e2 = new Empleado("alejandro","tubio","1/1/2022","programador",1,1,1200);
		Empleado e3 = new Empleado("alejandro","tubio","1/1/2022","programador",1,1,1200);
		System.out.println(e.toString());
		System.out.println(e.calcularAntiguedad(2000));
		
		//escribir fichero
		try {
		      FileWriter escritor = new FileWriter("informacion_empleados_fecha.txt");
		      escritor.write(e.toString()+"\n"+e.calcularAntiguedad(2000));
		      escritor.write("\n"+e2.toString()+"\n"+e2.calcularAntiguedad(2000));
		      escritor.write("\n"+e3.toString()+"\n"+e3.calcularAntiguedad(2000));
		      escritor.close();
		      System.out.println("archivo creado y escrito");
		    } catch (IOException a) {
		      a.printStackTrace();
		    }
		
	}
}
