package calculadora.conversortemperatura.dominio;

public class ConversorTemperaturaFahrenheit implements Conversor {
    private double celsius, f;

    public ConversorTemperaturaFahrenheit(double celsius) {
        this.celsius = celsius;
    }

    public double convertTempet (){
        f = celsius * 1.8 + 32;
        return f;
    }



    public void imprime() {
        System.out.println("A temperatura " + celsius + " em Celsius convertida para Fahrenheit é: " + convertTempet() + ".");
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}


