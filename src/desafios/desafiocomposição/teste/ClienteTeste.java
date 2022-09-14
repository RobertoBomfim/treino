package desafios.desafiocomposição.teste;

import desafios.desafiocomposição.dominio.Cliente;
import desafios.desafiocomposição.dominio.Compra;
import desafios.desafiocomposição.dominio.Item;
import desafios.desafiocomposição.dominio.Produto;

public class ClienteTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 998.90), 1);

        Cliente cliente1 = new Cliente("Roberto");
        cliente1.adicionarCompra(compra1);
        cliente1.compras.add(compra2);

        System.out.println(cliente1.getNome() + " gastou " + cliente1.obterValorTotal());
    }
}
