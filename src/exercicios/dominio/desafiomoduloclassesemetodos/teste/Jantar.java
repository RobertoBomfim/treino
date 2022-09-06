package exercicios.dominio.desafiomoduloclassesemetodos.teste;

import exercicios.dominio.desafiomoduloclassesemetodos.dominio.Comida;
import exercicios.dominio.desafiomoduloclassesemetodos.dominio.Pessoa;

public class Jantar {
    public static void main(String[] args) {
       Comida comida1 = new Comida("Macarrão", 0.250);
       Comida comida2 = new Comida("Feijoada", 0.5);

        Pessoa pessoa1 = new Pessoa("Irineu", 99.250);

        System.out.println(pessoa1.apresentar());
        pessoa1.comer(comida1);
        System.out.println(pessoa1.apresentar());
        pessoa1.comer(comida2);
        System.out.println(pessoa1.apresentar());
    }

}
