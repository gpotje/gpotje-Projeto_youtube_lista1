import java.util.Scanner;

public class Exe_7 {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		int x;

		System.out.println("Digite o valor de 'X' ");
		x = input.nextInt();

		if (x < 0) {
			System.out.println("loading...");
			Thread.sleep(800);
			System.out.println("Quando 'X' � menor que 0 o resultado da fun��o �:" + 0);

		} else if (x > 0 && x <= 10) {
			x++;
			System.out.println("loading...");
			Thread.sleep(800);
			System.out.println("Quando 'X' � Maior que 0 e menor ou igual a 10 resultado da fun��o �:" + x);
		} else {
			x = (x ^ 2) / 2;
			System.out.println("loading...");
			Thread.sleep(800);
			System.out.println("Quando 'X' � Maior que 10 e at� o infinito resultado da fun��o �:" + x);

		}

	}

}
