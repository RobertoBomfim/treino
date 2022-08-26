package biblioteca.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public static int contador = 0;

    //Método construtor, quando parâmetro é passadoé obrigatório instanciar objeto com argumentos.
    public Livro(String titulo,String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void imprime(){
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.ano);
        System.out.println(Livro.contador);
        System.out.println("----------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
}
