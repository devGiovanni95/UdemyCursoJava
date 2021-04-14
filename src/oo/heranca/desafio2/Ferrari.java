package oo.heranca.desafio2;

public class Ferrari extends Carro {

    //colocando pro metodo ser publico para qualquer outra classe poder acessar
    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
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

//podemos aumentar o nivel de visibilidade nos casos de sobrescrever metodos,
// neste caso colocando de protected para public ae nao da nenhum erro
// mas se fossemos diminuir o nivel de acesso ae daria um erro


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
