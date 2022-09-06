package exercicios.dominio.desafiomoduloclassesemetodos.dominio;

public class Pessoa {

    private String nome;
    private double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida){
        if (comida != null) {
            this.peso += comida.peso;
        }
    }

    public String apresentar(){
        return "Olá eu sou o " + nome + " e peso " + peso;
    }
}
