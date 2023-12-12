package arrays;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float numeros[][] = new float[10][4];
        int linha, coluna;
        float medias[] = new float[10];


        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < 4; coluna++) {
                System.out.println(" Digite a nota do participante " + (linha + 1) + " no " + (coluna + 1) + "° bimestre");
                numeros[linha][coluna] = leia.nextFloat();

            }
        }
        for (linha = 0; linha < 10; linha++) {
            float somaDasNotas = 0;
            for (coluna = 0; coluna < 4; coluna++) {
             somaDasNotas += numeros[linha][coluna];
            }
             medias[linha] = somaDasNotas/4;
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Médias do participante " + (i+1) + ": " + medias[i]);
        }

    }
}

