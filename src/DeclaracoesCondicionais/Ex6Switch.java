package DeclaracoesCondicionais;

import java.util.Scanner;

public class Ex6Switch {
    public static void main(String[] args) {
        String nome;
        int cargo;
        int cargoColaborador = 0;
        float salario;
//Novo Salário = salário + (reajuste  * salário)

        Scanner leitor = new Scanner(System.in);
        System.out.print("Nome do colaborador: ");
        nome = leitor.nextLine();
        System.out.print("\nCargo:");
        cargoColaborador = leitor.nextInt();
        System.out.print("\nSalário:");
        salario = leitor.nextFloat();


        switch (cargoColaborador) {

            case 1:

                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: Gerente");
                System.out.println("Salário: " + (salario + (10 * salario)));

                break;

            case 2:


        }

    }


}
