package exercicios.dominio;

public class DesafioClasseDataMetodo {
   private int dia;
   private int mes;
   private int ano;

    public DesafioClasseDataMetodo(int dia, int mes, int ano) {
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

    public String obterDataFormatada(){
        return String.format("%d/%d/%d",dia, mes, ano);
    }
}
