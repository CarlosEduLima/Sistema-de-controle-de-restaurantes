package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Produtos p = new Produtos();

        Mesa[] mesas = new Mesa[10];
        mesas[0] = new Mesa();
        mesas[1] = new Mesa();
        mesas[2] = new Mesa();
        mesas[3] = new Mesa();
        mesas[4] = new Mesa();
        mesas[5] = new Mesa();
        mesas[6] = new Mesa();
        mesas[7] = new Mesa();
        mesas[8] = new Mesa();
        mesas[9] = new Mesa();

        int opt = 1;
        int i;

        while (opt != 0) {
            System.out.println("1 - add produto");
            System.out.println("2 - add pedido");
            System.out.println("3 - Remover Pedido");
            System.out.println("4 - Ver parcial");
            System.out.println("5 - Fechar Conta");
            System.out.println("6 - Checar disponibilidade da mesa");
            System.out.println("0 - sair");
            opt = entrada.nextInt();
            entrada.nextLine();
            switch (opt) {
                case 1:
                    System.out.println("Código e nome do produto ex: 123 lasanha");
                    String nomCod = entrada.nextLine();
                    System.out.println("Digite o Preço");
                    double preco = entrada.nextDouble();
                    p.produtos.put(nomCod, preco);
                    break;

                case 2:
                    System.out.println("Escolha a mesa de 1 a 10");
                    i = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Digite o cod e nome do produto");
                    String nc = entrada.nextLine();
                    mesas[i].AdicionarPedido(nc);
                    break;
                case 3:
                    System.out.println("Escolha a mesa");
                    i = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Digite o cod e nome do produto");
                    String ncpedido = entrada.nextLine();
                    mesas[i].removerpedidos(ncpedido);
                    break;
                case 4:
                    System.out.println("Escolha a mesa");
                    i = entrada.nextInt();
                    entrada.nextLine();
                    mesas[i].parcial();

                    break;
                case 5:
                    System.out.println("Escolha a mesa");
                    i = entrada.nextInt();
                    entrada.nextLine();
                    mesas[i].fecharConta();
                    break;
                case 6:
                    System.out.println("Escolha a mesa");
                    i = entrada.nextInt();
                    entrada.nextLine();
                    mesas[i].Disponibilidade();

            }

        }
    }

}
