package desafios.desafiocomposição.dominio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private final List<Item> itens = new ArrayList<>();

    public void adicionarItem(Produto p, int qtde){
        this.itens.add(new Item(p, qtde));
    }

    public void adicionarItem(String nome, double preco, int qtde){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    public double obterValorTotal(){
        double total = 0;

        for (Item item : itens){
            total += item.getQuantidade() * item.produto.getPreco();
        }

        return total;
    }

}
