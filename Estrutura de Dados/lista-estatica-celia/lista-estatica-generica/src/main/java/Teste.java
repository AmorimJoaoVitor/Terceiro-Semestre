public class Teste {
    public static void main(String[] args) {
        Object elemento;
        int indiceRetornado;
        ListaObj<String> lista = new ListaObj(5);

        lista.adiciona("10");
        lista.adiciona("20");
        lista.adiciona("30");
        lista.adiciona("40");
        lista.adiciona("50");
        System.out.println("Exibindo lista");
        lista.exibe();

        lista.removeElemento("40");

        System.out.println(lista.getTamanho());
        System.out.println(lista.getElemento(1));

        lista.limpa();
        lista.exibe();

    }
}
