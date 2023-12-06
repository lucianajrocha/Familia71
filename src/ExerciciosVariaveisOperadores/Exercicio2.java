package ExerciciosVariaveisOperadores;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in); 
	
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Digite a sua primeira nota:");
		nota1 = leia.nextFloat();
		System.out.println("Digite a sua segunda nota:");
		nota2 = leia.nextFloat();
		System.out.println("Digite a sua terceira nota:");
		nota3 = leia.nextFloat();
		System.out.println("Digite a sua quarta nota:");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A sua média final é: " + mediaFinal);
	
}
	

}
