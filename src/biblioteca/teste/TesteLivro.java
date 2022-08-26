package biblioteca.teste;

import biblioteca.dominio.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro.contador = 2;
        Livro livro01 = new Livro("Fundação", "Isaac Asimov", 1942);
        Livro livro02 = new Livro("Fundação", "Isaac Asimov", 1942);

        //String autor = livro01.getAutor();
        //livro01.setTitulo("Dracula");
        livro01.imprime();
        Livro.contador = 3;
        livro01.imprime();
        livro02.imprime();
        //System.out.println(livro01.getAno());
        //System.out.println(autor);
    }
}
