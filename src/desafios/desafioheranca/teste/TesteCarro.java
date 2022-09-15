package desafios.desafioheranca.teste;

import desafios.desafioheranca.dominio.Carro;
import desafios.desafioheranca.dominio.Logan;
import desafios.desafioheranca.dominio.Mustang;

public class TesteCarro {
    public static void main(String[] args) {

        Carro c1 = new Logan(150);
        Carro c2 = new Mustang(200);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("--------------");

        c1.acelerar();
        System.out.println(c1);
        c2.acelerar();
        System.out.println(c2);

        System.out.println("--------------");

        c1.freiar();
        System.out.println(c1);
        c2.freiar();
        System.out.println(c2);
    }
}
