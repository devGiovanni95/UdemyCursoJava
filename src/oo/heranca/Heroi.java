package oo.heranca;

public class Heroi extends Jogador {

    //por colocar na classe Pai o contrutor de Jogador
    // determinando que e ne4cessario estar declarar as posicoes
    // por criacao, temos que criar um costrutos explicito mostrando
    // explicitamente os valores pedidos no constrututo da classe PAI

    Heroi(int x, int y){
        super(x,y);
    }
//    boolean atacar (Jogador oponente){
//
//        int deltaX = Math.abs(x - oponente.x); // math absoluto nao importa se o numero e positivo ou negativo
//        int deltaY = Math.abs(y - oponente.y);
//
//        if (deltaX == 0 && deltaY == 1) {
//            oponente.vida -= 20;
//            return true;
//        }else if(deltaX == 1 && deltaY == 0){
//            oponente.vida -= 20;
//            return true;
//        }else {
//            return false;
//        }
//    }

    //reutilizando o codigo

    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);

        return ataque1 || ataque2 || ataque3;
    }

}
