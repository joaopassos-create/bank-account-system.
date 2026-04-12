import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double num1 = leitor.nextDouble();
		
		
		System.out.println("Digite a operação (+, -, *, /): ");
		char operacao = leitor.next().charAt(0);

		System.out.println("Digite o segundo número: ");
		double num2 = leitor.nextDouble();
		
	
		double resultado = 0;
		
		switch (operacao) {
		case '+':
			resultado = num1 + num2;
			break;
			
		case '-':
			resultado = num1 - num2;
			break;
			
		case '*':
			resultado = num1 * num2;
			break;
			
		case '/':
			resultado = num1 / num2;
			break;
			default:
				
				System.out.println("Operação inválida! ");
			
		}
			
		System.out.println("Resultado: " + resultado);

			leitor.close();
		}

	}


