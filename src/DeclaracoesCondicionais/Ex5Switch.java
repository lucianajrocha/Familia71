package DeclaracoesCondicionais;

import java.util.Scanner;

public class Ex5Switch { 
	public static void main(String[] args) {
		int codigoProduto, quantidade;
		float precoCachorro = 10;
		float precoSalada = 15;
		float precoBacon = 18;
		float precoBauru = 12;
		float precoRefrigerante = 8;
		float precoSucoLaranja = 13;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n1- Cachorro - Quente");
		System.out.println("\n2- X-Salada");
		System.out.println("\n3- X-Bacon");
		System.out.println("\n4- Bauru");
		System.out.println("\n5- Refrigerante");
		System.out.println("\n6- Suco de Laranja");

		System.out.print("\nDigite a sua opção: ");

		codigoProduto = ler.nextInt();
		
		
		switch(codigoProduto) {
		case 1:
			System.out.println("\nProduto: Cachorro-Quente ");
			System.out.print("\nQuantidade:");
			quantidade = ler.nextInt();
			System.out.println("\nValor Total: R$" + (precoCachorro * quantidade));		
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.print("\nQuantidade:");
			quantidade = ler.nextInt();
			System.out.println("\nValor Total: R$" + (precoSalada * quantidade));
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			System.out.print("\nQuantidade:");
			quantidade = ler.nextInt();
			System.out.println("\nValor Total: R$" + (precoBacon * quantidade));
			break;
		case 4:
			System.out.println("\nProduto:  Bauru ");
			System.out.print("\nQuantidade:");
			quantidade = ler.nextInt();
			System.out.println("\n Valor Total: R$" + (precoBauru * quantidade));
			break;
		case 5:
			System.out.println("\nProduto: Refrigerante");
			System.out.print("\nQuantidade:");
			quantidade = ler.nextInt();
			System.out.println("\n Valor Total: R$" + (precoRefrigerante * quantidade));
			break;
		case 6:
			System.out.println("\nProduto: Suco de Laranja");
			System.out.print("\nQuantidade:");
			quantidade = ler.nextInt();
			System.out.println("\n Valor Total: R$" + (precoSucoLaranja * quantidade));
			break;
			default:
				System.out.println("\nOpção Inválida!");

		}
		
	}
	
}

