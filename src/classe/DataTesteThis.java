package classe;

public class DataTesteThis {
    public static void main(String[] args) {
        DataThis data = new DataThis();

        var data2 = new DataThis(31,12, 2020);

        String dataFormatada1 = data.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(data2.obterDataFormatada());

        data.imprimirDataFormatada();
        data2.imprimirDataFormatada();

    }
}
