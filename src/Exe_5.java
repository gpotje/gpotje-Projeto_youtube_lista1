import java.util.Scanner;

public class Exe_5 {

	// Ler um número e imprimir se ele é par ou ímpar

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Double salarioBruto;
		Double prestação;
		Double auxliar;

		System.out.println("Digite o valor do Salario Bruto.");
		salarioBruto = input.nextDouble();

		System.out.println("Digite o valor da prestação.");
		prestação = input.nextDouble();
		

		auxliar = salarioBruto * 0.30;
				
		if(prestação >  auxliar ) {
			System.out.println("Empréstimo não pode ser concedido.");
		}else {
			System.out.println("Parabéns seu empréstimo foi concedido.");
		}
		
		
		
		
	}

}
