package lacosrepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade = 0;
		int totalMenorVinteUm = 0;
		int totalMaiorCinquenta = 0;

		while (idade >= 0) {
			System.out.print("\nDigite uma idade: ");
			idade = leia.nextInt();

			if (idade < 21 && idade > 0) {
				totalMenorVinteUm += 1;
			} else if (idade > 50) {
				totalMaiorCinquenta += 1;
			}
		}

		System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenorVinteUm);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + totalMaiorCinquenta);
	}

}
