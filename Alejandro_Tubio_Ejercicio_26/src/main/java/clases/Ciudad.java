package clases;

import java.io.FileWriter;
import java.io.IOException;

import enums.TIPO_CHOCOLATE;

public class Ciudad extends Temperatures {

	public Ciudad(float max, float min) {
		super(max, min);

	}

	public static void produccionActiva() throws IOException {
		FileWriter escritor = new FileWriter("jenkins.jenkinsfile");
		
		
		if ((getMax() >= 40) || getMin() >= 40) {
			System.out.println("no se hacen chocolates");
		} else {
			System.out.println("si se hacen chocolates");
			Chocolate cb = new Chocolate(TIPO_CHOCOLATE.BLANCO.toString(), 1000);
			Chocolate cn = new Chocolate(TIPO_CHOCOLATE.NEGRO.toString(), 1500);
			Chocolate ca = new Chocolate(TIPO_CHOCOLATE.CON_ALMENDRAS.toString(), 1200);
			Chocolate cc = new Chocolate(TIPO_CHOCOLATE.CON_CASTANAS.toString(), 1300);
			Chocolate c70 = new Chocolate(TIPO_CHOCOLATE.ALTO_PORCENTAJE_CACAO.toString(), 1500);

			System.out.println(cb);
			System.out.println(cn);
			System.out.println(ca);
			System.out.println(cc);
			System.out.println(c70);
			
			escritor.write(cb.toString());
			escritor.write(cn.toString());
			escritor.write(ca.toString());
			escritor.write(cc.toString());
		    escritor.write(c70.toString());
		    
		    escritor.close();
		}
	}
}
