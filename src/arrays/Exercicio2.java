package arrays;

public class Exercicio2 {
    public static void main(String[] args) {

        int vetorNumero[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int somaNumeros = 0;
        float media = 0;


        for (int indice = 0; indice < 10; indice ++){
            System.out.print(" [ " + vetorNumero[indice] + " ] ");
        }

        System.out.print("Elementos nos índices ímpares: ");
        for (int indice = 0; indice < 10; indice++){
          if (indice % 2 != 0){
              System.out.print(" [ " + vetorNumero[indice] + " ] ");
          }
        }

        System.out.println("\n\n Elementos pares:\n");
        for (int indice = 0; indice < 10; indice++) {
            if (vetorNumero[indice] % 2 == 0) {
                System.out.println(vetorNumero[indice]);
            }

        } for(int indice = 0; indice < 10; indice++) {
            somaNumeros += vetorNumero[indice];
        }
        System.out.print("\n Soma: " + somaNumeros);
        media = (float) somaNumeros /10;
        System.out.print("\n Soma: " + media);




    }


}

