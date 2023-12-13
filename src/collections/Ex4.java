package collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Set<Integer> meuSet = new HashSet<Integer>();

        meuSet.add(2);
        meuSet.add(5);
        meuSet.add(1);
        meuSet.add(3);
        meuSet.add(4);
        meuSet.add(9);
        meuSet.add(7);
        meuSet.add(8);
        meuSet.add(10);
        meuSet.add(6);


        System.out.println(meuSet);

        System.out.println("\nDigite o numero que você deseja encontrar: ");
        int verifica = ler.nextInt();

        if(meuSet.contains(verifica)) {
            System.out.println("\n O número " + verifica + " foi encontrado!");
        }else {
            System.out.println("\nO número " + verifica + " não foi encontrado!");
        }

    }
}
