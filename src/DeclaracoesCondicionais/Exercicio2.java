package DeclaracoesCondicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		int numero;
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite um número:");
		numero = leitor.nextInt();
		
		if(numero%2 == 0 && numero >=0) {
			System.out.println("O Número " + numero+ " é par e positivo!");
		} else if (numero%2 ==0 && numero<0) {
			System.out.println("O Número " + numero+ " é par e negativo!");
		} else if (numero%2 !=0 && numero >=1) {
			System.out.println("O Número " + numero+ " é ímpar e positivo!");
		} else {
			System.out.println("O Número " + numero+ " é ímpar e negativo!");

		}

	}

	}


