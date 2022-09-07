import java.io.FileWriter;
import java.io.IOException;

public class Instrucciones implements Interfaz{
	private String receta = "Para empezar pondremos un buen chorro de aceite a la Paella y una vez caliente agregaremos el marisco: gambas, cigalas y almejas �que previamente habremos limpiado con agua-, cuando est�n dorados los retiramos y reservamos aparte.\r\n"
			+ "Seguidamente cocinaremos la sepia troceada, hasta que quede dorada. La retiraremos y la reservaremos.receta paella\r\n"
			+ "A continuaci�n, sofre�mos la cebolla y el ajo bien picaditos y el pimiento cortado a tiras. Dejaremos que se sofr�a bien, hasta que quede blandito, y retiraremos s�lo el pimiento. En esta parte, agregaremos tambi�n la tinta de la sepia para que la preparaci�n coja m�s sabor de pescado.\r\n"
			+ "A�adimos los tomates rallados y vamos mezclando hasta que est�n cocinados.\r\n"
			+ "Es el momento de poner el arroz. Lo iremos removiendo durante un rato. La idea es que quede bien impregnado de la salsa para que tenga m�s sabor. Pasados unos minutos a�adiremos el caldo de pescado, la sal y el azafr�n.\r\n"
			+ "Agregaremos el resto de los ingredientes que hab�amos retirado, de manera bonita y ordenada �como ejemplo ten�is la foto� a partir de este momento ya no removeremos m�s los ingredientes.\r\n"
			+ "Subimos el fuego a nivel alto hasta que empiece a hervir y una vez hierva el agua, lo mantendremos a fuego lento durante unos 20 minutos.\r\n"
			+ "Retirar la paella del fuego y dejar reposar 5 minutos antes de servir.\r\n"
			+ "Puedes cortar unos gajos de lim�n y ponerlos alrededor de la paella, esto le dar� un toque fresco y una nota de color a la presentaci�n de tu plato.";

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
