import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 *  Nos contrataron de una empresa que desea implementar la metodologia de Integración Continua. Para esto, nos piden que desarrollemos un programa en Java que implemente un jenkinsfile
			Ademas de eso, quieren que contabilicemos el TOP 20 de peliculas con mayor recaudación de LA HISTORIA. Para esto, nos dejaron un archivo con las 10 peliculas siguientes al top 10 con mayor recaudación
			en la historia. 
			
			Frozen II							$1,450,026,933
			Top Gun: Maverick						$1,442,160,961
			Avengers: Age of Ultron					$1,402,809,540
			Black Panther						$1,347,597,973
			Harry Potter and the Deathly Hallows: Part 2	$1,342,359,942
			Star Wars: Episode VIII - The Last Jedi		$1,332,698,830
			Jurassic World: Fallen Kingdom			$1,310,466,296
			Frozen							$1,281,508,100
			Beauty and the Beast					$1,273,576,220
			Incredibles 2						$1,243,089,244
			
			El archivo debe estar ordenado por recaudación (de mayor recaudación a menor recaudación) 
			
			En GitHub:
			Subir todo el proyecto de Java, una vez generados los TXTS. 
			
			En Jenkins:
			(SOBRE LA RAMA PRINCIPAL) 
			El jenkinsfile debe ser tomado del repositorio en Github. El contenido del mismo debe mostrar por consola (Consola de Jenkins) el siguiente mensaje:
			"Hola Mundo! EL día de hoy es elDia (variable que almacene la fecha).
			 Este curso me hizo programar mas de lo que me hubiese gustado" 
			
			¿COMO FUNCIONA ESTO? 
			1) Crear un nuevo proyecto en Eclipse "AA13 - Java integrado a Jenkins y Github"
			2) Desarrollar la estructura del programa. 
			3) Desarrollar el jenkinsfile. 
			4) Actualizar el repo desde Eclipse a Github
			5) Una vez actualizado el repo, configurar en jenkins la busqueda del jenkinsfile generado por el proyecto. 
			
			ENTREGABLES: 
			- Codigo del proyecto de Java. 
			- Captura de la pantalla de Java mostrando las 20 mejores peliculas
			- Captura de la pantalla de Jenkins
			- TXT de Salida de peliculas (Llamarlo "top20_mejores_peliculas.txt")
			
			¿COMO GENERAR EL JENKINSFILE? 
			Un jenkinsfile es un simple TXT. GENERAMOS UN TXT Y LE INSERTAMOS EL CODIGO QUE ESPERA JENKINS. 
		 */
		
		Pelicula p1 = new Pelicula("Avatar",2086889714);
		Pelicula p2 = new Pelicula("Aveners: Endgame",1939128328);
		Pelicula p3 = new Pelicula("Titanic",1542283320);
		Pelicula p4 = new Pelicula("Frozen II",1450026933);
		Pelicula p5 = new Pelicula("Top Gun: Maverick",1442160961);
		Pelicula p6 = new Pelicula("Black Panther",1347597973);
		Pelicula p7 = new Pelicula("Harry Potter and the Deathly Hallows: Part 2",1342359942);
		Pelicula p8 = new Pelicula("Avengers: Age of Ultron",1402809540);
		Pelicula p9 = new Pelicula("Star Wars: Episode VIII - The Last Jedi",1332698830);
		Pelicula p10 = new Pelicula("Jurassic World: Fallen Kingdom	",1310466296);
		Pelicula p11 = new Pelicula("Frozen",1281508100);
		Pelicula p12 = new Pelicula("Beauty and the Beast",1273576220);
		Pelicula p13 = new Pelicula("Incredibles 2",1243089244);
		Pelicula p14 = new Pelicula("Avengers: Infinity War",1369544272);
		Pelicula p15 = new Pelicula("Spider-Man: No Way Home",1099039073);
		Pelicula p16 = new Pelicula("Star Wars: Episode VII - The Force Awakens",1132859475);
		Pelicula p17 = new Pelicula("Furious 7",1162334379);
		Pelicula p19 = new Pelicula("Jurassic World",1018130819);
		Pelicula p18 = new Pelicula("The Lion King",1119612444);
		Pelicula p20 = new Pelicula("The Avengers",895457605);
		
		
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		peliculas.add(p1);
		peliculas.add(p2);
		peliculas.add(p3);
		peliculas.add(p4);
		peliculas.add(p5);
		peliculas.add(p6);
		peliculas.add(p7);
		peliculas.add(p8);
		peliculas.add(p9);
		peliculas.add(p10);
		peliculas.add(p11);
		peliculas.add(p12);
		peliculas.add(p13);
		peliculas.add(p14);
		peliculas.add(p15);
		peliculas.add(p16);
		peliculas.add(p17);
		peliculas.add(p18);
		peliculas.add(p19);
		peliculas.add(p20);
		
		System.out.println(peliculas.toString()+"\t");
		Pelicula.EscribirFichero(peliculas);
		
		
	}

}
