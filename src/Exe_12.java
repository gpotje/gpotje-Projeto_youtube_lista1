import java.util.Scanner;

public class Exe_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		int n1 = 0;
		int n2 = 0;
		int resultado;
		int escolha = 0;
		
		System.out.println("Digite o 1° Número");
		n1 = input.nextInt();
		System.out.println("Digite o 2° Número");
		n2 = input.nextInt();
		
		System.out.print("##=================================================## \n");
		System.out.print("|| 1 - retornar o quociente inteiro de uma divisão || \n");
		System.out.print("|| 2 - retornar a multiplicação de dois números    || \n");
		System.out.print("|| 3 - retornar o soma de dois números             || \n");
		System.out.print("|| 4 – retornar a subtração de dois números        || \n");
		System.out.print("|| 5 – retornar mensagem de erro (opção inválida)  || \n");
		System.out.print("##=================================================## \n");
	
		escolha = input.nextInt();
		
		switch (escolha) {
		case 1: {
			resultado  =  (n1 / n2);
			System.out.println("divi :"+ resultado);
			break;
			
		}
		case 2: {
			resultado  =  (n1 * n2);
			System.out.println("mult : "+ resultado);
			break;
			
		}
		case 3: {
			resultado  =  (n1 + n2);
			System.out.println("Soma : "+ resultado);
			break;
			
		}	
		case 4: {
			resultado  =  (n1 - n2);
			System.out.println("Sub : "+ resultado);
			break;
			
		}
		
		default:
			System.out.println("Cara vc digitou errado");
		}


	}

}
