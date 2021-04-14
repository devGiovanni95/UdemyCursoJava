package oo.heranca.desafio2;

public class Ferrari extends Carro {

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 100;
    }

//  @Override
//  mostra que voce realmente esta sobreescrevendo o metodo
//
//    @Override
//    void acerelar() {
//        velocidadeAtual += 15;
//    }
}
