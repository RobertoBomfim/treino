package geral.teste;

public class FraseTeste {
    public static void letrasMaiusculas() throws NullPointerException {
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

    public static void main(String[] args) {
        try {
            letrasMaiusculas();
        } catch (NullPointerException e) {
            System.out.println("Ocorreu um NullPointerException ao executar o método aumentarLetras() " + e);
        }
    }
}
