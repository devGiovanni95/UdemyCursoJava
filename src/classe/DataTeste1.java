package classe;

public class DataTeste1 {
    public static void main(String[] args) {
        Data1 data = new Data1();

        var data2 = new Data1(31,12, 2020);

        String dataFormatada1 = data.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(data2.obterDataFormatada());

        data.imprimirDataFormatada();
        data2.imprimirDataFormatada();

    }
}
