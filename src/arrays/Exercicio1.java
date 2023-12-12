package arrays;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        int vetorDeNumeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int indice, numero;
        int posicaoNumero = -1;
        Scanner leitor = new Scanner(System.in);

       for (indice = 0; indice < 10; indice++) {
          System.out.print("[ " + vetorDeNumeros[indice] + " ] ");
       }
        System.out.println("\nDigite o número que você deseja encontrar: \n");
        numero = leitor.nextInt();

        for (indice = 0; indice < 10; indice++) {
            if (vetorDeNumeros[indice] == numero) {
                posicaoNumero = indice;
            }
        }

        if (posicaoNumero == -1) {
            System.out.println("O número " + numero + " não foi encontrado!");
        } else {
            System.out.println("O número " + numero + " está localizado na posição: " + posicaoNumero);
        }
    }
}




