import java.util.Scanner;

public class ExercVetor3 {

    public static void exibeVetor(int[] v){
        for (int i = 0; i < v.length;i++){
            System.out.print("Posição:[" + i + "]= " + v[i] + "\t");
        }
        System.out.println();
    }

    public static void exibeVetorContrario(int[] v){
        for (int i = v.length - 1; i >= 0; i--){
            System.out.print("Posição:["+i+"]= "+v[i] +"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetorInt = new int[7];
        Scanner inputInt = new Scanner(System.in);
        int numeroDigitado;

        for(int i = 0; i < vetorInt.length;i++){
            System.out.println("Entre com 7 números ["+i+"]");
            vetorInt[i] = inputInt.nextInt();
        }
        System.out.println();
        exibeVetor(vetorInt);
        System.out.println("Exibindo ao contrário:");
        exibeVetorContrario(vetorInt);
    }
}
