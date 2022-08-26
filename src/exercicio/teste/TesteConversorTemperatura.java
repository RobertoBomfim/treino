package exercicio.teste;

import exercicio.dominio.ConversorTemperatura;

public class TesteConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura temperatura = new ConversorTemperatura(45);
        //temperatura.setCelsius(45);
        temperatura.imprime();
        //System.out.println(temperatura.kelvin());

    }
}