package lacosrepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		int numero = 0;
		int somaNumeros = 0;

		Scanner leitor = new Scanner(System.in);

		do {

			System.out.println("\nDigite um numero: ");
			numero = leitor.nextInt();
			if (numero > 1) {
				somaNumeros += numero;
			}

		} while (numero != 0);

		System.out.println("\nA soma dos números positivos é: " + somaNumeros);

	}

}