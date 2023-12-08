package lacosrepeticao;

import java.util.Scanner;

public class Exercicio1 {


	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int contador;
		int numero1;
		int numero2;

		System.out.print("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		System.out.print("Digite o último número do intervalo: ");
		numero2 = leia.nextInt();

		if (numero1 < numero2) {
			System.out.println("No intervalo entre " + numero1 + " e " + numero2 + ": \n");
			for (contador = numero1; contador <= numero2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é múltiplo de 3 e 5");
				}
			}

		} else {
			System.out.print("Intervalo inválido!");

		}

	}

}
