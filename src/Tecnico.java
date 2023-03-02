

public class Tecnico {

    public static void registarBebidas(Maquina maquina) {
        String nomeB = "";
        double valor;
        int stock;
        boolean validacao;

        nomeB = Leitor.lerString("Insira o nome da bebdida: ");
        valor = Leitor.lerDouble(0, 2, "Insira o valor do produto: ");
        stock = Leitor.lerInteiro(0, 20, "Insira o stock da bebida: ", "");

        do {
            validacao = validacaoBebidaInserida(nomeB, maquina);
        } while (!validacao);

        ProdutoBebida produto = new ProdutoBebida(nomeB, valor, stock);
        maquina.adicionarBebida(produto);

    }

    private static boolean validacaoBebidaInserida(String nome, Maquina maquina) {
        for (ProdutoBebida produto : maquina.getListaProdutos()) {
            if (nome.equals(produto.getNome())) {
                System.out.println("A bebida já foi introduzida!");
                return false;
            }
        }
        return true;
    }


    public static void introduzirSaldo(Maquina maquina) {
        double novoSaldo;

        System.out.println("O saldo actual da maquina é: " + maquina.getSaldoMaquina() + "€.");
        if (maquina.getSaldoMaquina() > 30) {
            System.out.println("Maximo de valor ultrapassado (30)");
        } else {
            novoSaldo = Leitor.lerDouble(0, 30, "Introduza mais um montante: ");
            maquina.aumentarSaldo(novoSaldo);
        }

        System.out.println("Novo saldo é de:" + maquina.getSaldoMaquina() + "€.");
    }


    public static void reiniciar(Maquina maquina) {
        int pergunta;

        pergunta = Leitor.lerInteiro(1, 2, "Deseja Reiniciar a maquina? [1-sim] [2-nao]", "");

        if (pergunta == 1) {
            maquina.setSaldoMaquina(0);
            maquina.getListaProdutos().clear();
            System.out.println("Maquina Reiniada com sucesso!");
        }

    }

    public static boolean novoCodigo(){
        int codigoMaquina = 4141;
        int codigoIntroduzido;
        int contador = 0;
        boolean valida = false;

        do {
            codigoIntroduzido = Leitor.lerInteiro(0, 9999, "Introduza o codigo de admin: ", "Valor introduzido não é valido!");
            if (codigoMaquina != codigoIntroduzido) {
                System.out.println("O codigo errado!");
                contador++;
                if(contador == 3){
                    System.out.println("Introduziu o pin errado 3 vezes!");
                }
            } else {
                System.out.println("Pin correcto!");
                valida = true;
                break;
            }
        }while(contador != 3);

        return valida;
    }
}
