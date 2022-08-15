package calculadora.operacoes;

public class Operacoes{

    public static void soma() {
        int num1 = 10;
        int num2 = 2;
        int resultado = num1 + num2;
        System.out.printf("%d + %d igual a %d.\n", num1, num2, resultado);
    }

    public static void subtracao() {
        int num1 = 15;
        int num2 = 8;
        int resultado = num1 - num2;
        System.out.printf("%d - %d igual a %d.\n", num1, num2, resultado);
    }

    public static void multiplicacao() {
        int num1 = 9;
        int num2 = 3;
        int resultado = num1 * num2;
        System.out.printf("%d x %d igual a %d.\n", num1, num2, resultado);
    }

    public static void divisao() {
        int num1 = 16;
        int num2 = 4;
        int resultado = num1 / num2;
        System.out.printf("%d / %d igual a %d.\n", num1, num2, resultado);
    }

    public static void resto() {
        int num1 = 11;
        int num2 = 2;
        int resultado = num1 % num2;
        System.out.printf("Resto de %d por %d igual a %d.\n", num1, num2, resultado);
    }
}

