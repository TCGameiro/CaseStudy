public class Cliente {

    public static double pedirBebida() {
        double valorTotal = 0;
        int opcao;

        do {

           opcao = Menu.subMenuMoedas();

           switch (opcao){
               case 1:
                   valorTotal += 0.05;
                   break;
               case 2:
                   valorTotal += 0.10;
                   break;
               case 3:
                   valorTotal += 0.20;
                   break;
               case 4:
                   valorTotal += 0.50;
                   break;
               case 0:
                   System.out.println("Operação cancelada!");
                   valorTotal = 0;
                   break;
           }

            System.out.println("Total: " + valorTotal);

           if(valorTotal >= 1.0){
               break;
            }

        } while ( opcao != 0);



        return valorTotal;
    }

}
