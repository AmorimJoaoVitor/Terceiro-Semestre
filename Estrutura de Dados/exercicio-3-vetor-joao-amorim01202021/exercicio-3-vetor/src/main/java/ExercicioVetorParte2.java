import java.util.Scanner;

public class ExercicioVetorParte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] vetorString = new String[10];
        String nomeDigitado;

        for (int i = 0; i < vetorString.length; i++){
            System.out.println("Digite 10 nomes [" + (i+1) +"]");
            vetorString[i] = input.nextLine();
        }
        System.out.println();
        System.out.println("Pesquise por um nome");
        nomeDigitado = input.nextLine();

        for (int i = 0; i < vetorString.length; i++){
            if (vetorString[i].equals(nomeDigitado)){
                System.out.println("Nome encontrado: " + vetorString[i]);
            }
        }
        System.out.println();

    }

}
