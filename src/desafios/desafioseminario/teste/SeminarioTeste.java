package desafios.desafioseminario.teste;

import desafios.desafioseminario.dominio.Estudante;
import desafios.desafioseminario.dominio.Local;
import desafios.desafioseminario.dominio.Professor;
import desafios.desafioseminario.dominio.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {
        Local local1 = new Local("Salvador-BA");
        Estudante estudante1 = new Estudante("Itachi", 25);
        Professor professor1 = new Professor("Jiraya", "Ninjutsu");
        Estudante[] estudantesDoSeminario = {estudante1};
        Seminario seminario1 = new Seminario("Java virado no Jiraya.", estudantesDoSeminario, local1);
        Seminario[] seminariosDisponiveis = {seminario1};

        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprime();

    }
}