package desafios.desafioseminario.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void imprime(){
        System.out.println("-------------");
        System.out.println("Professor " + this.nome);
        if (seminarios == null) return;
        System.out.println("## Seminários cadastrados ##");
        for(Seminario seminario : this.seminarios){
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getEstudantes() == null || seminario.getEstudantes().length == 0) continue;
            System.out.println("## Estudantes ##");
            for (Estudante estudante : seminario.getEstudantes()){
                System.out.println("Estudane: " + estudante.getNome() + " idade: " + estudante.getIdade());

            }
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
