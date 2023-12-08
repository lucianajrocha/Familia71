package DeclaracoesCondicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade;
		String nome;
		boolean primeiraDoacao;


		System.out.print("Digite o Nome do doador: ");
		nome = leitor.nextLine();
		System.out.print("Digite a Idade do doador: ");
		idade = leitor.nextInt();
		System.out.print("Primeira doação de sangue? ");
		primeiraDoacao = leitor.nextBoolean();

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69) {
				if (primeiraDoacao) {
					System.out.println(nome + " não está apto para doar sangue!");
				} else {
					System.out.println(nome + " está apto para doar sangue!");
				}

			} else {
				System.out.println(nome + " está apto para doar sangue!");
			}

		} else {
			System.out.println(nome + " não está apto para doar sangue!");
		}
	}

}
