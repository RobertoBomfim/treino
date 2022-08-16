package rh;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Roberto", 29);
        String nome = pessoa1.getNome();
        int idade = pessoa1.getIdade();

        System.out.println(nome);
        System.out.println(idade);
    }
}
