package classe;

public class Data1 {

    int dia;
    int mes;
    int ano;

    Data1() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data1(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia,mes,ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
