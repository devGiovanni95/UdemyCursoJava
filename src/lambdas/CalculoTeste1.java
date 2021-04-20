package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {

//FORMA GENERICA
//        Calculo soma = new Somar();
//        Calculo multiplicacao = new Multiplicar();
//
//        System.out.println(soma.executar(2,3));
//        System.out.println(multiplicacao.executar(2,3));

//UTILIZANDO O POLIMORFISMO

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2,3));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(2,3));
    }
}
