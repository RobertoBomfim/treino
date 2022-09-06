package calculadora.conversortemperatura.dominio;

public class CalcularTemperaturaTeste {
    public static void main(String[] args) {
        ConversorTemperaturaFahrenheit conversorTemperaturaFahrenheit = new ConversorTemperaturaFahrenheit(10);
        ConversorTemperaturaKelvin conversorTemperaturaKelvin = new  ConversorTemperaturaKelvin(10);
        double resultado = calcularTemperatura(conversorTemperaturaFahrenheit);
        System.out.println(resultado);

    }

    private static double calcularTemperatura(Conversor conversor){
        return conversor.convertTempet();
    }
}
