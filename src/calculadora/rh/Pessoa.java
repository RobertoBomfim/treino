package calculadora.rh;

import java.util.Objects;

public class Pessoa {

    protected String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        if( Objects.isNull(nome))
            throw new RuntimeException("Error");
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {


        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
