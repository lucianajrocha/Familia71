package DeclaracoesCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
			
		
		int valorA,valorB,valorC;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A:");
		valorA = leia.nextInt();
		System.out.println("Digite o número B:");
		valorB = leia.nextInt();
		System.out.println("Digite o número C:");
		valorC = leia.nextInt();
		
		if(valorA+valorB > valorC) {
			System.out.println("A soma de A+B é maior que C");
		}else if (valorA+valorB < valorC) {
			System.out.println("A soma de A+B é menor que C");
		}else {
			System.out.println("A soma de A+B é igual a C");
		}
		


	}

}
