public class Teste {

    public static void main(String[] args) {
        int indRetornado;
        ListaEstatica lista = new ListaEstatica(5);

        lista.exibe();
        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);
        lista.exibe();

        lista.adiciona(40);
        lista.adiciona(50);
        lista.adiciona(60);
        lista.exibe();

        indRetornado = lista.busca(30);
        if (indRetornado == -1) {
            System.out.println("Valor 30 não foi encontrado");
        }
        else {
            System.out.println("Valor 30 encontrado no índice " +
                                indRetornado);
        }

        indRetornado = lista.busca(70);
        if (indRetornado == -1) {
            System.out.println("Valor 70 não foi encontrado");
        }
        else {
            System.out.println("Valor 70 encontrado no índice " +
                    indRetornado);
        }

        if (lista.removePeloIndice(1)) {
            System.out.println("Valor do índice 1 removido com sucesso");
        }
        else {
            System.out.println("Remoção indevida");
        }

        if (lista.removePeloIndice(7)) {
            System.out.println("Valor do índice 7 removido com sucesso");
        }
        else {
            System.out.println("Remoção indevida");
        }

        lista.exibe();
        if (lista.removeElemento(10)) {
            System.out.println("Valor 10 removido com sucesso");
        }
        else {
            System.out.println("Remoção indevida");
        }

        if (lista.removeElemento(200)) {
            System.out.println("Valor 200 removido com sucesso");
        }
        else {
            System.out.println("Remoção indevida");
        }

        lista.exibe();
        lista.adiciona(60);
        lista.exibe();
   }
}
