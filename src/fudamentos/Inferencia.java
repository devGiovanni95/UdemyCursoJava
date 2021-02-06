package fudamentos;

public class Inferencia {
    public static void main(String[] args) {

        double a = 4.5; // declaração e inicialização
        System.out.println(a);

        // a = "...";

        var b = 4.6;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro Texto";
        System.out.println(c);

        // c =  4.5;    nao da certo pois se iniciou como uma string e nao pode mudar o tipo primitivo dela

        double d ; // variavel foi declarada
        d = 123.65; // variavel foi inicializada
        System.out.println(d); // variavel foi usada !

        var e = 123.65;
        System.out.println(e);
     /*   var e ;
        e = 123;
        variavel usando metodo var necessitam ser declarada e inicializada na mesma linha
      */

        var f = 12; // inteiro
        // f = 12.01; depois de colocarmor o valor inteiro nao conseguimos mudar para outro tipo no caso double
        System.out.println(f);
    }
}
