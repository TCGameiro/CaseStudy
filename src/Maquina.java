import java.util.LinkedList;

public class Maquina {

    private int ID;
    private double saldoMaquina;
    public LinkedList<ProdutoBebida> listaProdutos;

    private int cinquentaQuant;
    private int vinteQuant;
    private int dezQuant;
    private int cincoQuant;


    public Maquina(int ID, double saldoMaquina){
        this.ID = ID;
        this.saldoMaquina = saldoMaquina;
        listaProdutos = new LinkedList<>();
    };


    public void setCinquentaQuant(int cinquentaQuant) {
        this.cinquentaQuant = cinquentaQuant;
    }

    public void setVinteQuant(int vinteQuant) {
        this.vinteQuant = vinteQuant;
    }

    public void setDezQuant(int dezQuant) {
        this.dezQuant = dezQuant;
    }

    public void setCincoQuant(int cincoQuant) {
        this.cincoQuant = cincoQuant;
    }

    public double getSaldoMaquina() {
        return saldoMaquina;
    }

    public void setSaldoMaquina(double saldoMaquina) {
        this.saldoMaquina = saldoMaquina;
    }

    public LinkedList<ProdutoBebida> getListaProdutos() {
        return listaProdutos;
    };

    public void adicionarBebida(ProdutoBebida produto){
        if(produto == null || listaProdutos.contains(produto)){
            return;
        }
        listaProdutos.add(produto);
    }

    public void aumentarSaldo(double valor){
        this.saldoMaquina += valor;
    }

    public void subtrairSaldo(double valor){
        this.saldoMaquina -= valor;
    }

}
