package desafios.desafioheranca.dominio;

public class Carro {
    protected int velocidadeAtual;

    public Carro(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual += 10;
    }

    public void freiar() {
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }
        else {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
