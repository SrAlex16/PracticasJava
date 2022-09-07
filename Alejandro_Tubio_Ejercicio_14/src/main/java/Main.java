import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		INGRESAR POR CONSOLA LO SIGUIENTE: 
		- Fecha de nacimiento, 
		- Nombre 
		En un arrayList almacene fechas de nacimiento (DD/MM/YYY) para distintas personas y genere el numero de la suerte de cada una.
		El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
		Por ejemplo: Si la fecha de nacimiento es 12/07/1980
		Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 28
		Número de la suerte: 28
		
		ESTRUCTURA DEL PROGRAMA:
		- Clase de Usuario
		- Interfaz que implemente metodo de numeroSuerte()
		
		CONSIDERACIONES: 
		- Para al menos 5 usuarios
		- Por cada nombre ingresado se contabiliza 1 usuario, luego, debe seguir pidiendo para el resto.
		ENTREGABLES: Captura de pantalla de la consola & txt 
		----------------------------------------------------------------------------
		CONSOLE OUTPUT:
		
		Bienvenid@ a tu numero de la suerte! 
		
		INPUT:
		Fecha de nacimiento: 04/06/1992
		Nombre: Gustavo
		------------------
		INPUT:
		Fecha de nacimiento: 01/01/1999
		Nombre: Jonathan
		------------------
		INPUT:
		Fecha de nacimiento: 01/01/1998
		Nombre: Messi
		------------------
		INPUT:
		Fecha de nacimiento: 01/01/1990
		Nombre: Cristiano Ronaldo
		------------------
		INPUT:
		Fecha de nacimiento: 27/06/1987
		Nombre: Antonela
		
		SALIDA DEL PROGRAMA: TXT
		Fecha de nacimiento 04/06/1992 Gustavo Numero de la suerte = 31
		Fecha de nacimiento 01/01/1999 Jonathan Numero de la suerte = 30
		Fecha de nacimiento 01/01/1998 Messi Numero de la suerte = 28
		Fecha de nacimiento 01/01/1990 Cristiano Ronaldo Numero de la suerte = 21
		Fecha de nacimiento 27/06/1987 Antonela Numero de la suerte = 40
		 */
		
		Usuario u = new Usuario("alex","10/04/2000");
		Usuario u2 = new Usuario("paco","01/11/2001");
		Usuario u3 = new Usuario("manolo","23/03/1099");
		Usuario u4 = new Usuario("jose","13/12/2003");
		Usuario u5 = new Usuario("pedro","05/05/2005");
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		lista.add(u);
		lista.add(u2);
		lista.add(u3);
		lista.add(u4);
		lista.add(u5);

		System.out.println(lista.toString());
	}
}
