package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);


        System.out.println(numeros);

        System.out.println("\nDigite o numero que você deseja encontrar: ");
        int verifica = ler.nextInt();

        if(numeros.contains(verifica)) {
            System.out.println("\n O número " + verifica + " está localizado na posição: " + numeros.indexOf(verifica));
        }else {
            System.out.println("\nO número " + verifica + " não foi encontrado!");
        }











    }
}
