package exercicios.conversortemperatura.dominio;

public class ConversorTemperaturaRankine {
    private double celsius, ra;

    public ConversorTemperaturaRankine(double celsius) {
        this.celsius = celsius;
    }

    public double convertTempet(){
        ra = celsius * 1.8 + 32 + 459.67;
        return ra;
    }

    public void imprime() {
        System.out.println("A temperatura " + celsius + " em Celsius convertida para Rankine é: " + convertTempet() + ".");
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}


