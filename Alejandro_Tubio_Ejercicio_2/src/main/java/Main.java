import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		System.out.println("Elige una opción \t\n 1- Sumar \t\n 2- Restar \t\n 3- Multiplicar \t\n 4- Dividir");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		int num1;
		int num2;
		switch(opcion) {
		case 1:
			opcion = 1;
			System.out.println("SUMAR: Indica dos números");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("RESULTADO:");
			System.out.println(num1+num2);
			break;
		case 2:
			opcion = 2;
			System.out.println("RESTAR: Indica dos números");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("RESULTADO:");
			System.out.println(num1-num2);
			break;
		case 3:
			opcion = 3;
			System.out.println("MULTIPLICAR: Indica dos números");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("RESULTADO:");
			System.out.println(num1*num2);
			break;
		case 4:
			opcion = 4;
			System.out.println("DIVIDIR: Indica dos números");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 == 0 || num2 == 0) {
				System.out.println("ERROR: No se puede dividir entre 0");
				break;
			}
			System.out.println("RESULTADO:");
			System.out.println(num1/num2);
			break;
		}
	}
}
