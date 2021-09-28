import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetorInts = new int[10];
        Scanner inputInt = new Scanner(System.in);
        int numeroPesquisado, contador = 0;

        for (int i = 0; i < vetorInts.length; i++){
            System.out.println("Posição: ["+ (i+1) +"]");
            vetorInts[i] = inputInt.nextInt();
        }
        System.out.println();
        System.out.println("Pesquise por um número");
        numeroPesquisado = inputInt.nextInt();

        for (int i = 0; i < vetorInts.length; i++){
            if (vetorInts[i] == numeroPesquisado){
                contador++;
            }
        }
        System.out.println("O numero " +numeroPesquisado+ " apareceu "+ contador+" vezes no vetor");
    }
}
