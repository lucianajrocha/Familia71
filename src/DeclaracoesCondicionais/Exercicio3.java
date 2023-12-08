package DeclaracoesCondicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		int idade;
		String nome;
		boolean primeiraDoacao;
		
		
		
		// entre 18 e 69 anos
		// 60 e 69 só podem doar se não for sua primeira doação

		System.out.println("Digite o Nome do doador:");
		nome = leitor.nextLine();
		System.out.println("Digite a Idade do doador:");
		idade = leitor.nextInt();
		System.out.println("Primeira doação de sangue?");
		primeiraDoacao = leitor.nextBoolean();
		
		
		if(idade >=60 && idade <=69 && true) {
			System.out.println(nome + "não está apto para doar sangue!");
			} 
		if(idade >=18 && idade <=69 && true) {
			System.out.println(nome + " está apto para doar sangue!");
		} 
		if (idade <= 18 && true)
		  {
				System.out.println(nome + " não está apta para doar sangue");
			} 
		
	
			
		}
	}


