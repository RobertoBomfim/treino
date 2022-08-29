package exercicios.conversortemperatura.teste;

import exercicios.conversortemperatura.dominio.*;

public class TesteConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaKelvin temperaturaKelvin = new ConversorTemperaturaKelvin(40);
        ConversorTemperaturaReaumur temperaturaReaumur = new ConversorTemperaturaReaumur(50);
        ConversorTemperaturaRankine temperaturaRankine = new ConversorTemperaturaRankine(60);
        ConversorTemperaturaFahrenheit temperaturaFahrenheit = new ConversorTemperaturaFahrenheit(70);
        //temperatura.setCelsius(45);
        temperaturaKelvin.imprime();
        temperaturaReaumur.imprime();
        temperaturaRankine.imprime();
        temperaturaFahrenheit.imprime();
        //System.out.println(temperatura.kelvin());

    }
}