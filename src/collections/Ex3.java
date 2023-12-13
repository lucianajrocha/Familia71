package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Set<Integer> meuSet = new HashSet<Integer>();

        System.out.println("\nDigite 10 valores inteiros e não repita nenhum: \n");

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            int valores = leia.nextInt();
            meuSet.add(valores);
        }
        Iterator<Integer> iMeuSet = meuSet.iterator();
        System.out.println("\nListar dados no Set com Iterator: \n");
        while (iMeuSet.hasNext()) {
            System.out.println(iMeuSet.next());
        }

        leia.close();

    }
}

