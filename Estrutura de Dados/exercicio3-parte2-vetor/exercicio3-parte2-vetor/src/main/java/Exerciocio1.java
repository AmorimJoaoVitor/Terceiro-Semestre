import java.util.Scanner;

public class Exerciocio1 {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        int[] vetorInts = new int[10];
        int numeroDigitado;
        int somaNumerosVetor = 0;
        int media;

        for (int i = 0; i < vetorInts.length; i++){
            System.out.println("Posição: [" + (i+1) + "]");
            vetorInts[i] = inputInt.nextInt();
        }

        for (int i = 0; i < vetorInts.length; i++){
            somaNumerosVetor += vetorInts[i];
        }
        System.out.println(somaNumerosVetor);
        media = somaNumerosVetor / 10;

        System.out.println("Media numeros vetor = "+ media);
    }
}
