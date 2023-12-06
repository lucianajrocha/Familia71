package JavaNaVeia;// ; finaliza uma linha de execução

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in); 
				
		String nome = "Luciana Rocha";
		int idade = 26;
		float altura = (float) 1.60;
		
		System.out.println("\n\tMeu nome é: " + nome);
		System.out.println("\n\tEu tenho: " +idade+ " ano(s) de vida");
		System.out.println("\n\tMinha altura é: " + altura);
		
		System.out.println("\nEntre com o seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nEntre com a sua altura: ");
		altura = leia.nextFloat();
		
		System.out.println("\n\tMeu nome é: " + nome);
		System.out.println("\n\tEu tenho: " +idade+ " ano(s) de vida");
		System.out.println("\n\tMinha altura é: " + altura);
		
		
	}

}
