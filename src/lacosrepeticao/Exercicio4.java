package lacosrepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);

		int idade, genero, categoria, back, front, mobile, fullstack;
		
		String continua = "S";
		
		while (continua == "S") {
			System.out.println("Digite a idade: ");
			idade = leitor.nextInt();
			
			System.out.println("Digite a idade: ");
			genero = leitor.nextInt();
			
			while(genero < 1 || genero > 6) {
				//system digite o sexo
			}
			
			
		}
	}

}
