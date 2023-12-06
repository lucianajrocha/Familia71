package ExerciciosVariaveisOperadores;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in); 

		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("O salário líquido é: " + salarioLiquido);
	}
}

