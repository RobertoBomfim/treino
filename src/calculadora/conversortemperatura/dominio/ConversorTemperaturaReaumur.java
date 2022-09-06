package calculadora.conversortemperatura.dominio;

public class ConversorTemperaturaReaumur implements Conversor {
    private double celsius, re;

    public ConversorTemperaturaReaumur(double celsius) {
        this.celsius = celsius;
    }

    public double convertTempet(){
        re = celsius * 0.8;
        return re;
    }

    public void imprime() {
        System.out.println("A temperatura " + celsius + " em Celsius convertida para Réaumur é: " + convertTempet() + ".");
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}


