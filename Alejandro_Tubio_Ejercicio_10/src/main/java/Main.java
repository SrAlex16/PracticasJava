
public class Main {
	public static void main (String args[]) {
		/*
		 *  Nos contrataron de una empresa para realizar un ordenamiento de sus procesos internos, lo que nos llevo a analizar sus sistemas para entender el dimensionamiento de nuestras tareas.
			En el relevamiento inicial se identifico que la empresa tiene un sistema de inventario de productos que debe ser mejorado. A día de hoy el sistema solo almacena el stock, pero no lo informa.
			Como parte de nuestras tareas debemos mejorar el sistema, generandole una salida. Desde la empresa nos dieron una muestra de la información que tiene el sistema, la misma esta almacenada
			en "inventario.txt" 
			
			ESTRUCTURA DEL PROGRAMA:
			- El programa debe leer un archivo plano y lograr cargarlo. El txt se debe llamar "inventario.txt"
			- El programa debe generar un archivo plano de salida que se llame "inventario_salida.txt"
			- Implementar una interfaz que tenga el metodo "generaSalida" que genere el archivo de salida. 
			- Implementar una clase para el inventario
			
			ENTREGABLES:
			- JAR File y codigo del proyecto.
		 */
		
		Inventario i = new Inventario();
		i.generaSalida();
		
	}
}
