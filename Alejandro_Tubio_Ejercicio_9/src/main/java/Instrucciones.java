import java.io.FileWriter;
import java.io.IOException;

public class Instrucciones implements Interfaz{
	private String receta = "Para empezar pondremos un buen chorro de aceite a la Paella y una vez caliente agregaremos el marisco: gambas, cigalas y almejas –que previamente habremos limpiado con agua-, cuando estén dorados los retiramos y reservamos aparte.\r\n"
			+ "Seguidamente cocinaremos la sepia troceada, hasta que quede dorada. La retiraremos y la reservaremos.receta paella\r\n"
			+ "A continuación, sofreímos la cebolla y el ajo bien picaditos y el pimiento cortado a tiras. Dejaremos que se sofría bien, hasta que quede blandito, y retiraremos sólo el pimiento. En esta parte, agregaremos también la tinta de la sepia para que la preparación coja más sabor de pescado.\r\n"
			+ "Añadimos los tomates rallados y vamos mezclando hasta que estén cocinados.\r\n"
			+ "Es el momento de poner el arroz. Lo iremos removiendo durante un rato. La idea es que quede bien impregnado de la salsa para que tenga más sabor. Pasados unos minutos añadiremos el caldo de pescado, la sal y el azafrán.\r\n"
			+ "Agregaremos el resto de los ingredientes que habíamos retirado, de manera bonita y ordenada –como ejemplo tenéis la foto– a partir de este momento ya no removeremos más los ingredientes.\r\n"
			+ "Subimos el fuego a nivel alto hasta que empiece a hervir y una vez hierva el agua, lo mantendremos a fuego lento durante unos 20 minutos.\r\n"
			+ "Retirar la paella del fuego y dejar reposar 5 minutos antes de servir.\r\n"
			+ "Puedes cortar unos gajos de limón y ponerlos alrededor de la paella, esto le dará un toque fresco y una nota de color a la presentación de tu plato.";

	public Instrucciones(String receta) {
		super();
		this.receta = receta;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	@Override
	public String toString() {
		return "Instrucciones [receta=" + receta + "]";
	}

	public void preparaPaella() {
		try {
		      FileWriter escritor = new FileWriter("receta.txt");
		      escritor.write(receta);
		      escritor.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}
	
}
