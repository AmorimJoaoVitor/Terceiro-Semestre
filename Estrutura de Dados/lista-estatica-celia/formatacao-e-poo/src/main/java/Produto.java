public class Produto {
    private int codProduto;
    private String nome;
    private Double preco;
    private String avaliacao;
    private int quantidadeVendida = 0;

    public Produto(int codProduto, String nome, Double preco, String avaliacao) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.avaliacao = avaliacao;
    }

    public void comprar(int quantidadeComprada){
        this.quantidadeVendida += quantidadeComprada;
    }

    public Double calcularFaturamento(int quantidadeComprada){
        return quantidadeVendida * Double.valueOf(quantidadeComprada);
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
}


