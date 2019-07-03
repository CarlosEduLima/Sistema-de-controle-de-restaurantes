package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mesa extends Produtos {

    boolean disponivel = true;
    double total = 0;

    HashMap<String, Double> pedidos = new HashMap<>();
    //HashMap<String, Double> produtos = new HashMap<>();

    public void AdicionarPedido(String nomecod) {
        disponivel = false;
        produtos.keySet().stream().filter((i) -> (nomecod.equals(i))).forEachOrdered((i) -> {
            pedidos.put(i, produtos.get(i));
            total += pedidos.get(i);
        });
        System.out.println("Pedido adiconado");
    }

    public void removerpedidos(String ncpedido) {
        for (Iterator<Map.Entry<String, Double>> it = pedidos.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, Double> entry = it.next();
            if (entry.getKey().equals(ncpedido)) {
                it.remove();
                total -= entry.getValue();
            }
            
        }
        System.out.println("Pedido removido");
    }

    public void Disponibilidade() {
        if (disponivel == true) {
            System.out.println("Mesa disponivel");
        } else {
            System.out.println("Mesa ocupada");
        }
    }

    public void parcial() {

        System.out.println(" Total: " + total);
    }

    public void fecharConta() {
        disponivel = true;
        System.out.println("Nota Fiscal:");
        pedidos.keySet().stream().map((i) -> {

            return i;
        }).forEachOrdered((i) -> {
            System.out.println("Produto: " + i + " Valor: " + pedidos.get(i));
        });
        double gorjeta = total * 0.10;
        System.out.println("Gorjeta: " + gorjeta);
        System.out.println("Tota a pagar: " + (total + gorjeta));
    }

}
