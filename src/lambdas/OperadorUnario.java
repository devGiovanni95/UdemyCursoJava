package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadradro = n -> n * n;

        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadradro)
                .apply(0);
        System.out.println(resultado1);

        //compose pega debaixo para cima
        int resultado2 = aoQuadradro
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0);
        System.out.println(resultado2);
    }
}
