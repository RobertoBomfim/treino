package biblioteca.teste;

import biblioteca.dominio.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro01 = new Livro("Fundação", "Isaac Asimov", 1942);
        //String autor = livro01.getAutor();
        //livro01.setTitulo("Dracula");
        livro01.imprime();
        //System.out.println(livro01.getAno());
        //System.out.println(autor);
    }
}
