public class Menu {

    public static int menu() {
        System.out.println("\n\t\t\t Bem-vindo\n");
        System.out.println("1. Escolha a bebida");
        System.out.println("2. Admin");
        System.out.println("0. Sair da aplicação");
        System.out.print("\n\t\tSelecione a opcao:");
        return Leitor.lerInteiro(0, 2, "", "O número tem de estar entre 0 e 2\n Tente outra vez: ");
    };

    public static int subMenuCliente() {
        System.out.println("\n\t\t\t Bebida a ser escolhida\n");
        System.out.println("1. Coca-Cola--(70cent)");
        System.out.println("2. Pepsi------(65cent)");
        System.out.println("3. Ice-Tea----(60cent)");
        System.out.println("0. Cancelar");
        System.out.print("\n\t\tSelecione a opcao:");
        return Leitor.lerInteiro(0, 3, "", "O número tem de estar entre 0 e 3\n Tente outra vez: ");
    };

    public static int subMenuTecnico() {
        System.out.println("\n\t\t\t Administrador\n");
        System.out.println("1. Reiniciar a Maquina");
        System.out.println("2. Introduzir Bebidas");
        System.out.println("3. Introduzir saldo");
        System.out.println("0. Sair");
        System.out.print("\n\t\tSelecione a opcao:");
        return Leitor.lerInteiro(0, 3, "", "O número tem de estar entre 0 e 3\n Tente outra vez: ");
    };

    public static int subMenuMoedas() {
        System.out.println("\nEscolha as moedas a inserir");
        System.out.println("1. 0,5 cent");
        System.out.println("2. 0,10 cent");
        System.out.println("3. 0,20 cent");
        System.out.println("4. 0,50 cent");
        System.out.println("0. cancelar");
        System.out.print("\n\t\tSelecione a opcao:");
        return Leitor.lerInteiro(0, 4, "", "O número tem de estar entre 0 e 4\n Tente outra vez: ");
    };
}
