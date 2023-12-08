package lacosrepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		int numero;
		int contador;
		int totalPar = 0; 
		int totalImpar = 0;

		for(contador = 0; contador <10; contador++) {
		System.out.print("Digite o " + (contador + 1) +  "º número: ");
			numero = leia.nextInt();
			if(numero%2 == 0) {
				totalPar += 1;
			} else {
				totalImpar += 1;
			}
			
		} 	
		System.out.println("Total de pares: " + totalPar);
	 	System.out.println("Total de ímpares: " + totalImpar);

		
	}

}
