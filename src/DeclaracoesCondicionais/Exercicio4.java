package DeclaracoesCondicionais;

import java.util.Scanner;
	
public class Exercicio4 {
	
	//Utilize o Método String.equals() ou String.equalsIgnoreCase() para comparar as palavras


	public static void main(String[] args) {
	
		Scanner leitor = new Scanner (System.in);
		
		String tipo1,tipo2,tipo3;


		System.out.println("Escolha entre invertebrado e vertebrado");
		tipo1 = leitor.nextLine();

		if (tipo1.equals("vertebrado")){
			System.out.println("Escolha entre mamífero e ave");
		}

		System.out.println("");
		tipo2 = leitor.nextLine();

		System.out.println();
		tipo3 = leitor.nextLine();
		
	
	}
}