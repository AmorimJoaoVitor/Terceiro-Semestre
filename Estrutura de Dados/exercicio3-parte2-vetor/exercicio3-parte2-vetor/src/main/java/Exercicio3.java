import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] rendimentos = new int[5];
        String[] carros = new String[5];
        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int max = 0;
        int indice = 0;

        for (int i = 0; i < rendimentos.length; i++){
            System.out.println("Digite rendimento da posição ["+ (i+1) +"]");
            rendimentos[i] = inputInt.nextInt();
            if (rendimentos[i] > max){
                max = rendimentos[i];
                indice = i;
            }
        }
        System.out.println();

        for (int i = 0; i < carros.length; i++){
            System.out.println("Digite carro da posição ["+ (i+1) +"]");
            carros[i] = inputString.nextLine();
        }
        System.out.println();

        // pegando o máximo
        System.out.println("carro com maior rendimento: "+carros[indice]+" consumindo "+ rendimentos[indice]+ " km por litro");
    }
}
