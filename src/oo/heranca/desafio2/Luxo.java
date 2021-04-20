package oo.heranca.desafio2;

public interface Luxo {

    void ligarAr();

    void desligarAr();

    //int velocidadeDoAr();
    //depois de implementarmos o nivel do ar automaticamente precisamos implementar
    // tambem na classe ferrari pois ela esta ligada diretamente com a interface criada na sua implementação
    // E FERRARI É UMA CLASSE CONCRETA POR ISSO PRECISA IMPLEMENTAR

    //    ou podemos criar uma implementação padrao
    // default = comportamento padrao

    //deste modo nao é obrigatorio ser implementada pois se o ar estiver ligado por padrão recebe o valor pre definido de 1

    default int velocidadeDoAr(){
        return  1;
    }



}
