package exercicios.teste;

import exercicios.dominio.DesafioClasseData;
import exercicios.dominio.DesafioClasseDataMetodo;

public class DesafioClasseDataMetodoTeste {
    public static void main(String[] args) {
        DesafioClasseDataMetodo desafioClasseDataMetodo = new DesafioClasseDataMetodo(25, 05, 1993);
        DesafioClasseDataMetodo desafioClasseDataMetodo2 = new DesafioClasseDataMetodo(06, 9, 2022);

        System.out.println(desafioClasseDataMetodo.obterDataFormatada());
        System.out.println(desafioClasseDataMetodo2.obterDataFormatada());
    }
}
