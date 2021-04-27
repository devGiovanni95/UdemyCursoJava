package lambdas.desafio;

import lambdas.desafio.Produto;

import java.util.function.*;

public class DesafioBinaryOperator {

    public static void main(String[] args) {

        /*
         * 1. A partir do produto calcular o preço real (com desconto)
         * 2. Imposto Municipal : >= 2500 (8,5%) / < 2500 (Isento)
         * 3. Frete: >= 3000 ( 100 ) / < 3000 ( 50 )
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,55
         */
//
//        BinaryOperator<Double> precoComDesconto =
//                (Double  valor, Double desconto ) -> valor * (1 - desconto);
//
//        System.out.println(precoComDesconto.apply(p.preco, p.desconto));
//
//        BiFunction<Double,Double,Double> precoComDesconto =  (valor, desconto ) -> {
//            double valorFinal = p.preco * (1 - p.desconto);
//            return valorFinal;
//        };
//
//        System.out.println();

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        Function<Double, String> arredondar = preco -> String
                .valueOf(String.format("%.2f", preco))
                .replace(".", ",");
        UnaryOperator<String> formatar = preco -> "R$" + preco;

        Produto p = new Produto("iPad", 3235.89, 0.13);
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preco final é " + preco);
    }
}
