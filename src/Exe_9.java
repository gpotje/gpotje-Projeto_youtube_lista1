import java.util.Scanner;

public class Exe_9 {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		Double trabalhoEmLaboratorio;
		Double avaliacaoSemestral;
		Double exameFinal;
		Double media = null;

		System.out.println("Digite a nota do trabalho em labor�torio:");
		trabalhoEmLaboratorio = input.nextDouble();
		
		System.out.println("Digite a nota da Avalia��o semestral:");
		avaliacaoSemestral = input.nextDouble();
		
		System.out.println("Digite a nota do Exame final:");
		exameFinal = input.nextDouble();
	
		media = ((trabalhoEmLaboratorio * 2) + (avaliacaoSemestral * 3) + (exameFinal * 5)) 
				/ (1 + 3 + 5);
		
		if ( media >= 7.0 ) {
			System.out.println("loading...");
			Thread.sleep(800);
			System.out.println("O aluno em quest�o foi aprovado :)  com a m�dia: " + media);
			
		} else {
			System.out.println("loading...");
			Thread.sleep(800);
			System.out.println("O aluno em quest�o foi reprovado :(  com a m�dia: " + media);

		}

	}

}
