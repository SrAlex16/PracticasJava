package clases;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(1000000 + 1);
		int respuesta;
		byte intentos = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("ADIVINA EL NUMERO: ");
			respuesta = sc.nextInt();
			if (respuesta == num) {
				System.out.println("ADIVINASTE CAMPEÓN");
			}
		} while (respuesta != num && intentos < 5);
		if (intentos >= 5) {
			System.out.println("HAS PERDIDO");
		}
	}

}
