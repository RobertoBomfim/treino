package calculadora.conversortemperatura.dominio;

public class ConversorTemperaturaKelvin {
    private double celsius, k;

    public ConversorTemperaturaKelvin(double celsius) {
        this.celsius = celsius;
    }

    public double convertTempet(){
        k = celsius + 273.15;
        return k;
    }

    public void imprime() {
        System.out.println("A temperatura " + celsius + " em Celsius convertida para Kelvin é: " + convertTempet() + ".");
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}

