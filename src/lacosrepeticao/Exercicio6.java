package lacosrepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		int numero = 0;
		float mediaMultiplos = 0;
		float totalSomaMultiplos = 0;
		int quantidade = 0;

		Scanner leitor = new Scanner(System.in);

		do {

			System.out.print("\nDigite um numero: ");
			numero = leitor.nextInt();

			if (numero % 3 == 0 && numero > 0) {
				quantidade += 1;
				totalSomaMultiplos += numero;

			}

		} while (numero != 0);

		mediaMultiplos = (totalSomaMultiplos/quantidade);
		System.out.println("\nA média de todos os números múltiplos de 3 é: " + mediaMultiplos);
	}

}
