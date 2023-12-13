package exemplosdaula;

import java.util.*;

public class colecao1 {
    public static void main(String[] args) {

        List<Integer> minhaLista = new ArrayList<Integer>();

        //List é uma collection que vai fazer toda a manipulação dos dados
        //através de uma estrutura de dados do tipo lista
        //Integer é um objeto da classe Wrapper que vai substituir um dado do
        //tipo primitivo (int, float, double, etc...)

        minhaLista.add(2);//add --> adiciona valores para o ArrayList
        minhaLista.add(1);
        minhaLista.add(5);
        minhaLista.add(8);
        minhaLista.add(2);
        minhaLista.add(1);
        minhaLista.add(3);

        for(Integer rodolfo:minhaLista) {
            System.out.println(rodolfo);
        }

        System.out.println("\nRemovendo um elemento da lista");
        System.out.println();
        minhaLista.remove(0);

        for(Integer rodolfo:minhaLista) {
            System.out.println(rodolfo);
        }

        int primeiroElemento = minhaLista.get(0);
        System.out.println("\nO primeiro elemento é: "+primeiroElemento);

        System.out.println();

        for(int i=0;i<minhaLista.size();i++) {
            System.out.println("\nelemento: "+minhaLista.get(i));
        }

        Collections.sort(minhaLista);

        System.out.println("\nDepois de ordenado...");
        System.out.println(minhaLista);
        System.out.println();

        Set<Integer> meuSet = new HashSet<Integer>();

        meuSet.add(4);
        meuSet.add(1);
        meuSet.add(2);
        meuSet.add(1);
        meuSet.add(2);
        meuSet.add(0);

        Iterator<Integer> iMeuSet = meuSet.iterator();

        while(iMeuSet.hasNext()) {
            System.out.println(iMeuSet.next());
        }



    }
}
