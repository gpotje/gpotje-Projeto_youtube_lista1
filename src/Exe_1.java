import java.util.Scanner;

public class Exe_1 {

	// Ler um n�mero e se ele for maior do que 20, ent�o imprimir a metade do
	// n�mero.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numero = 0;

		System.out.println("Digite um numero");
		numero = input.nextInt();

		if (numero > 20) {
			System.out.println("Metade de numero: " + numero / 2);
		} else {
			System.out.println("Numero completo: " + numero);
		}

	}

}
