package exercicios.dominio;

public class DesafioClasseData {
   private int dia;
   private int mes;
   private int ano;

    public DesafioClasseData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "DesafioClasseData{" +
                "" + dia + '\'' +
                "/" + mes + '\'' +
                "/" + ano + '\'' +
                '}';
    }

}
