
public class Main {

	public static void main(String[] args) {
		/*
		 * Desarrollar un programa que genere informaci�n relevante a tu ciudad actual. Datos relevantes del tipo:
			- Clima
			- Cantidad de habitantes actuales.
			
			- Cotizaci�n de distintas monedas como el Euro, Pesos Argentino, Dolares Estadounidenses
			
			ESTRUCTURA DEL PROGRAMA:
			- Contar con una interfaz que genere la informaci�n de las divisas
			- Contar con una clase que se llame monedas 
			- Contar con una clase que tenga informaci�n de tu ciudad.
			
			ENTREGABLES:
			- Jar File y codigo del proyecto.
		 */
		
		Moneda m = new Moneda(1.01f, "dollar");
		Ciudad c = new Ciudad(m.getValor(), m.getNombre(), "soleado", 45000);
		System.out.println(m.toString()+c.toString());
		
	}

}
