package exercicio.dominio;

public class ConversorTemperatura {
    private double celsius, k, re, ra, f;

    public ConversorTemperatura(double celsius) {
        this.celsius = celsius;
    }

    public double kelvin(){
        k = celsius + 273.15;
        return k;
    }

    public double reaumur(){
        re = celsius * 0.8;
        return re;
    }

    public double rankine(){
        ra = celsius * 1.8 + 32 + 459.67;
        return ra;
    }

    public double fahrenheit (){
        f = celsius * 1.8 + 32;
        return f;
    }

    public void imprime() {
        System.out.println("A temperatura " + celsius + " em Celsius convertida para Kelvin é: " + kelvin() + ".");
        System.out.println("A temperatura " + celsius + " em Celsius convertida para Réaumur é: " + reaumur() + ".");
        System.out.println("A temperatura " + celsius + " em Celsius convertida para Rankine é: " + rankine() + ".");
        System.out.println("A temperatura " + celsius + " em Celsius convertida para Fahrenheit é: " + fahrenheit() + ".");
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
