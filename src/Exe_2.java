import java.util.Scanner;

public class Exe_2 {

	// Ler um n�mero e imprimir se ele � par ou �mpar 
	

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
