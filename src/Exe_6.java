import java.util.Scanner;

public class Exe_6 {

	// Ler um n�mero e imprimir se ele � par ou �mpar

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		Double valorTotalDeCompras;
		String verificacao;
		
		System.out.println("Digite o valor total de Compras");
		valorTotalDeCompras = input.nextDouble();

		System.out.println("Se for cliente digite 'c' se n�o digite 'f' para funcionario");
		verificacao = input.next();
		
		if(verificacao.equals("c") || verificacao.equals("C")) {
				Thread.sleep(800);
				valorTotalDeCompras -=  (valorTotalDeCompras * 0.10);
				System.out.println("ol� Jaiminho , seu desconto foi de 10% :" + valorTotalDeCompras);
			
		}else if(verificacao.equals("f") || verificacao.equals("F")) {
				Thread.sleep(800);
				valorTotalDeCompras -= (valorTotalDeCompras * 0.05);
				System.out.println("ol� funcion�rio, seu desconto foi de 5% :" + valorTotalDeCompras);
			
		}else {
			Thread.sleep(400);
			System.out.println("Erro !! foi digitado uma tecla inv�lida ");
		}

			
		
		
	}

}
