import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {

    public static void gravaArquivoCsv(ListaObj<Cachorro> lista, String nomeArch) {
        FileWriter arq = null;
        Formatter saida = null;
        nomeArch += ".csv";
        Boolean deuRuim = false;

        try {
            arq = new FileWriter(nomeArch, true);
            saida = new Formatter(arq);
        }
        catch (IOException erro){
            System.out.println("Erro ao arir o arquivo");
            System.exit(1);

        }

        try {
            for (int i = 0; i < lista.getTamanho();i++){
                Cachorro dog = lista.getElemento(i);
                saida.format("%d;%s;%s;%.2f\n",dog.getId(),dog.getNome(),dog.getPorte(),dog.getPeso());
            }
        }
        catch (FormatterClosedException erro){
            System.out.println("Erro ao gravar arquivo");
            deuRuim = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro){
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCsv (String nomeArq) {
        FileReader arq = null; //objeto que representa o arquivo para leitura
        Scanner entrada = null;
        Boolean deuRuim = false;
        nomeArq += ".csv"; //Acrescenta a extensão .csv

        //Bloco try - catch para abrir o arquivo

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        //Bloco try-catch para ler do arquivo
        try {
            System.out.printf("%4s %-15s %-9s %4s\n", "ID","NOME","PORTE", "PESO");
            while (entrada.hasNext()){
                int id = entrada.nextInt();
                String nome = entrada.next();
                String porte = entrada.next();
                Double peso = entrada.nextDouble();
                System.out.printf("%4d %-15s %-9s %4.1f\n", id,nome,porte,peso);

            }
        }

        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            deuRuim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        }
        finally {
            entrada.close();
        }
        try {
            arq.close();
        }
        catch (IOException erro){
            System.out.println("Erro ao fechar arquivo");
        }
        if (deuRuim){
            System.exit(1);
        }

    }

    public static void main(String[] args) {
        ListaObj<Cachorro> listaDog = new ListaObj(7);

        listaDog.adiciona(new Cachorro(1, "Marley", "Medio", 54.2));
        listaDog.adiciona(new Cachorro(2, "Serginho", "Grande Grande", 150.0));
        listaDog.adiciona(new Cachorro(3, "Italo Belutt", "Grande", 120.0));
        listaDog.adiciona(new Cachorro(4, "Alan", "Pequeno", 26.0));
        listaDog.adiciona(new Cachorro(5, "Alencar", "Medio", 50.4));
        listaDog.adiciona(new Cachorro(6, "Bethooven", "Pequeno", 15.0));
        listaDog.adiciona(new Cachorro(7, "Lara", "Pequeno", 13.0));

        listaDog.exibe();
        gravaArquivoCsv(listaDog, "dogs");
        leExibeArquivoCsv("dogs");


    }
}
