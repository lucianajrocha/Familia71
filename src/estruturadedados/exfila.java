package estruturadedados;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exfila {
    public static void main(String[] args) {
        Queue<String> clienteBanco = new LinkedList<String>();
        Scanner ler = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n***************************");
            System.out.println("\n(1) Adicionar Cliente na Fila");
            System.out.println("\n(2) Listar todos os Clientes");
            System.out.println("\n(3) Retirar Cliente da Fila");
            System.out.println("\n(0) Sair");
            System.out.println("\n***************************");
            System.out.println("\n Entre com a opção desejada: ");

            op = ler.nextInt();

            switch (op) {

                case 1:
                    ler.nextLine();
                    System.out.println("Digite um nome: ");
                    clienteBanco.add(ler.nextLine());
                    System.out.println("Cliente adicionado!");
                    break;

                case 2:
                    System.out.println("Lista de Clientes na Fila:");
                    System.out.println(clienteBanco);
                    break;

                case 3:
                    ler.nextLine();
                    if (clienteBanco.isEmpty()) {
                        System.out.println("A Fila está vazia!\n");
                    } else {

                        String remove = clienteBanco.remove();
                        System.out.println("\nFila: " + "\n Nome:");
                        System.out.println(clienteBanco);
                        System.out.println(("\nO cliente foi chamado!"));

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

