import java.util.Scanner;

public class Exe_4 {

	// Ler um n�mero e imprimir se ele � par ou �mpar

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
			System.out.println("Adi��o + 8: " + soma);
		} else {
			soma -= 5;
			System.out.println("subtra��o - 5: " + soma);
		}

	}

}
