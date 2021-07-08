import java.util.Scanner;

public class Exe_4 {

	// Ler um número e imprimir se ele é par ou ímpar

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int soma = 0;

		System.out.println("Digite o valor do primeiro numero");
		n1 = input.nextInt();

		System.out.println("Digite o valor do segundo numero");
		n2 = input.nextInt();

		soma = n1 + n2;

		if (soma > 20) {
			soma += 8;
			System.out.println("Adição + 8: " + soma);
		} else {
			soma -= 5;
			System.out.println("subtração - 5: " + soma);
		}

	}

}
