import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        int dia;
        int mes;
        int somaDias = 0;
        int[] vetorMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o dia:");
        dia = leitor.nextInt();
        System.out.println("Digite o número do mês:");
        mes = leitor.nextInt();

        for (int i = 0; i < mes - 1; i++){
            somaDias += vetorMes[i];
        }
        somaDias += dia;
        System.out.printf("O dia %d/%d corresponde ao dia %d do ano.", dia, mes, somaDias);

    }
}
