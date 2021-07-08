import java.util.Scanner;

public class Exe_2 {

	// Ler um número e imprimir se ele é par ou ímpar 
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numero = 0;

		System.out.println("Digite um numero");
		numero = input.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

	}

}
