package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class expilha {
    public static void main(String[] args) {
        Stack<String> pilhaLivro = new Stack<String>();
        Scanner ler = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n***************************");
            System.out.println("\n(1) Adicionar Livro na Pilha");
            System.out.println("\n(2) Listar todos os Livros");
            System.out.println("\n(3) Retirar Livro da Pilha");
            System.out.println("\n(0) Sair");
            System.out.println("\n***************************");
            System.out.println("\n Entre com a opção desejada: ");

            op = ler.nextInt();

            switch (op) {

                case 1:
                    ler.nextLine();
                    System.out.println("Digite o nome: ");
                    pilhaLivro.push(ler.nextLine());
                    System.out.println("Livro adicionado!");
                    break;

                case 2:
                    System.out.println("Lista de Livros na Pilha:");
                    System.out.println(pilhaLivro);
                    break;

                case 3:
                    ler.nextLine();
                    if (pilhaLivro.empty()) {
                        System.out.println("A Pilha está vazia!\n");
                    } else {
                        String remove = pilhaLivro.pop();
                        System.out.println("\nPilha: ");
                        System.out.println(pilhaLivro);
                        System.out.println(("\nUm Livro foi retirado da pilha!"));
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!");

                default:
                    break;


            }
        } while (op != 0);
    }
}

