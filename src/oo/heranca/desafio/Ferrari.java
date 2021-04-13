package oo.heranca.desafio;

public class Ferrari extends Carro{

    //  @Override
    //  mostra que voce realmente esta sobreescrevendo o metodo

    @Override
    void acerelar() {
        velocidadeAtual += 15;
    }
}
