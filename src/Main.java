public class Main {

    public static void main(String[] args) {
        Maquina maquina1 = new Maquina(1,50);


        int opcao;

        do{
            opcao = Menu.menu();

            switch (opcao){
                case 1:
                    if(maquina1.getListaProdutos().size() == 0){
                        System.out.println("Não existe bebidas na maquina! O admin que insira as bebidas.");
                    }else {
                        switchCliente(maquina1);
                    }
                    break;
                case 2:
                    boolean codigo = Tecnico.novoCodigo();
                    if(!codigo){
                        System.out.println("A Desligar o sistema!");
                        opcao = 0;
                        break;
                    } else{
                        switchAdmin(maquina1);
                    }
                    break;
                case 0:
                    Leitor.fecharTeclado();
                    break;
            }
        }while (opcao != 0);



    }


    private static void switchCliente(Maquina maquina1){
        int opcaoC;
        double valorCliente;

        do{
            opcaoC = Menu.subMenuCliente();

            switch (opcaoC){
                case 1:
                   valorCliente = Cliente.pedirBebida();
                    break;
                case 2:
                    valorCliente = Cliente.pedirBebida();
                    break;
                case 3:
                    valorCliente = Cliente.pedirBebida();
                    break;
                case 0:
                    break;
            }
        }while(opcaoC != 0);
    };

    private static void switchAdmin(Maquina maquina1){
        int opcaoA;

        do{
            opcaoA = Menu.subMenuTecnico();

            switch (opcaoA){
                case 1:
                    Tecnico.reiniciar(maquina1);
                    break;
                case 2:
                    Tecnico.registarBebidas(maquina1);
                    break;
                case 3:
                    Tecnico.introduzirSaldo(maquina1);
                    break;
                case 0:
                    break;
            }
        }while(opcaoA != 0);
    };

}