import java.util.Scanner;

public class Exe_6 {

	// Ler um número e imprimir se ele é par ou ímpar

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		Double valorTotalDeCompras;
		String verificacao;
		
		System.out.println("Digite o valor total de Compras");
		valorTotalDeCompras = input.nextDouble();

		System.out.println("Se for cliente digite 'c' se não digite 'f' para funcionario");
		verificacao = input.next();
		
		if(verificacao.equals("c") || verificacao.equals("C")) {
				Thread.sleep(800);
				valorTotalDeCompras -=  (valorTotalDeCompras * 0.10);
				System.out.println("olá Jaiminho , seu desconto foi de 10% :" + valorTotalDeCompras);
			
		}else if(verificacao.equals("f") || verificacao.equals("F")) {
				Thread.sleep(800);
				valorTotalDeCompras -= (valorTotalDeCompras * 0.05);
				System.out.println("olá funcionário, seu desconto foi de 5% :" + valorTotalDeCompras);
			
		}else {
			Thread.sleep(400);
			System.out.println("Erro !! foi digitado uma tecla inválida ");
		}

			
		
		
	}

}
