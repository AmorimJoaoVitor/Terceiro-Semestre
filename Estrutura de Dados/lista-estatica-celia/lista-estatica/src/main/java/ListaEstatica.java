public class ListaEstatica {

    // Atributos
    private int[] vetor;
    private int nroElem;

    // Construtor
    public ListaEstatica(int capacidade) {
        vetor = new int[capacidade];
        nroElem = 0;
    }

    // Métodos

    /* Método adiciona - recebe como argumento um valor a ser inserido na lista */
    public Boolean adiciona(int valor) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista cheia!");
            return false;
        }
        else {
            vetor[nroElem++] = valor;
            return true;
        }
    }

    /* Método exibe - exibe os elementos da lista */
    public void exibe() {
        if (nroElem == 0) {
            System.out.println("\nA lista está vazia!");
        }
        else {
            System.out.println("\nLista:");
            for (int i = 0; i < nroElem; i++) {
                System.out.print(vetor[i] + "\t");
            }
            System.out.println();
        }
    }

    /* Método busca - recebe um valor a ser pesquisado no vetor, retornando
                      o seu índice ou -1 se não estiver no vetor.
     */
    public int busca(int valorPesquisado) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == valorPesquisado) {
                return i;
            }
        }
        return -1;
    }

    /* Método removePeloIndice - recebe o índice do valor a ser removido
       Retorna true se conseguiu remover e false caso contrário
     */
    public Boolean removePeloIndice (int indice) {
        if (indice < 0 || indice >= nroElem) {
            System.out.println("Índice inválido!");
            return false;
        }
        else {
            // Loop para "deslocar para a esquerda" os valores
            // do vetor sobrescrevendo o valor removido
            for (int i = indice; i < nroElem-1; i++) {
                vetor[i] = vetor[i+1];
            }
            // outra forma de fazer esse loop
//            for (int i = indice + 1; i < nroElem; i++) {
//                vetor[i-1] = vetor[i];
//            }
            nroElem--;
            return true;
        }
    }

    /* Método removeElemento - recebe o elemento a ser removido */
    public Boolean removeElemento(int valor) {
        return removePeloIndice(busca(valor));
    }

}
