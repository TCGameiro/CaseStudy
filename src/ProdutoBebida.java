public class ProdutoBebida {

    private String nome;
    private double valor;
    private int stock;

    public ProdutoBebida(String nome, double valor, int stock) {
        this.nome = nome;
        this.valor = valor;
        this.stock = stock;
    }


    public String getNome() {
        return nome;
    }
}
