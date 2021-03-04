package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data();

        data.dia = 02;
        data.mes = 03;
        data.ano = 2021;


        Data data2 = new Data();

        data2.dia = 25;
        data2.mes = 07;
        data2.ano = 1995;

        System.out.printf("A data de hoje é: %d/%d/%d ", data.dia,data.mes,data.ano);
        System.out.println();
        System.out.printf("A data de hoje é: %d/%d/%d ", data2.dia,data2.mes,data2.ano);

    }
}
