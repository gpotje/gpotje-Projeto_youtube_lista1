import java.util.Scanner;

public class Exe_8 {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		Double altura;
		Double Auxiliar;
		String sexo;

		System.out.println("Digite a altura do cidad�o:");
		altura = input.nextDouble();
		
		System.out.println("Digite a Sexo do cidad�o:");
		sexo = input.next();

		if (sexo.equals("M") || sexo.equals("m") ) {
			Auxiliar = (72.7 * altura) - 58;
			System.out.println("loading...");
			Thread.sleep(800);
			System.out.println("O peso ideal do cidad�o homem �:" + Auxiliar);

		} else if (sexo.equals("F") || sexo.equals("f")) {
			Auxiliar = (62.1 * altura) - 44.7;
			System.out.println("loading...");
			Thread.sleep(800);
			System.out.println("O peso ideal do cidad�o Mulher �:" + Auxiliar);
			
		} else {
			System.out.println("loading...");
			Thread.sleep(400);
			System.out.println("Erro !! foi digitado uma tecla inv�lida ");

		}

	}

}
