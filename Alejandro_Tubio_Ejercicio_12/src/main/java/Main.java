import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		/*
		 * Generar una lista de 10 valores enteros comprendidos entre 1 y 100. Validar que no se repitan, 
		 * para esto utilizar la ayuda de una de las colecciones de conjuntos visto en este concepto.
		 */
		
		//List<String> numeros = new ArrayList<String>();
		Set<String> numeros = new HashSet<String>();
		
		Random ran = new Random();
		
		// genera numero aleatorio de 1 a 100
        int numero;
        
        //int numero2;
        byte cont = 10;
        
		// hago el bucle, se repita mientras cont sea distinto de 0
        while(cont != 0) {
        	
        	numero = ran.nextInt(100+1);
        	
        	// si los numeros son distintos, 
        	if(!numeros.contains(numero)) {
        		numeros.add(numero+"");
        		System.out.println(numeros);
        		cont --;
        	}
        }
	}
}
