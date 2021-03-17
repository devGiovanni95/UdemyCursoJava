package classe;

public class valorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuicao por valor

        a++;
        b--;
        System.out.println(a + " " + b);

        Data1 d1 = new Data1(1,6,2021);
        Data1 d2 = d1; //atribuicao por referencia (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);


    }
    static void voltarDataValorPadrao(Data1 d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 2000;
    }

    static void alterarPrimitivo(int a){
        a++;
    }
//      mesmo sendo a mesma letra nao influi no que esta dentro
//      static void alterarPrimitivo(int c){
//        c++;
//    }
}
