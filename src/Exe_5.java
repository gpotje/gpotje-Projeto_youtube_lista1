import java.util.Scanner;

public class Exe_5 {

	// Ler um n�mero e imprimir se ele � par ou �mpar

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Double salarioBruto;
		Double presta��o;
		Double auxliar;

		System.out.println("Digite o valor do Salario Bruto.");
		salarioBruto = input.nextDouble();

		System.out.println("Digite o valor da presta��o.");
		presta��o = input.nextDouble();
		

		auxliar = salarioBruto * 0.30;
				
		if(presta��o >  auxliar ) {
			System.out.println("Empr�stimo n�o pode ser concedido.");
		}else {
			System.out.println("Parab�ns seu empr�stimo foi concedido.");
		}
		
		
		
		
	}

}
