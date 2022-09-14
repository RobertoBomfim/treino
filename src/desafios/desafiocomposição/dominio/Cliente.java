package desafios.desafiocomposição.dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private final String nome;
    public final List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

    public double obterValorTotal(){
        double total = 0;

        for (Compra compra : compras){
            total += compra.obterValorTotal();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

}
