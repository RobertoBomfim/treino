package desafios.desafioheranca.dominio;

public class Mustang extends Carro {

    public Mustang(int velocidadeAtual) {
        super(velocidadeAtual);
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 20;
    }

    @Override
    public void freiar() {
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 10;
        }
        else {
            velocidadeAtual = 0;
        }
    }
}