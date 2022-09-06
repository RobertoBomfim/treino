package exercicios.teste;

import exercicios.dominio.DesafioClasseData;

public class DesafioClasseDataTeste {
    public static void main(String[] args) {
        DesafioClasseData desafioClasseData = new DesafioClasseData(25, 05, 1993);
        DesafioClasseData desafioClasseData2 = new DesafioClasseData(06, 9, 2022);

        System.out.println(desafioClasseData);
        System.out.println(desafioClasseData2);
    }
}
